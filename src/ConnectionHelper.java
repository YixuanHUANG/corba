
/**
* ConnectionHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Connection.idl
* 2016年1月20日 星期三 上午01时48分15秒 CET
*/

abstract public class ConnectionHelper
{
  private static String  _id = "IDL:Connection:1.0";

  public static void insert (org.omg.CORBA.Any a, Connection that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Connection extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ConnectionHelper.id (), "Connection");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Connection read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ConnectionStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Connection value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Connection narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Connection)
      return (Connection)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ConnectionStub stub = new _ConnectionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Connection unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Connection)
      return (Connection)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ConnectionStub stub = new _ConnectionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
