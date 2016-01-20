
/**
* ConnectionHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Connection.idl
* 2015��10��12�� ����һ ����04ʱ25��03�� CEST
*/

public final class ConnectionHolder implements org.omg.CORBA.portable.Streamable
{
  public Connection value = null;

  public ConnectionHolder ()
  {
  }

  public ConnectionHolder (Connection initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ConnectionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ConnectionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ConnectionHelper.type ();
  }

}
