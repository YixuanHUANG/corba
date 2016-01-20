import java.util.ArrayList;
import java.util.Iterator;


public class Dialogue_impl extends DialoguePOA {
	private ArrayList<String> clientList = new ArrayList<String>();
	private ArrayList<String> allmessages = new ArrayList<String>();
	private ArrayList<String> receiverList = new ArrayList<String>();
	private ArrayList<String> senderList = new ArrayList<String>();
	private ArrayList<String> megList = new ArrayList<String>();
	private String[] clist=null, mlist=null;
	private String identifiant;
	

	public Dialogue_impl(String pseudo,ArrayList<String> clients, ArrayList<String> receivers, ArrayList<String> senders, ArrayList<String> messages) {
		// TODO Auto-generated constructor stub
		clientList=clients;
		allmessages=messages;
		receiverList=receivers;
		senderList=senders;
		identifiant=pseudo;
	}
	public ArrayList<String> updateMessages(){
		return allmessages;
	}
	public ArrayList<String> updateSenders(){
		return senderList;
	}
	public ArrayList<String> updateReceivers(){
		return receiverList;
	}

	@Override
	public String[] getClients() {
		// TODO Auto-generated method stub
		clist = new String[clientList.size()];		
		clientList.toArray(clist);
		return clist;
		
	}
	@Override
	public String[] getMessages(String sender) {
	     megList.clear();
	     int nb=0;	   
		// TODO Auto-generated method stub  		
		for (int i=0;i<senderList.size();i++)
		{   
			if(senderList.get(i).equals(sender)&& receiverList.get(i).equals(identifiant))
			{   
				megList.add(allmessages.get(i));
				allmessages.remove(i);
				receiverList.remove(i);
				senderList.remove(i);				
				nb++;
				i--;
			}	
			
		}
		if(nb==0)
		{
			megList.add("No message from "+ sender);
		}
		else{
			megList.add(nb+" messages for "+identifiant);
		}
			mlist = new String[megList.size()];	
			megList.toArray(mlist);
			return mlist;
	}

	@Override
	public void sendMessage(String receiver, String s) {
		// TODO Auto-generated method stub		
		senderList.add(identifiant);
		receiverList.add(receiver);
		allmessages.add(identifiant+": "+s);		
		System.out.println(identifiant+" sends a message to "+ receiver);
		
	}

}
