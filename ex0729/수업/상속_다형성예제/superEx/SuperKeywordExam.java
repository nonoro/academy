package ex0729.수업.상속_다형성예제.superEx;


class People {
    int age = 20;
    String name = "People";

    public void aa() {
        System.out.println("People의 aa() 호출됨...");
    }

    public void bb() {
        System.out.println("People의 bb() 호출됨...");
    }
}

////////////////////////////////////////////////////
class Customer extends People {
    int age = 10;
    String addr = "오리역";

    @Override // annotation = 표식
    public void aa() {
        System.out.println("Customer의 aa() 호출됨...");
    }

    public void cc() {
        System.out.println("Customer의 cc() 호출됨...");
    }

    public void test() {
        System.out.println(age); // 10
        System.out.println(this.age); // 10
        System.out.println(super.age); // 20

        System.out.println("----------------------------------------------------------");
        System.out.println(name); // 10
        System.out.println(this.name); // 10
        System.out.println(super.name); // 20

        System.out.println("----------------------------------------------------------");
        System.out.println(addr); // 10
        System.out.println(this.addr); // 10
//        System.out.println(super.addr); // 자식부분에 있는 필드를 super로 접근 안됨.

        System.out.println("================메소드 호출해보자======================");

        aa(); // 본인
        this.aa(); // 본인
        super.aa(); // 부모

        System.out.println("----------------------------------------------------------");
        bb();
        this.bb();
        super.bb();

        System.out.println("----------------------------------------------------------");
        cc();
        this.cc();
//        super.cc(); 부모에 없어서 안됨,
    }
}

/////////////////////////////////////////////////////////////////////////

public class SuperKeywordExam {
    public static void main(String[] args) {
//        new Customer().test();
        Customer cu = new Customer();
        System.out.println(cu.age);  // 10살
        System.out.println(cu.addr); // 오리역
        System.out.println(cu.name); // People

        System.out.println("-----------------------------------------------");
        cu.aa(); // Customer
        cu.bb(); // People
        cu.cc(); // Customer
        ///////////////////////////////////////////////////////////////////////////////
        System.out.println("------------------------------------------------");
        People p = new Customer(); // 다형성이다
        System.out.println(p.age);  // 20살
//        System.out.println(p.addr); // 부모타입변수로 자식부분 접근불가
        System.out.println(p.name); // People

        System.out.println("**************************************");
        p.aa(); // 재정의된 메서드는 부모타입일지라도 자식부분의 메소드가 호출된다
        p.bb();
//        p.cc(); // 부모타입의 변수로는 자식부분의 메소드 호출불가
        /////////////////////////////////////////////////////////////////////

        // p가 가리키고 있는곳의 자식부분을 접근하기 위해서
        // ObjectDownCasting이 필요하다.
        if (p instanceof Customer) {
        Customer cu2 = (Customer) p;

        System.out.println("p의 주소 = " + p);
        System.out.println("cu2의 주소 = " + cu2);

        System.out.println(cu2.addr);
        cu2.cc();
        }
    }
}
