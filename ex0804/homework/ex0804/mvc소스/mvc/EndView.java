package mvc;
/**
  ����� ��û�� �ش��ϴ� ����� ����Ϳ� ����ϴ� Ŭ���� 
*/
class EndView{
    /**
	   ���޵� �迭�� ���(��ü �˻� ���)
	*/
	public static void printAll(Electronics [] elecArr){
        System.out.println("**** ������ǰ("+ ElectronicsService.count +")�� ���� ********************");

		for(int i=0; i< ElectronicsService.count  ; i++){
           Electronics elec = elecArr[i];
		  System.out.println(elec.toString());
		}
		
		System.out.println();
	}

	/**
	  �𵨹�ȣ�� �ش��ϴ� ������ǰ ����ϱ� 
	*/
	public static void printSearchByModelNo(Electronics electronics){
		   System.out.println("-----"+ electronics.getModelNo() +" ���� �Դϴ�. ---------");
		   System.out.println(electronics);
		   
		  
	}
	/**
	  ���� ���ο� ���õ� �޽��� ���
	*/
	public static void printMessage(String message){
         System.out.println(message);
	}

}