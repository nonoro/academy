package ex0726.가변형배열정리;

public class MultiArrayExam02 {

    int[][] arr = new int[3][];

    public void test() {
        System.out.println("arr[0] = " + arr[0]);   // 0행(1차원 배열)
        System.out.println("arr[1] = " + arr[1]);   // 1행(1차원 배열)
        System.out.println("arr[2] = " + arr[2]);   // 2행(1차원 배열)

        // 각 행의 열을 생성
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[2];

        System.out.println("\narr[0] = " + arr[0]);   // 0행(1차원 배열)
        System.out.println("arr[1] = " + arr[1]);   // 1행(1차원 배열)
        System.out.println("arr[2] = " + arr[2] + "\n");   // 2행(1차원 배열)

        // 배열방에 저장된 데이터를 출력해보자
        int rowlen = arr.length;
        for (int row = 0; row < rowlen; row++) {    //  행
            int collen = arr[row].length;

            for (int col = 0; col < collen; col++) {  // 열
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }// outerforEnd

        System.out.println();
        /////////////////////////////////////////////////////////////
        // 개선된 for 변경
        for (int[] row : arr) { // 한 행씩 꺼내서
            for (int v : row) { // 그 행에있는 배열을 쭉 돌려서 출력
                System.out.print(v + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new MultiArrayExam02().test();
    }
}
