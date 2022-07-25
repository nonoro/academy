package ex0725.실습.Array;

class ArrayExam {

    //각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
    int[] intArr = new int[5]; // 0
    double[] doubleArr = new double[5]; // 0.0
    char[] charArr = new char[5]; // 공백 = \u0000
    boolean[] booleanArr = new boolean[5]; // false
    String[] stringArr = new String[5]; // null


    //메소드 : printArrayValue01
    //위의 배열들에 자동으로 초기화 된값을 출력하세요
    public void printArrayValue01() {
        System.out.println("주소값 = " + intArr);
        System.out.print("intArr =" + " ");
        for (int i = 0; i < 5; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();
        System.out.println("------개선된 for문------");
        System.out.println("주소값 = " + intArr);
        System.out.print("intArr =" + " ");
        for (int i : intArr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("주소값 = " + doubleArr);
        System.out.print("doubleArr =" + " ");
        for (int i = 0; i < 5; i++) {
            System.out.print(doubleArr[i] + " ");
        }
        System.out.println();
        System.out.println("------개선된 for문------");
        System.out.println("주소값 = " + doubleArr);
        for (double i : doubleArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("주소값 = " + charArr);
        System.out.print("charArr =" + " ");
        for (int i = 0; i < 5; i++) {
            System.out.print(charArr[i] + " ");
        }
        System.out.println();
        System.out.println("------개선된 for문------");
        System.out.println("주소값 = " + charArr);
        System.out.print("charArr =" + " ");
        for (char i : charArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("주소값 = " + booleanArr);
        System.out.print("booleanArr =" + " ");
        for (int i = 0; i < 5; i++) {
            System.out.print(booleanArr[i] + " ");
        }

        System.out.println();
        System.out.println("------개선된 for문------");
        System.out.println("주소값 = " + booleanArr);
        System.out.print("booleanArr =" + " ");
        for (boolean i : booleanArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("주소값 = " + stringArr);
        System.out.print("stringArr =" + " ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stringArr[i] + " ");
        }
        System.out.println();
        System.out.println("------개선된 for문------");
        System.out.println("주소값 = " + stringArr);
        System.out.print("stringArr =" + " ");
        for (String i : stringArr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    //메소드 : printArrayValue02
    //위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
    public void printArrayValue02() {
        for (int i = 0; i < 5; i++) {
            intArr[i] = (i + 10);
            doubleArr[i] = (i * 0.5);
            charArr[i] = (char) (i + 'A');
            if (i % 2 == 0) {
                booleanArr[i] = true;
            }
            stringArr[i] = "숫자 = " + i;

        }
    }

    //메소드 : printArrayValue03
    //새롭게 할당된값을 출력하세요
    public void printArrayValue03() {
        this.printArrayValue01();
    }

    //메인메소드에서
    //ArrayExam의 메소드들을 순서대로 호출하세요.
    public static void main(String[] args) {
        ArrayExam ar = new ArrayExam();
        ar.printArrayValue01();
        ar.printArrayValue02();
        System.out.println("------------값 변경 후------------");
        ar.printArrayValue03();
    }
}
