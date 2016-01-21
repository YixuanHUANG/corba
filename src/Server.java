import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.ORBPackage.InvalidName;

public class Server {

	public static void main(String args[]) {

		java.util.Properties props = System.getProperties();

		int status = 0;

		ORB orb = null;

		try {
			orb = ORB.init(args, props);
			run(orb);
		} catch (Exception ex) {
			ex.printStackTrace();
			status = 1;
		}

		if (orb != null) {
			try {
				orb.destroy();
			} catch (Exception ex) {
				ex.printStackTrace();
				status = 1;
			}
		}

		System.exit(status);
	}

	static int run(ORB orb) throws Exception {
		org.omg.CORBA.Object obj;
		org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper
				.narrow(orb.resolve_initial_references("RootPOA"));

		org.omg.PortableServer.POAManager manager = rootPOA.the_POAManager();
		
		Connection_impl ConnectionImpl = new Connection_impl();

		obj = rootPOA.servant_to_reference(ConnectionImpl);
		Connection Connection = ConnectionHelper.narrow(obj);

		obj = orb.resolve_initial_references("NameService");
		NamingContext ctx = NamingContextHelper.narrow(obj);

		if (ctx == null) {
			System.out.println("Le composant NameService n'est pas un repertoire");
			return 0;
		}

		NameComponent[] name = new NameComponent[1];

		name[0] = new NameComponent("Connection", "");

		ctx.rebind(name, Connection);
		System.out.println("Server ready and waiting");

		manager.activate();
		orb.run();

		return 0;
	}
}
