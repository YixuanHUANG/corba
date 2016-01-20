
/**
* DialogueHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Dialogue.idl
* 2015��10��12�� ����һ ����04ʱ12��56�� CEST
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
