package ex0812.homework.mvc소스.mvc.view;

import ex0812.homework.mvc소스.mvc.model.dto.Electronics;
import ex0812.homework.mvc소스.mvc.model.util.InputNumber;

public class InputView {
    public static String inputSearchModelNo(){
        System.out.print("모델번호를 입력하세요 > ");
        String modelNo = InputNumber.readLine();
        return modelNo;
    }

    public static Electronics InputNewModel() {
        System.out.print("제품번호를 입력하세요 > ");
        int modelNo = Integer.valueOf(InputNumber.readLine());
        System.out.print("\n제품명을 입력하세요 > ");
        String modelName = InputNumber.readLine();
        System.out.print("\n제품 가격을 입력하세요 > ");
        int modelPrice = Integer.valueOf(InputNumber.readLine());
        System.out.print("\n제품 설명을 입력하세요 > ");
        String modelDetail = InputNumber.readLine();

        return new Electronics(modelNo, modelName, modelPrice, modelDetail);
    }

    public static Electronics updateModelinforMation() {
        System.out.print("수정하고자 하는 제품번호를 입력하세요 > ");
        int modelNo = Integer.valueOf(InputNumber.readLine());
        System.out.print("\n수정하고자 하는 제품 설명을 입력하세요 > ");
        String modelDetail = InputNumber.readLine();

        return new Electronics(modelNo, modelDetail);
    }

    public static int inputDeleteModelNo() {
        System.out.print("삭제하고자 하는 제품번호를 입력하세요 > ");
        int modelNo = Integer.valueOf(InputNumber.readLine());

        return modelNo;
    }
}
