package mvc.exception;

/**
 * ��ǰ�ڵ�� ��ǰ�� ��ȸ������ ã�� ������ null�̸� �߻���ų ���� ��ü 
 * */
public class SearchNotFoundException extends Exception {
   public SearchNotFoundException() {}
   public SearchNotFoundException(String message) {
	   super(message);
   }
}
