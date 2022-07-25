package ex0722.lectureData;

class Test {
    public String addr; // 전역변수 = null로 자동 초기화
    private int age;    // 전역변수 = 0으로 자동 초기화


    public void aa(int i) { // 지역변수
        System.out.println(" i = " + i);

        String name = "희정";
        System.out.println(" name = " + name);

        System.out.println(" addr = " + addr);
        System.out.println(" age = " + age);



    }

    public void bb() {
//        int i; // 지역변수 : 사용전에 반드시 초기화 필수!!!
        int i = 100; // 이렇게 초기화 필수!
        System.out.println(" i = " + i);
//        System.out.println(" name = " + name); // 다른 메소드에서 선언된 변수는 사용할 수 없다.
        /*public*/ String addr = "서울"; // 지역변수 앞에 접근제한자 안됨
        System.out.println(" addr = " + addr);
        System.out.println(" this.addr = " + this.addr); // this.을 붙이면 무족건 전역변수를 부르는것
        System.out.println(" this.age = " + this.age);


    }
}



public class VariableScopeExam {

    public static void main(String[] args) {
        // 메소드 호출해보자
        Test test = new Test(); // 객체가 생성되는 시점에 멤버필드가 자동 초기화된다.
        test.bb();

        System.out.println("t.addr = " + test.addr );
        System.out.println("t.addr = " + test.addr );

    }
}
