package ex0721;

import java.util.Scanner;

class ScannerExam {
    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("---------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            int selectNumber = Integer.parseInt(scanner.nextLine());
            if (selectNumber == 1) {
                System.out.print("예금액> ");
                int credit = Integer.parseInt(scanner.nextLine());
                balance += credit;
            }
            if (selectNumber == 2) {
                System.out.print("출금액> ");
                int withdrawalAmount = Integer.parseInt(scanner.nextLine());
                balance -= withdrawalAmount;
            }
            if (selectNumber == 3) {
                System.out.println("잔고> " + balance);
            }
            if (selectNumber == 4) {
                System.out.println();
                run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}
