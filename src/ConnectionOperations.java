
/**
* ConnectionOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Connection.idl
* 2015年10月12日 星期一 下午04时25分03秒 CEST
*/

public interface ConnectionOperations 
{
  Dialogue connect (String pseudo);
  void disconnect (String pseudo);
} // interface ConnectionOperations
