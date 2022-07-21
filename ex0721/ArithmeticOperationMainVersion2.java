package ex0721;

import java.util.Scanner;

public class ArithmeticOperationMainVersion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("사칙연산");
            System.out.println("1. 더하기   2. 빼기   3. 곱하기   4. 나누기   9. 종료");
            System.out.print("입력 > ");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                System.out.print("첫번째 값을 입력하세요 > ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.print("두번째 값을 입력하세요 > ");
                int number2 = Integer.parseInt(scanner.nextLine());
                ArithmeticOperationVersion2.plus(number1, number2);
            } else if (input == 2) {
                System.out.print("첫번째 값을 입력하세요 > ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.print("두번째 값을 입력하세요 > ");
                int number2 = Integer.parseInt(scanner.nextLine());
                ArithmeticOperationVersion2.minus(number1, number2);
            } else if (input == 3) {
                System.out.print("첫번째 값을 입력하세요 > ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.print("두번째 값을 입력하세요 > ");
                int number2 = Integer.parseInt(scanner.nextLine());
                ArithmeticOperationVersion2.multiply(number1, number2);
            } else if (input == 4) {
                System.out.print("첫번째 값을 입력하세요 > ");
                int number1 = Integer.parseInt(scanner.nextLine());
                System.out.print("두번째 값을 입력하세요 > ");
                int number2 = Integer.parseInt(scanner.nextLine());
                ArithmeticOperationVersion2.divide(number1, number2);
            } else if (input == 9) {
                System.out.println("프로그램을 종료합니다");
                run = false;
            }
        }
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.21
  주제 : 사칙연산 version2 메인
*/