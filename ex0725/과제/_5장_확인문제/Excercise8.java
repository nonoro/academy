package ex0725.과제._5장_확인문제;

public class Excercise8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0;

        // 주어진 배열의 전체 항목의 합과 평균값을 구해보세요 ( 중첩 for문을 이용하세요 )
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + (double)((sum) / 10.0));
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : 확인문제 8번
*/