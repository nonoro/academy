package ex0725;

public class ArgsExam {
    public static void main(String[] args) {
        System.out.println("args = " + args);  // 주소값
        System.out.println("args = " + args.length);  // 주소값
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("args["+ i +"]" + " = " + args[i] + " ");
            }
        }

        /*
        만약 인수가 숫자로 2개 전달된다고 가정했을때 두수의 합을 구한다.
          */
        String result = args[0] + args[1];
        System.out.println(result);

        // 문자열(String) --> int형으로 변환 (Integer.parseInt("문자열"))
        int result2 = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println(result2);

    }
}
/*
   실행할때
   java ArgsExam 값 값 값 값 ....
*/
