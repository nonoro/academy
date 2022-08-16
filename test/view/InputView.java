package test.view;

import test.model.WeightProfile;
import test.model.dto.RequestWeightProfileDto;
import test.util.Input;

public class InputView {
    public static String selectMenu() {
        System.out.println("다음 사항에 맞게 입력");
        System.out.println("\t\t몸무게 입력은 1번");
        System.out.println("\t\t몸무게 검색은 2번");
        System.out.println("\t\t몸무게 변경은 3번");
        System.out.println("\t\t비밀번호 변경은 4번");
        System.out.println("\t\t프로그램 종료는 5번");
        System.out.println("을 입력후 Enter.");

        return Input.readLine("메뉴 선택 : ");
    }

    public static WeightProfile inputProfile() {
        System.out.println("\n이름 입력");
        String name = Input.readLine("이름 : ");
        System.out.println("몸무게 입력");
        String weight = Input.readLine("몸무게 : ");
        System.out.println("비밀번호 입력");
        String password = Input.readLine("비밀번호 : ");

        return new WeightProfile(name, Integer.parseInt(weight), password);
    }

    public static RequestWeightProfileDto inputRequestProfileForSearch() {
        System.out.println("\n검색할 이름을 입력");
        String name = Input.readLine("이름 : ");
        System.out.println("비밀번호를 입력");
        String password = Input.readLine("비밀번호 : ");

        return new RequestWeightProfileDto(name, password);
    }


    public static RequestWeightProfileDto inputRequestProfile() {
        System.out.println("\n이름을 입력");
        String name = Input.readLine("이름 : ");
        System.out.println("비밀번호를 입력");
        String password = Input.readLine("비밀번호 : ");

        return new RequestWeightProfileDto(name, password);
    }

    public static String inputRequestWeight() {
        System.out.println("\n변경할 몸무게를 입력");
        return Input.readLine("변경할 몸무게 : ");
    }
}
