package ex0721;

import java.util.Scanner;

public class ScannerGradeCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        ScoreCalculator scoreCalculator = new ScoreCalculator();

        while (run) {
            System.out.println("-------------성적표 프로그램-------------");
            System.out.println("1. 성적표구하기   2. 종료");
            System.out.print("입력 > ");

            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                System.out.print("이름 입력 > ");
                String name = scanner.nextLine();
                System.out.print("국어성적 입력 > ");
                int korScore = Integer.parseInt(scanner.nextLine());
                System.out.print("영어성적 입력 > ");
                int engScore = Integer.parseInt(scanner.nextLine());
                System.out.print("수학성적 입력 > ");
                int mathScore = Integer.parseInt(scanner.nextLine());

                scoreCalculator.printResult(name, korScore, engScore, mathScore);
            } else if (input == 2) {
                System.out.println();
                run = false;
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.21
  주제 : 성적표 version3 메인
*/
