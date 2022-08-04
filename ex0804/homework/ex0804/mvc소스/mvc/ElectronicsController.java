package mvc;

import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
   View�� Model ���̿��� �߰� ����.
    : ������� ��û�� �޾Ƽ� �׿� �؈��ϴ� ���񽺸� ȣ���ϰ�
	  ȣ���� ����� �޾Ƽ� ������� ���� ��� �並 ȣ�����ش�.
*/
class ElectronicsController{
   private ElectronicsService service = ElectronicsService.getInstance() ; //

   /**
      ������ǰ ���
   */
   public void insert(Electronics electronics){
	   try {
		   //�μ��� ���޵� �������� ��ǰ��ȣ�� ������ �ߺ����θ� üũ�Ѵ�.
		   Electronics dbElec = service.searchByModelNo(electronics.getModelNo());
		   //�ߺ��̴�.
		   EndView.printMessage("��ǰ�ڵ� �ߺ��Դϴ�..");
       
	   }catch (SearchNotFoundException e) {
		   //�ߺ��ƴϴ�!! --> ����Ϸ�����.
		   try {
		      service.insert(electronics);
		      EndView.printMessage("��ϵǾ����ϴ�.^^");
		   }catch (ElectronicsArrayBoundsException ex) {
			  EndView.printMessage( ex.getMessage() );
		  }
		   
	  }
       
       
	   
   }//insert �޼ҵ峡 

   /**
     ��ü�˻�
   */
   public void selectAll(){
       //���񽺸� ȣ���ϰ� �װ���� �޾Ƽ� ����並 ȣ�����ش�.
        Electronics [] electArr = service.selectAll();
		EndView.printAll(electArr);
   }


   /**
    �𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
   */
   public void searchByModelNo(int modelNo){
	   try {
	      //���񽺸� ȣ���ϰ� �� ����� �޾Ƽ� ����並 ȣ�����ش�.
		 Electronics electronics = service.searchByModelNo(modelNo);
		 EndView.printSearchByModelNo(electronics);
	   }catch (SearchNotFoundException e) {
		   EndView.printMessage( e.getMessage() );
	   }
	 
   }

   /**
      �𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ�
   */
   public void update(Electronics electronics){ //��ȣ, ����
	   try {
         service.update(electronics);
         EndView.printMessage("�����Ǿ����ϴ�.");
	   }catch (SearchNotFoundException e) {
		  EndView.printMessage(e.getMessage());
	  }
   }
}













