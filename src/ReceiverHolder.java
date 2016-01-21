
/**
* ReceiverHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Receiver.idl
* 2016��1��20�� ������ ����01ʱ48��07�� CET
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
