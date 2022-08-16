package test.view;

import test.model.dto.ResponseWeightProfileDto;

public class OutputView {
    public static void showProfileInfo(ResponseWeightProfileDto profile) {
        System.out.println("\n*******************************************************");
        System.out.println("\t\t\t" + profile.getName() + "님의 몸무게는 " + profile.getWeight() + "kg 입니다.");
        System.out.println("*******************************************************");
    }

    public static void showUpdateWeightProfileInfo(ResponseWeightProfileDto profile) {
        System.out.println("\n*******************************************************");
        System.out.println("\t\t\t현재 " + profile.getName() + "님의 몸무게는 " + profile.getWeight() + "kg 입니다.");
        System.out.println("*******************************************************");
    }

    public static void showUpdatePasswordProfileInfo(ResponseWeightProfileDto profile) {
        System.out.println("\n*******************************************************");
        System.out.println("\t\t\t현재 " + profile.getName() + "님의 몸무게는 " + profile.getWeight() + "kg 입니다.");
        System.out.println("\t\t\t변경할 비밀번호를 입력하세요.");
        System.out.println("*******************************************************");
    }
}
