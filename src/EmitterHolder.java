
/**
* EmitterHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Emitter.idl
* 2016年1月20日 星期三 上午01时47分45秒 CET
*/

public final class EmitterHolder implements org.omg.CORBA.portable.Streamable
{
  public Emitter value = null;

  public EmitterHolder ()
  {
  }

  public EmitterHolder (Emitter initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EmitterHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EmitterHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EmitterHelper.type ();
  }

}
