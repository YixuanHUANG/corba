
/**
* DialogueOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��Dialogue.idl
* 2015��10��12�� ����һ ����04ʱ12��56�� CEST
*/

public interface DialogueOperations 
{
  String[] getClients ();
  String[] getMessages (String pseudo);  
  void sendMessage(String to, String s);
} // interface DialogueOperations
