
/**
* stringsHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Receiver.idl
* 2016��1��20�� ������ ����01ʱ48��07�� CET
*/

public final class stringsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringsHolder ()
  {
  }

  public stringsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = stringsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    stringsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return stringsHelper.type ();
  }

}
