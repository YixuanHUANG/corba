
/**
* ReceiverHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Receiver.idl
* 2016年1月20日 星期三 上午01时48分07秒 CET
*/

public final class ReceiverHolder implements org.omg.CORBA.portable.Streamable
{
  public Receiver value = null;

  public ReceiverHolder ()
  {
  }

  public ReceiverHolder (Receiver initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ReceiverHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ReceiverHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ReceiverHelper.type ();
  }

}
