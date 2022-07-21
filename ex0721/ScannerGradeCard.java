package ex0721;

import java.util.Scanner;

public class ScannerGradeCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("-------------성적표 프로그램-------------");
            System.out.println("1. 성적표구하기   2. 종료");
            System.out.print("입력 > ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                System.out.print("과목수 입력 > ");
                int numberOfSubjects = Integer.parseInt(scanner.nextLine());
                System.out.print("국어성적 입력 > ");
                int korScore = Integer.parseInt(scanner.nextLine());
                System.out.print("영어성적 입력 > ");
                int engScore = Integer.parseInt(scanner.nextLine());
                System.out.print("수학성적 입력 > ");
                int mathScore = Integer.parseInt(scanner.nextLine());

                int realTotalScore = totalScore(korScore, engScore, mathScore);
                System.out.println("총점 > " + realTotalScore);
                int realAverageScore = averageScore(realTotalScore, numberOfSubjects);
                System.out.println("평균 > " + realAverageScore);
                String realGrade = grade(realAverageScore);
                System.out.println("등급 > " + realGrade);
            } else if (input == 2) {
                System.out.println();
                run = false;
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }


    private static String grade(int number) {
            String grades;
        double averageScore1 = (int)((number / 3.0) * 100) / 100.0;
        int averageScore = (int)((number / 3.0) * 100) / 100;

        switch (averageScore / 10) {
                case 10:
                case 9:
                    grades = "A";
                    break;
                case 8:
                    grades = "B";
                    break;
                case 7:
                    grades = "C";
                    break;
                case 6:
                    grades = "D";
                    break;
                default:
                    grades = "F";
            }
            return grades;
        }


    private static int averageScore(int number1, int number2) {
        int result = number1 / number2;
        return result;
    }

    private static int totalScore(int number, int number2, int number3) {
        int result = number + number2 + number3;
        return result;
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.20
  주제 : 성적표 switch문으로 변경
*/
