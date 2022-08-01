package ex0729.과제._6장확인문제;

import java.util.Scanner;

public class BankApplication {
    public static Account[] accountArray = new Account[100];
    public static Scanner scanner = new Scanner(System.in);
    public static int count = 0;

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1. 계좌생성  |  2. 계좌목록  |  3. 예금  |  4. 출금  |  5. 종료");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }

    private static void withdraw() {
        System.out.println("-------------------");
        System.out.println("출금");
        System.out.println("-------------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("출금액: ");
        int deposit = Integer.parseInt(scanner.nextLine());
        if (findAccount(ano) != null) {
            findAccount(ano).setBalance(findAccount(ano).getBalance() - deposit);
            System.out.println("출금이 성공되었습니다.");
        } else {
            System.out.println("출금이 실패햇습니다.");
        }
    }

    private static void deposit() {
        System.out.println("-------------------");
        System.out.println("예금");
        System.out.println("-------------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("예금액: " );
        int deposit = Integer.parseInt(scanner.nextLine());
        if (findAccount(ano) != null) {
            findAccount(ano).setBalance(findAccount(ano).getBalance() + deposit);
            System.out.println("예금이 성공되었습니다.");
        } else {
            System.out.println("예금이 실패했습니다.");
        }
    }


    private static void accountList() {
        System.out.println("-------------------");
        System.out.println("계좌목록");
        System.out.println("-------------------");

        int count = 0;
        for (Account account : accountArray) {
            if (account != null) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("등록된 계좌가 없습니다");
            return;
        }

        for (Account account : accountArray) {
            if (account != null) {
                System.out.println(account);
            }
        }
    }


    //  계좌 생성하기
    private static void createAccount() {
        System.out.println("-------------------");
        System.out.println("계좌생성");
        System.out.println("-------------------");

        System.out.print("계좌번호: ");
        String ano = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account account = new Account(ano, owner, balance);
        accountArray[count] = account;
        count++;
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static Account findAccount(String ano) {
        for (int i = 0; i < count; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        return null;
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제20
*/