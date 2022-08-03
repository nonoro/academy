package ex0803.study.실습;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("===========Store Open=================================");
        ShoppingMall shoppingMall = new ShoppingMall();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
//            int inputNumber = (int) (Math.random() * 55) + 1;
            int age = rd.nextInt(55) + 1;
            try {
                shoppingMall.inputAge(age);
            } catch (ExceptionExam e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("===========Store Close=================================");

        System.out.println("쫓겨난 아이들의 수 = " + ExceptionExam.count);
    }
}
