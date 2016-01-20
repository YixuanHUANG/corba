
/**
* DialogueHelper.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Dialogue.idl
* 2015��10��12�� ����һ ����04ʱ12��56�� CEST
*/

abstract public class DialogueHelper
{
  private static String  _id = "IDL:Dialogue:1.0";

  public static void insert (org.omg.CORBA.Any a, Dialogue that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Dialogue extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (DialogueHelper.id (), "Dialogue");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Dialogue read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DialogueStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Dialogue value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Dialogue narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Dialogue)
      return (Dialogue)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DialogueStub stub = new _DialogueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Dialogue unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Dialogue)
      return (Dialogue)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _DialogueStub stub = new _DialogueStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
