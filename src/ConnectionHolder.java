
/**
* ConnectionHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Connection.idl
* 2015年10月12日 星期一 下午04时25分03秒 CEST
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
