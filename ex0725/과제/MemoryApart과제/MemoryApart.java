package ex0725.과제.MemoryApart과제;

class MultiArray {
    //정수형 2차원 배열 8*9
    int[][] array = new int[8][9];

    //메소드이름 :array99
    public void array99() {
        //for loop 를 사용하여
        //배열에 곱한 (구구단)결과저장
        //배열에 결과를 꺼내출력

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 2) * (j + 1);
                System.out.print((i + 2) + " * " + (j + 1) + " = " + array[i][j] + "\t" );
            }
            System.out.println();
        }
    }


}

public class MemoryApart {
    public static void main(String[] args) {
//main메소드에서
//MultiArray객체의 array99메소드호출
        MultiArray multiArray = new MultiArray();
        multiArray.array99();
    }

}


/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : MemoryApart과제
*/
