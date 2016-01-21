
/**
* ConnectionOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Connection.idl
* 2016年1月20日 星期三 上午01时48分15秒 CET
*/

public interface ConnectionOperations 
{
  Emitter connect (String pseudo, Receiver rcv);
  void disconnect (String pseudo);
} // interface ConnectionOperations
