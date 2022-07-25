package ex0725.과제._5장_확인문제;

import java.util.Scanner;

public class Excercise9 {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scoress = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4.분석 | 5. 종료");
            System.out.println("---------------------------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = scanner.nextInt();

            // if문을 완성해서 최고 점수 및 평균 점수를 구하는 프로그램을 만드시오

            if (selectNo == 1) {
                System.out.print("학생수 > ");
                studentNum = scanner.nextInt();
            } else if (selectNo == 2) {
                scoress = new int[studentNum];
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]> ");
                    scoress[i] = scanner.nextInt();
                }
            } else if (selectNo == 3) {
                for (int i = 0; i < scoress.length; i++) {
                    System.out.println("scores[" + i + "]> " + scoress[i]);
                }
            } else if (selectNo == 4) {
                int max = 0;
                int sum = 0;
                for (int i = 0; i < scoress.length; i++) {
                    sum += scoress[i];
                    if (max < scoress[i]) {
                        max = scoress[i];
                    }
                }
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + (((double) (sum) / studentNum) * 100) / 100.0);
            } else if (selectNo == 5) {
                run = false;
            }
        }
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.25
  주제 : 확인문제 9번
*/