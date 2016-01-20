import java.util.ArrayList;
import java.util.Iterator;

import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class Connection_impl extends ConnectionPOA {
	private ArrayList<String> clientList = new ArrayList<String>();
	private ArrayList<String> receiverList = new ArrayList<String>();
	private ArrayList<String> senderList = new ArrayList<String>();
	private ArrayList<String> allmessages = new ArrayList<String>();
	
	
	
	@Override
	public Dialogue connect(String pseudo) {
		// TODO Auto-generated method stub
		if (!clientList.contains(pseudo)) {
			clientList.add(pseudo);		
		}		
	    System.out.println(pseudo + " connection is OK!");
        Dialogue_impl comp = new Dialogue_impl(pseudo,clientList,receiverList,senderList,allmessages );
        allmessages=comp.updateMessages();
        receiverList=comp.updateReceivers();
        senderList=comp.updateSenders();
		Dialogue dial=null;
		try {
			//实例化dialogue的方法，是先将Dialogue_impl类的object与 reference 相连
		dial=DialogueHelper.narrow(_default_POA().servant_to_reference(comp));
			
		} catch (ServantNotActive e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WrongPolicy e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dial;
	
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
