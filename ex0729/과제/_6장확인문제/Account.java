package ex0729.과제._6장확인문제;


//// Exam19
//public class Account {
//    private static final int MIN_BALANCE = 0;
//    private static final int MAX_BALANCE = 1000000;
//    private int balance = 0;
//
//    Account() {
//
//    }
//
//    public void setBalance(int balance) {
//        if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
//            this.balance = balance;
//        } else {
//            this.balance = this.balance;
//            System.out.println("입력범위를 벗어났습니다 (입력범위 : " + MIN_BALANCE + " ~ " + MAX_BALANCE + ")");
//        }
//    }
//
//    public int getBalance() {
//        return this.balance;
//    }
//}


/*
    Exam20
 */
public class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account() {

    }

    public Account(String ano, String owner, int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return ano + "\t" + owner + "\t" + balance;
    }

}


/*
  본인이름: 권규정
  날짜: 22.07.29
  주제 : 확인문제19, 20
*/