
/**
* DialogueHolder.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Dialogue.idl
* 2015年10月12日 星期一 下午04时12分56秒 CEST
*/

public final class DialogueHolder implements org.omg.CORBA.portable.Streamable
{
  public Dialogue value = null;

  public DialogueHolder ()
  {
  }

  public DialogueHolder (Dialogue initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DialogueHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DialogueHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DialogueHelper.type ();
  }

}
