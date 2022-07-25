package ex0725;

public class MultiArrayExam {
//    int[][] arrInt = new int[3][4];
//    String[][] arrInt= new String[3][4];

    int[][] arrInt = new int[][]{
            {1, 3, 5, 7},
            {2, 4, 6, 8, 10, 12},
            {10, 20, 30},
            {100, 200}
    };
    String[][] arrStr = new String[3][]; // 열 미완성

    public void test() {
        System.out.println("arrInt = " + arrInt); // null
        System.out.println("arrStr = " + arrStr); // null

        System.out.println();

        System.out.println("arrInt.length = " + arrInt.length); // 행의 길이
        System.out.println("arrStr.length = " + arrStr.length); // 행의 길이

        System.out.println();

        System.out.println("arrInt[0] = " + arrInt[0]); // 0번지 전체의 주소값
        System.out.println("arrStr[0] = " + arrStr[0]); //

        arrStr[0] = new String[2];
        System.out.println("arrInt[0] = " + arrInt[0][0]); // 0
//        System.out.println("arrStr[0] = " + arrStr[0][1]); // NullPointerException 발생

        arrStr[0] = new String[2];
        System.out.println("arrStr[0] = " + arrStr[0][1]); // null 예외발생안함
//        System.out.println("arrStr[0] = " + arrStr[0][2]); // ArrayIndexOutOfBoundsException예외발생



        // arrInt의 배열방을 출력하고 싶다
//        System.out.println(arrInt[0][0]);
        System.out.println("===============================");
        for (int i = 0; i < arrInt.length; i++) { // 행 3
            for (int j = 0; j < arrInt[i].length; j++) { // 열 4
                System.out.print(arrInt[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        MultiArrayExam ma = new MultiArrayExam();
        ma.test();
    }
}
