package ex0725.과제._5장_확인문제;

public class Excercise7 {
    public static void main(String[] args) {
        int max = 0;
        int[] array = { 1, 5, 3, 8, 2 };
        // 최대값 구하기 for문을 이용
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max: " + max);
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : 확인문제 7번
*/