package ex0812.homework.mvc소스.mvc.view;

import java.util.List;

/**
 * 사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스
 */
public class OutputView {
    public static void printAll(List<String> elecArr) {
        System.out.println("**** 전자제품(" + elecArr.size() + ")개 정보 ********************");
        System.out.println("(모델번호, 모델이름, 모델가격, 모델설명)");

        for (String e : elecArr) {
            System.out.println(e);
        }

        System.out.println();
    }


    public static void printSearchModelNo(String number) {
        if (number != null) {
            System.out.println("(모델번호, 모델이름, 모델가격, 모델설명)");
            System.out.println(number);
        } else {
            System.out.println("해당 모델 번호가 존재하지 않습니다.");
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }


    public static void registrationInformation(String s) {
        if (s == null) {
            System.out.println("등록이 완료되었습니다.");
        } else {
            System.out.println(s + "은/는 이미 존재하는 제품 번호입니다");
        }
    }

    public static void printUpdateResult(String no) {
        if (no != null) {
            System.out.println("수정 성공!");
        } else {
            System.out.println("존재하지 않는 제품번호 입니다.(수정실패)");
        }
    }

    public static void printDeleteResult(String deleteResult) {
        if (deleteResult != null) {
            System.out.println("삭제가 완료되었습니다");
        } else {
            System.out.println("제품이 존재하지 않아 삭제가 실패하였습니다.");
        }
    }
}
