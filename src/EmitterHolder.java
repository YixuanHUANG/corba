
/**
* EmitterHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Emitter.idl
* 2016��1��20�� ������ ����01ʱ47��45�� CET
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
