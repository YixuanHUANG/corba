import java.util.ArrayList;
import java.util.Iterator;


public class Emitter_impl extends EmitterPOA {
	private ArrayList<String> messageList = new ArrayList<String>();
	private ArrayList<String> receiverList = new ArrayList<String>();
	private ArrayList<String> senderList = new ArrayList<String>();
	private String identifiant;
	
	public Emitter_impl(String pseudo) {
		// TODO Auto-generated constructor stub
		identifiant=pseudo;
	}

	@Override
	public void sendMessage(String to, String message) {
		// TODO Auto-generated method stub
		senderList.add(identifiant);
		receiverList.add(to);
		messageList.add(identifiant+": "+message);		
		System.out.println(identifiant+" sends a message to "+ to);
		
	}}
