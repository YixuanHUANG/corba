
/**
* DialogueOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
* 从Dialogue.idl
* 2015年10月12日 星期一 下午04时12分56秒 CEST
*/

public interface DialogueOperations 
{
  String[] getClients ();
  String[] getMessages (String pseudo);  
  void sendMessage(String to, String s);
} // interface DialogueOperations
