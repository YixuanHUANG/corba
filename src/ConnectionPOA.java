
/**
* ConnectionPOA.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Connection.idl
* 2016年1月20日 星期三 上午01时48分15秒 CET
*/

public abstract class ConnectionPOA extends org.omg.PortableServer.Servant
 implements ConnectionOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("connect", new java.lang.Integer (0));
    _methods.put ("disconnect", new java.lang.Integer (1));
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
       case 0:  // Connection/connect
       {
         String pseudo = in.read_string ();
         Receiver rcv = ReceiverHelper.read (in);
         Emitter $result = null;
         $result = this.connect (pseudo, rcv);
         out = $rh.createReply();
         EmitterHelper.write (out, $result);
         break;
       }

       case 1:  // Connection/disconnect
       {
         String pseudo = in.read_string ();
         this.disconnect (pseudo);
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
    "IDL:Connection:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Connection _this() 
  {
    return ConnectionHelper.narrow(
    super._this_object());
  }

  public Connection _this(org.omg.CORBA.ORB orb) 
  {
    return ConnectionHelper.narrow(
    super._this_object(orb));
  }


} // class ConnectionPOA
