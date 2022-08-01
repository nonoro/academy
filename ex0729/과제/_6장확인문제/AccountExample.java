package ex0729.과제._6장확인문제;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재잔고: " + account.getBalance());
    }
}

/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제19, 20
*/
