
/**
* ReceiverHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Receiver.idl
* 2016年1月20日 星期三 上午01时48分07秒 CET
*/

abstract public class ReceiverHelper
{
  private static String  _id = "IDL:Receiver:1.0";

  public static void insert (org.omg.CORBA.Any a, Receiver that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Receiver extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ReceiverHelper.id (), "Receiver");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Receiver read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_ReceiverStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Receiver value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Receiver narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Receiver)
      return (Receiver)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ReceiverStub stub = new _ReceiverStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Receiver unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Receiver)
      return (Receiver)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _ReceiverStub stub = new _ReceiverStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
