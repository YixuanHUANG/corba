
/**
* stringsHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Dialogue.idl
* 2015年10月12日 星期一 下午04时12分56秒 CEST
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
