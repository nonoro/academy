package ex0812.homework.mvcWeight.view;

import ex0812.homework.mvcWeight.model.dto.WeightProfile;

public class OutputView {
    public static void printProfile(WeightProfile weightProfile, String weight) {
        System.out.println("======================================================================================");
        System.out.println(weightProfile.getName() + "님의 몸무게는 " + weight + "kg 입니다." );
        System.out.println("======================================================================================");

    }

    public static void printPasswordError() {
        System.out.println("비밀번호가 일치하지 않습니다.");
    }

    public static void printPassword(WeightProfile weightProfile, String password) {
        System.out.println("======================================================================================");
        System.out.println(weightProfile.getName() + "님의 비밀번호는 " + password + "입니다." );
        System.out.println("======================================================================================");

    }

    public static void printSearchPassword(WeightProfile weightProfile, String[] identityNumber) {
        if (weightProfile.getIdentityNumber() != Integer.valueOf(identityNumber[2]) ) {
            System.out.println("주민등록번호가 일치하지 않습니다.");
            return;
        }
        System.out.println("======================================================================================");
        System.out.println(weightProfile.getName() + "님의 비밀번호는 " + identityNumber[1] + "입니다." );
        System.out.println("======================================================================================");
    }

    public static void printEndMessage() {
        System.out.println("프로그램을 종료합니다.");
    }

}
