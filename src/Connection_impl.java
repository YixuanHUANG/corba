import java.util.ArrayList;
import java.util.Iterator;

import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class Connection_impl extends ConnectionPOA {
	private ArrayList<String> clientList = new ArrayList<String>();
	private String[] clients;

	@Override
	public Emitter connect(String pseudo, Receiver rcv) {
		    clientList.add(pseudo);
		    clients=(String[])clientList.toArray();
		    rcv.initClients(clients);
		    
		    Emitter_impl comp = new Emitter_impl(pseudo);
	       
		    Emitter emitter=null;
			try {
			emitter=EmitterHelper.narrow(_default_POA().servant_to_reference(comp));
				
			} catch (ServantNotActive e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (WrongPolicy e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return emitter;		
		}
	

	@Override
	public void disconnect(String pseudo) {
		// TODO Auto-generated method stub
				Iterator<String> it = clientList.iterator();
				while (it.hasNext()) {
					String s = it.next();
					if (s.equals(pseudo)) {
						it.remove();
					}
				}
				System.out.println(pseudo + " disconnection!");
		
	}
	
	}
	
	
	

