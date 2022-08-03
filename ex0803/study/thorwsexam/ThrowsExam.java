package ex0803.study.thorwsexam;

public class ThrowsExam {

    public void aa(int i) throws ArithmeticException{
        System.out.println("aa 메소드 호출됨....");
        try {
            this.bb(i);
        } finally {
        System.out.println("aa 메소드 끝....");
        }

    }

    public void bb(int i) throws ArithmeticException {
        System.out.println("bb 메소드 호출됨....");

        try {
            int result = 100 / i; // ArithmeticException 예외가 발생한 이 순간 아래걸 수행하지 않고 바로 예외를 받은 메서드로 넘어감
            // 따라서 bb메소드 끝 이걸 반드시 수행해야한다면 finally블럭에 넣어준다
            System.out.println("나눈결과 = " + result);
            //} catch (ArithmeticException e) {
            //    System.out.println("0은 안돼요!!");
            //}
        } finally {
            System.out.println("bb 메소드 끝....");
        }

    }

    public static void main(String[] args) throws ArithmeticException{
        System.out.println("******** 시작하기 *********************");
        ThrowsExam te = new ThrowsExam();
//        try {
        te.aa(0);
//        } catch (ArithmeticException e) {
//            System.out.println("예외발생 : 0으로 나눌수 없어요.");
//        }

        System.out.println("******** 끝 *********************");

    }
}
