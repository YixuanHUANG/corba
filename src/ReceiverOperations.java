
/**
* ReceiverOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Receiver.idl
* 2016年1月20日 星期三 上午01时48分07秒 CET
*/

public interface ReceiverOperations 
{
  void receive (String from, String message);
  void initClients (String[] clients);
  void addClient (String client);
  void remClient (String client);
} // interface ReceiverOperations
