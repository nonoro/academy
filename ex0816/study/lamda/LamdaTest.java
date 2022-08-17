package ex0816.study;

public class LamdaTest {
    public static void main(String[] args) {
        // 원래 코딩 방식
//        AInterface ai = new AInterfaceImpl();
//        ai.aa();
        // 람다식 코딩으로 변경
        AInterface ai = () -> {
            System.out.println("AInterfaceImpl 의 aa 호출됨!!");
        };
        ai.aa();

        ////////////////////////////////////////////////////////
        BInterface bi = (a) -> {
            System.out.println("BInterface의 bb(int i) 호출됨!! " + a);
        };
        bi.bb(5);

        CInterface ci = (a, b) -> {
            System.out.println("CInterface의 cc(int a, int b) 호출됨!!" + a + ", " + b);
            return a * b;
        };
        int result = ci.cc(5, 4);
        System.out.println("결과 : " + result);
    }
}
///////////////////////////////////////////////////////////////////////////

//class AInterfaceImpl implements AInterface {
//    @Override
//    public void aa() {
//        System.out.println("AInterfaceImpl 의 aa 호출됨!!");
//    }


