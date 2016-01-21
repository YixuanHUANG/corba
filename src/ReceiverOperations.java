
/**
* ReceiverOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Receiver.idl
* 2016��1��20�� ������ ����01ʱ48��07�� CET
*/

public interface ReceiverOperations 
{
  void receive (String from, String message);
  void initClients (String[] clients);
  void addClient (String client);
  void remClient (String client);
} // interface ReceiverOperations
