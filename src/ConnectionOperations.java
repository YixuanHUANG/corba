
/**
* ConnectionOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Connection.idl
* 2015��10��12�� ����һ ����04ʱ25��03�� CEST
*/

public interface ConnectionOperations 
{
  Dialogue connect (String pseudo);
  void disconnect (String pseudo);
} // interface ConnectionOperations
