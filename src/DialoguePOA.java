
/**
* DialoguePOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Dialogue.idl
* 2015年10月12日 星期一 下午04时12分56秒 CEST
*/

public abstract class DialoguePOA extends org.omg.PortableServer.Servant
 implements DialogueOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("getClients", new java.lang.Integer (0));
    _methods.put ("getMessages", new java.lang.Integer (1));
    _methods.put ("sendMessage", new java.lang.Integer (2));
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
       case 0:  // Dialogue/getClients
       {
         String $result[] = null;
         $result = this.getClients ();
         out = $rh.createReply();
         stringsHelper.write (out, $result);
         break;
       }

       case 1:  // Dialogue/getMessages
       {
         String pseudo = in.read_string ();
         String $result[] = null;
         $result = this.getMessages (pseudo);
         out = $rh.createReply();
         stringsHelper.write (out, $result);
         break;
       }

       case 2:  // Dialogue/sendMessage
       {
         String to = in.read_string ();
         String s = in.read_string ();
         this.sendMessage ( to, s);
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
    "IDL:Dialogue:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Dialogue _this() 
  {
    return DialogueHelper.narrow(
    super._this_object());
  }

  public Dialogue _this(org.omg.CORBA.ORB orb) 
  {
    return DialogueHelper.narrow(
    super._this_object(orb));
  }


} // class DialoguePOA
