
/**
* EmitterHelper.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Emitter.idl
* 2016年1月20日 星期三 上午01时47分45秒 CET
*/

abstract public class EmitterHelper
{
  private static String  _id = "IDL:Emitter:1.0";

  public static void insert (org.omg.CORBA.Any a, Emitter that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Emitter extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (EmitterHelper.id (), "Emitter");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Emitter read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EmitterStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Emitter value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Emitter narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Emitter)
      return (Emitter)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EmitterStub stub = new _EmitterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Emitter unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Emitter)
      return (Emitter)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EmitterStub stub = new _EmitterStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
