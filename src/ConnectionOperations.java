
/**
* ConnectionOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Connection.idl
* 2016��1��20�� ������ ����01ʱ48��15�� CET
*/

public interface ConnectionOperations 
{
  Emitter connect (String pseudo, Receiver rcv);
  void disconnect (String pseudo);
} // interface ConnectionOperations
