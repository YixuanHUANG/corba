
/**
* ReceiverPOA.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Receiver.idl
* 2016��1��20�� ������ ����01ʱ48��07�� CET
*/

public abstract class ReceiverPOA extends org.omg.PortableServer.Servant
 implements ReceiverOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("receive", new java.lang.Integer (0));
    _methods.put ("initClients", new java.lang.Integer (1));
    _methods.put ("addClient", new java.lang.Integer (2));
    _methods.put ("remClient", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Receiver/receive
       {
         String from = in.read_string ();
         String message = in.read_string ();
         this.receive (from, message);
         out = $rh.createReply();
         break;
       }

       case 1:  // Receiver/initClients
       {
         String clients[] = stringsHelper.read (in);
         this.initClients (clients);
         out = $rh.createReply();
         break;
       }

       case 2:  // Receiver/addClient
       {
         String client = in.read_string ();
         this.addClient (client);
         out = $rh.createReply();
         break;
       }

       case 3:  // Receiver/remClient
       {
         String client = in.read_string ();
         this.remClient (client);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Receiver:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Receiver _this() 
  {
    return ReceiverHelper.narrow(
    super._this_object());
  }

  public Receiver _this(org.omg.CORBA.ORB orb) 
  {
    return ReceiverHelper.narrow(
    super._this_object(orb));
  }


} // class ReceiverPOA
