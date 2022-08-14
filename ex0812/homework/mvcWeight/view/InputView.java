package ex0812.homework.mvcWeight.view;

import ex0812.homework.mvcWeight.model.dto.WeightProfile;
import ex0812.homework.mvcWeight.model.util.Input;

public class InputView {
    public static WeightProfile inputWeight() {

        System.out.println("이름을 입력하여 주십시요.");
        System.out.print("이름 : ");
        String name = Input.readLine();

        System.out.println("몸무게를 입력하여 주십시요.");
        System.out.print("몸무게 : ");
        String weight = Input.readLine();

        System.out.println("비밀번호를 입력하여 주십시요.");
        System.out.print("비밀번호 : ");
        String password = Input.readLine();

        System.out.println("주민등록번호를 입력하여 주십시요.");
        System.out.print("주민등록번호 : ");
        String identityNumber = Input.readLine();



        return new WeightProfile(name, weight, password, identityNumber);
    }

    public static WeightProfile searchWeight() {
        System.out.println("검색할 이름을 입력하여 주십시요.");
        System.out.print("이름 : ");
        String name = Input.readLine();

        System.out.println("비밀번호를 입력하여 주십시요.");
        System.out.print("비밀번호 : ");
        String password = Input.readLine();

        return new WeightProfile(name, password);

    }

    public static String updateWeight() {
        System.out.println("변경할 몸무게를 입력하세요");
        System.out.print("변경할 몸무게 > ");
        String weight = Input.readLine();
        return weight;
    }

    public static String updatePassword() {
        System.out.println("변경할 비밀번호를 입력하세요");
        System.out.print("변경할 비밀번호 > ");
        String password = Input.readLine();
        return password;
    }
}


