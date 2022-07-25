package ex0722.lectureData;

//MethodOverloadingExam.java
class OverloadedMethod{
	private int i; // field = 멤버변수 = 전역변수

	public void  setOverload(int i){
		this.i = i; // 인수로 전달된 지역변수의 값을 전역변수 i에 넣어라
	}

	public int getOverload(){
		return i; // 전역변수 i
	}

	//setOverload를 Overloading하세요. 리턴도 하세요.
	int setOverload(int i, int j){
		this.i = i + j;
		return this.i;
	}


	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	String setOverload(String s) {
		System.out.println("setOverload 메소드 호출됨.." + s);
		return s + "안녕";
	}


	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	void setOverload() {
		System.out.println("setOverload 메소드 호출됨..");
	}



	//getOverload를 Overloading하세요. 리턴도 하세요.
	char getOverload(int j) {
		return (char) j;
	}

	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public int getOverload(int j, int k) {
		return i + j + k;
	}

	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	void getOverload(int j, int k, int t) {
		i = j + k + t;
	}
}

public class  MethodOverloadingExam{

	public static void main(String [] agr){
		//OverloadedMethod객체에서 호출가능한  메소드들을 한번씩 호출하세요.
		OverloadedMethod o = new OverloadedMethod();
		o.getOverload(3);
		o.getOverload(3, 4);
		o.getOverload(3, 4, 2);
		o.getOverload();
		o.setOverload(30);
		o.setOverload(3, 1);
		o.setOverload("정말");
		o.setOverload();


	}


}

