package ex0804.study.collection;


import java.util.ArrayList;

class Test {
	int a = 100;
	public void aa() {

	}
}

class ArrayListExam extends ArrayList<Object>{

	//전역 Variable
	//Object 타입1개, int 타입 1개;
	Object ob;
	int i;


	//Constractor
	public ArrayListExam(){
		//초기 용량 5개 생성
		super(5);

	}

	//method
	//method이름			리턴타입		인수

	/*addInt				없음			정수(int)1개
	하는일 : 인수로 받은 정수를 객체로 만들어 list에 추가.*/
	public void addInt(int i) {
//		Integer it = new Integer(i);
//		super.add(it);
		super.add(i); // AutoBoxing이 된다.
	}




	/*addFloat				없음			실수(float)1개
		하는일 : 인수로 받은 실수를 객체로 만들어 list에 추가.*/
	public void addFloat(float f) {
//		Float ft = new Float(f);
//		super.add(ft);
		super.add(f); // AutoBoxing이 된 Float객체가 add()에 들어가게된다.

	}


	/*addString			없음			String 문자열1개
		하는일 : 인수로 받은 String 을 list에 추가.*/
	public void addString(String s) {
		super.add(s);
		super.add(new Test());
	}


	/*printList		없음			없음
		정수형 전역변수에 현재 list에 들어있는 객체의 개수 입력한 후 전역변수 출력.
		List에 저장된 각 객체를 맴버변수에 저장한후 출력*/
	public void printList() {
		this.i = super.size();
		System.out.println("List에 들어있는 객체의 총 개수는 = " + this.i);

		for (int j = 0; j < this.i; j++) {
			this.ob = super.get(j);
			System.out.println("List에 저장된 객체 = " + this.ob);
		}
		// 위의 for문의 개선된for문으로 변경해보자
		System.out.println("--------------------------------------------------------");
		for (Object list : this) { // super는 주소값이 없어서 단독으로 못씀 그래서 여기선 super를 못씀 그냥 부모를 지칭하는것 일 뿐
			System.out.println(list); // 그래서 상속을 받았을땐 super말고 this를 써야됨
		}

		System.out.println("--------------------------------------------------------");


		// Test객체의 a변수를 찍어보자
		this.ob = super.get(3);
		if (ob instanceof Test) {
			Test t = (Test) ob;
			System.out.println(t.a);
		}

	}



	public static void main(String args[]){
		ArrayListExam list = new ArrayListExam();
		String s = new String("newString");
		list.addInt(5);
		list.addFloat(5.5F);
		list.addString(s);
		list.printList();

		////////////////////////////////////////////////////
		Integer it = new Integer(4);
		int a = it; // 언박싱
		System.out.println(a);

		int b = new Integer(8); // 언박싱
		System.out.println(b);

		Integer aa = 4; // 오토박싱


	}
}

/*실행결과

list에 들어있는 객체의 총 개수는=3
5
5.5
newString

Normal Termination
출력 완료 (0초 경과).
*/