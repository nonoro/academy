package ex0721;

import java.util.Scanner;

public class ArithmeticOperationMain {
    public static void main(String[] args) {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 값을 입력하세요 > ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("연산자를 입력하세요 > ");
        String operator = scanner.nextLine();
        System.out.print("두번째 값을 입력하세요 > ");
        int number2 = Integer.parseInt(scanner.nextLine());

        arithmeticOperation.calculator(number1, number2, operator);
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.21
  주제 : 사칙연산 version1 메인
*/