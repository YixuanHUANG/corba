import java.util.ArrayList;
import java.util.Arrays;

import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.ORBPackage.InvalidName;

public class Client {

	public static void main(String args[]) {
		java.util.Properties props = System.getProperties();

		int status = 0;
		org.omg.CORBA.ORB orb = null;

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

	static void run(ORB orb) throws Exception {
		org.omg.CORBA.Object obj = null;
		org.omg.CORBA.Object obj2;
		org.omg.PortableServer.POA rootPOA = org.omg.PortableServer.POAHelper
				.narrow(orb.resolve_initial_references("RootPOA"));
		org.omg.PortableServer.POAManager manager = rootPOA.the_POAManager();
		Receiver_impl ReceiverImpl = new Receiver_impl();
		obj2 = rootPOA.servant_to_reference(ReceiverImpl);
		Receiver Receiver = ReceiverHelper.narrow(obj2);
		obj2 = orb.resolve_initial_references("NameService");
		NamingContext ctx2 = NamingContextHelper.narrow(obj2);
		
		if (ctx2 == null) {
			System.out.println("Le composant NameService n'est pas un repertoire");
			System.exit(1);
		}
		NameComponent[] name2 = new NameComponent[1];
		name2[0] = new NameComponent("Receiver", "");
		ctx2.rebind(name2, Receiver);
		System.out.println("Receiver is created!");
		manager.activate();
		orb.run();
		
		try {

			obj = orb.resolve_initial_references("NameService");
		} catch (InvalidName e) {
			e.printStackTrace();
			System.exit(1);
		}

		NamingContext ctx = NamingContextHelper.narrow(obj);

		if (ctx == null) {
			System.out.println("Le composant NameService n'est pas un repertoire");
			System.exit(1);
		}

		NameComponent[] name = new NameComponent[1];

		name[0] = new NameComponent("Connection", "");

		try {
			obj = ctx.resolve(name);
		} catch (Exception e) {
			System.out.println("Composant inconnu");
			e.printStackTrace();
			System.exit(1);
		}
		
		Connection conn = ConnectionHelper.narrow(obj);
		Receiver TitiRcv = ReceiverHelper.narrow(obj2);	
		Emitter TitiEmt = conn.connect("Titi", TitiRcv);
		TitiEmt.sendMessage("Tutu", "Salut Tutu!");		
		

	}

}
