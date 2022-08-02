package ex0802.study.interface_study;

//이 소스를 컴파일이 되도록 수정/추가/주석처리 하세요.
// 인터페이스 안에 들어있는 모든 필드는 public static final 상수이다. - 생략가능
// 인터페이스 안에 들어있는 모든 메소드는 public abstract이다 - 생략가능
interface InterfaceExam00 {
    abstract void interfaceExam00();
}


interface InterfaceExam01 extends InterfaceExam00 {  // interface끼리는 상속가능, 인터페이스끼리는 다중상속도 가능 근데 잘 안씀
    public static final int i = 767;
    public static final int k = 999;

    void interfaceExam01(int i, int k);
}


interface InterfaceExam02 {
    int j = 747; // public static final
    int privateInt = 8; // public static final

    void interfaceExam02(int j);  // public abstract

}


class SuperClassExam {
    String superString = "Super";

    String superMethod() {
        System.out.println("SuperClassExam.SuperMethod()가 호출되었습니다.");
        return "returnString";
    }
}

class SubClassExam01 extends SuperClassExam implements InterfaceExam01 { // 인터페이스는 클래스에 상속할수 없음

    @Override
    public void interfaceExam00() {

    }

    @Override
    public void interfaceExam01(int i, int k) {

    }
}


class SubClassExam02 extends SuperClassExam
        implements InterfaceExam01, InterfaceExam02 { // 클래스상속과 인터페이스 구현 한번에 가능
    @Override
    public void interfaceExam00() { // InterfaceExam01이 InterfaceExam00을 상속받았기 때문에
        // InterfaceExam00의 메소드도 구현을 해주거나 아니면 이 클래스를
    }                                // 추상클래스로 만든다

    @Override
    public void interfaceExam01(int i, int k) {

    }

    @Override
    public void interfaceExam02(int j) {

    }

}


abstract class SubClassExam03 extends SuperClassExam
        implements InterfaceExam01, InterfaceExam02 { // SuperClassExam 클래스는 구현 불가 상속은 가능

}


class SubClassExam04 extends SubClassExam02 {
    //여기에 필요한 것들을 추가하여 문제를 해결하세요..
    public void interfaceExam00() {
    }

    public void interfaceExam01(int i, int k) {
    }

    public void interfaceExam02(int j) {
    }

    SubClassExam04() {
        System.out.println("subClassExam04() 객체 생성");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
    }

    SubClassExam04(String s1, String s2) {
        System.out.println(s1 + " 타입 " + "subClassExam04(" + s2 + ") 객체 생성");

    }

    void printSuperString() {
//        InterfaceExam01 ie01 = new InterfaceExam01(); 인터페이스 생성 불가


        System.out.println(" superString = " + superString);
    }
}

//여기서부터는 하나도 고치지 마시고 그대로 쓰면 됩니다.
public class ImplememtsInterfaceExam {
    public static void main(String args[]) {
        SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
        SuperClassExam superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
        InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
        SubClassExam04 sub04 = new SubClassExam04();
        sub04.interfaceExam00();
        sub04.interfaceExam01(1, 7);
        sub04.superMethod();
    }
}

