package ex0722.test1;

import java.util.Scanner;

public class EncapsulationExamMain {
    public static void main(String[] args) {
        EncapsulationExam es = new EncapsulationExam();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1. 몸무게 검색    2. 몸무게 변경   3. 비밀번호변경      9. 종료");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.print("비밀번호를 입력하세요 > ");
                int input2 = scanner.nextInt();
                System.out.println();
                es.getSearchWeight(input2);
            } else if (input == 2) {
                System.out.print("변경 할 몸무게를 입력하세요 > ");
                System.out.println();
                int input3 = scanner.nextInt();
                System.out.print("비밀번호를 입력하세요 > ");
                int input4 = scanner.nextInt();
                System.out.println();
                es.getApendWeight(input3, input4);
            } else if (input == 3) {
                System.out.print("기존 비밀번호를 입력하세요 > ");
                int input5 = scanner.nextInt();
                System.out.println();
                System.out.print("변경 할 비밀번호를 입력하세요 > ");
                int input6 = scanner.nextInt();
                System.out.println();
                es.getApendPassword(input5, input6);
            } else if (input == 9) {
                System.out.println("프로그램을 종료합니다");
                run = false;
            }
        }
    }
}

