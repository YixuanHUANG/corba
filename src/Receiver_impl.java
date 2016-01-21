import java.util.ArrayList;
import java.util.Iterator;


public class Receiver_impl extends ReceiverPOA {
	ArrayList<String> clientList=new ArrayList<String>();
	ArrayList<String> messageList=new ArrayList<String>();
	ArrayList<String> senderList=new ArrayList<String>();	
    
	@Override
	public void receive(String from, String message) {
		// TODO Auto-generated method stub
		messageList.add(from+":"+message);
		senderList.add(from);		
	}

	@Override
	public void initClients(String[] clients) {
		// TODO Auto-generated method stub
		for(int i=0;i<clients.length;i++){
			clientList.add(clients[i]);			
		}
		
	}

	@Override
	public void addClient(String client) {
		// TODO Auto-generated method stub
		clientList.add(client);	
	}

	@Override
	public void remClient(String client) {
		// TODO Auto-generated method stub
		for (int i=0;i<clientList.size();i++)
		{   
			if(clientList.get(i).equals(client))
			{   
				clientList.remove(i);			
			}
		}
	}
	
}
