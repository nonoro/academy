package ex0729.수업.상속_다형성예제.Inheritance;

class Car{
	public String carname;
	public int cost;

	protected void printAttributes(){
		System.out.println("carname="+carname+"\tcost="+cost);
	}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성
//각 클래스에 인수를 받지않는 생성자 작성
//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당
class EfSonata extends Car {
	EfSonata() {
		carname = "소나타";
		cost = 20000000;


	}
}

class Excel extends Car {
	String color = "red";
	Excel() {
		carname = "제네시스";
		cost = 50000000;
	}
}

class Carnival extends Car {
	Carnival() {
		carname = "카니발";
		cost = 45000000;
	}
}




public class InheritanceExam{
	//메인메소드에서
	public static void main(String[] args) {
		Car c = new Car();
		EfSonata ef = new EfSonata();
		Excel e = new Excel();
		Carnival cn = new Carnival();

		c.printAttributes();
		ef.printAttributes();
		e.printAttributes();
		cn.printAttributes();

	}


	//Car, EfSonata, Excel, Canival 네개의 객체를 생성
	// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.


}

