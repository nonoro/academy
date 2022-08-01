package ex0728.수업.생성자;

class Test {
    private static Test t = new Test();

    // 외부에서 객체생성 막음
    private Test() {

    }

    // 직접 자기자신을 생성해서 리턴해주는 static메소드를 제공한다.
    public static Test getInstance() {
        return t;
    }
}

public class PrivateConstructorExam {
    public static void main(String[] args) {
        Test t1 = Test.getInstance();
        Test t2 = Test.getInstance();
        Test t3 = Test.getInstance();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);

    }
}
