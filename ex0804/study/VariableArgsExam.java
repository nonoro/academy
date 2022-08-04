package ex0804.study;

public class VariableArgsExam {

    public void test(int ... i) { // 매개변수를 0개이상 허용한다.
        System.out.println("i.length = " + i.length);
        for (int j : i) {
            System.out.print(j + " , ");
        }

        System.out.println("\n------------------------------------------------");

    }

    public void test2(String s, int... i) {

    }

//    public void test3(int ... i, String s) { // 이건 못씀 왜냐면 int ... i 는 무한개로 매개변수를 넣어주는거기 때문에
//                                             // 무조건 인수의 마지막에 와야된다.
//    }

    public static void main(String[] args) {
        VariableArgsExam va = new VariableArgsExam();
       /*   va.test(3);
            va.test();
            va.test(3, 3, 4, 1);
            va.test(3, 5);

            va.test("안녕");
            va.test(true, 5.5);
////////////////////////////////////////////////////////////////////////////////
        */
        va.test2("안녕");
        va.test2("안녕", 1);
        va.test2("안녕", 1, 2, 3, 4, 4);
//        va.test2(1, 2, 3, 4, 4, 5); 이건 안됨 무조건 앞에 String이 나오고 나서 저렇게 해야됨




    }
}
