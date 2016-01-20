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

	static void run(ORB orb) {
		org.omg.CORBA.Object obj = null;

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

		/*
		 * String refFile = "Dialogue.ref"; java.io.BufferedReader in = new
		 * java.io.BufferedReader( new java.io.FileReader(refFile)); String ref
		 * = in.readLine(); System.out.println("IOR :"+ref); obj =
		 * orb.string_to_object(ref); //obj =
		 * orb.string_to_object("relfile:/Dialogue.ref");
		 */
        
		Connection conn = ConnectionHelper.narrow(obj);
		
		Dialogue dialogue2= conn.connect("Titi");
		Dialogue dialogue1= conn.connect("Tata");
		System.out.println("Clients online: "+Arrays.toString(dialogue1.getClients()));
		show(dialogue1.getMessages("Titi"));
		//Use the function sendMessage(String receiver, String s)
		dialogue1.sendMessage("Titi", "Coucou");
	    dialogue1.sendMessage("Titi", "Comment ça va?");  
	    dialogue1.sendMessage("Titi", "Tu es disponible demin?");    
	    
	    show(dialogue2.getMessages("Tata"));		    
	    dialogue2.sendMessage("Tata", "Tout va bien,merci!");  	    
	    dialogue2.sendMessage("Tata", "Qu'est-ce que tu vas faire demin?");  
	
	    //Use the function getMessages(String sender) 
		show(dialogue1.getMessages("Titi"));			
		conn.disconnect("Tata");	
		System.out.println("Clients online: "+Arrays.toString(dialogue2.getClients()));		
		

	}
	public static void show(String[] list){
		int size=list.length;
		System.out.println(list[size-1]);
		for(int i=0;i<size-1;i++)
		System.out.println(list[i]);
	}

}
