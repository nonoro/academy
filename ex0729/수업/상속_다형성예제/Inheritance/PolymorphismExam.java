package ex0729.수업.상속_다형성예제.Inheritance;

import ex0729.수업.상속_다형성예제.Inheritance.Car;

class CarCenter {
    public void engineer(Car cd) { // Car cd = car, ef, ca, ex;
        System.out.println("cd주소값 = " + cd);
        // 아래문장 에러 : 부모타입을 자식타입으로 형변환해서 접근 가능하도록 해야한다.
//        System.out.println("색깔" + cd.color + " 원"); // 부모타입 변수로는 자식부분 접근불가
//        Excel ex2 = cd; // 부모 > 자식 이므로 ObjectDownCasting 필요하다
        if (cd instanceof Excel) { // 변수 instanceof 타입, 실행도중 발생하는 ClassCastingException을 방지해주기 위한 하나의 제어
            Excel ex2 = (Excel) cd;
            System.out.println("ex2주소값 = " + ex2);
            System.out.println("ex2.color" + ex2.color);
        }

        System.out.print(cd.carname + " 수리완료!\t");
        System.out.println("청구비용" + cd.cost + " 원");


    }
}

public class PolymorphismExam {
    public static void main(String[] args) {

        CarCenter cc = new CarCenter();
        EfSonata ef = new EfSonata();
        Carnival ca = new Carnival();
        Excel ex = new Excel();

        Car car = new Car();

        cc.engineer(car);// car 주소값
        cc.engineer(ef);// ef 주소값
        cc.engineer(ca);// ca 주소값
        System.out.println("\nex = " + ex);
        System.out.println("ex.carname = " + ex.carname);
        System.out.println("ex.color = " + ex.color);
        System.out.println("---------------------------------");
        cc.engineer(ex);// ex 주소값


    }
}
