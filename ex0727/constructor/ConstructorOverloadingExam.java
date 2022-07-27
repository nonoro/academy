package ex0727.constructor;

class Puppy3{
	/*String 타입 전역 변수 선언
		int 타입 전역 변수 선언*/
	String s; // null
	int i; // 0


	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3() {
		this.s = "메리";
		System.out.println("puplic Puppy3()호출되었습니다");
		System.out.println("전역변수 s = " + s + "\n" + "전역변수 i = " + i);
	}


	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"puplic Puppy3()호출되었습니다"출력
		전역변수 출력
	*/
	public Puppy3(String s) {
		this.s = s;
		System.out.println("puplic Puppy3(String s)호출되었습니다");
		System.out.println("전역변수 s = " + s + "\n" + "전역변수 i = " + i);

	}

	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"출력
	*/
	public Puppy3(String s, String s2) {
		this(s + s2); // 문자열 하나 받는 생성자 호출
		System.out.println("puplic Puppy3(String s, String s2)호출되었습니다");
	}


	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"puplic Puppy3()호출되었습니다"  출력
	*/
	public Puppy3(boolean b) {
		this(b + "쫑");
		System.out.println("puplic Puppy3(boolean b)호출되었습니다");
	}


	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/
	public Puppy3(char c) {
		this(); // 인수가 없는 생성자 호출(기본 생성자)
		this.i = c;
		System.out.println("puplic Puppy3(char c)호출되었습니다");
		System.out.println("i = " + i);
	}



	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/
	public void printMemberVariable() {
		System.out.println("전역변수 s = " + s + "\n" + "전역변수 i = " + i);
	}


}


class ConstructorOverloadingExam{
	//메인메소드에서
	public static void main(String [] args){
		// Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
		// new를 하는 순간 Puppy3의 모든 변수들이 초기화됨
		System.out.println("--------------1-------------------------");
		Puppy3 puppy1 = new Puppy3();		//	인수없는 생성자 호출

		System.out.println("--------------2-------------------------");
		Puppy3 puppy2 = new Puppy3("가");		// String받는 생성자 호출됨

		System.out.println("--------------3-------------------------");
		Puppy3 puppy3 = new Puppy3("나", "다");		//	String 2개 받는 생성자 호출됨

		System.out.println("--------------4-------------------------");
		Puppy3 puppy4 = new Puppy3(true);		//	 boolean받는 생성자 호출됨

		System.out.println("--------------5-------------------------");
		Puppy3 puppy5 = new Puppy3('A');			// char받는 생성자 호출됨


		System.out.println("\n--------------주소값 출력---------------");
		System.out.println("puppy1 = " + puppy1);
		System.out.println("puppy2 = " + puppy2);
		System.out.println("puppy3 = " + puppy3);
		System.out.println("puppy4 = " + puppy4);
		System.out.println("puppy5 = " + puppy5 + "\n");








		System.out.println("--------------각 객체의 메소드 호출---------------");

		//각 객체의 printMemberVariable메소드를 한번씩 호출
		System.out.println("--------------1---------------");
		puppy1.printMemberVariable();
		System.out.println("--------------2---------------");
		puppy2.printMemberVariable();
		System.out.println("--------------3---------------");
		puppy3.printMemberVariable();
		System.out.println("--------------4---------------");
		puppy4.printMemberVariable();
		System.out.println("--------------5---------------");
		puppy5.printMemberVariable();


	}
}