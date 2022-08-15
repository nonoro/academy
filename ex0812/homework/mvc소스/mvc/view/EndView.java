package ex0812.homework.mvc소스.mvc.view;

import ex0812.homework.mvc소스.mvc.model.dto.Electronics;
import ex0812.homework.mvc소스.mvc.model.util.InputNumber;

import java.util.List;

/**
 사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스
 */
public class EndView{
	/**
	 전달된 배열을 출력(전체 검색 결과)
	 */
	public static void printAll(List<String> elecArr){
		System.out.println("**** 전자제품("+ elecArr.size() +")개 정보 ********************");
		System.out.println("(모델번호, 모델이름, 모델가격, 모델설명)");

		for(String e : elecArr){
			System.out.println(e);
		}

		System.out.println();
	}

	/**
	 모델번호에 해당하는 전자제품 출력하기
	 */
	public static String inputSearchModelNo(){
		System.out.print("모델번호를 입력하세요 > ");
		String modelNo = InputNumber.readLine();
		return modelNo;
	}

	public static void printSearchModelNo(String number) {
		if (number != null) {
			System.out.println("(모델번호, 모델이름, 모델가격, 모델설명)");
			System.out.println(number);
		} else {
			System.out.println("해당 모델 번호가 존재하지 않습니다.");
		}
	}

	/**
	 성공 여부에 관련된 메시지 출력
	 */
	public static void printMessage(String message){
		System.out.println(message);
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


	public static void registrationInformation(String s) {
		if (s == null) {
			System.out.println("등록이 완료되었습니다.");
		} else {
			System.out.println(s + "은/는 이미 존재하는 제품 번호입니다");
		}
	}

	public static Electronics updateModelinforMation() {
		System.out.print("수정하고자 하는 제품번호를 입력하세요 > ");
		int modelNo = Integer.valueOf(InputNumber.readLine());
		System.out.print("\n수정하고자 하는 제품 설명을 입력하세요 > ");
		String modelDetail = InputNumber.readLine();

		return new Electronics(modelNo, modelDetail);
	}

	public static void printUpdateResult(String no) {
		if (no != null) {
			System.out.println("수정 성공!");
		} else {
			System.out.println("존재하지 않는 제품번호 입니다.(수정실패)");
		}
	}

	public static int inputDeleteModelNo() {
		System.out.print("삭제하고자 하는 제품번호를 입력하세요 > ");
		int modelNo = Integer.valueOf(InputNumber.readLine());

		return modelNo;
	}

	public static void printDeleteResult(String deleteResult) {
		if (deleteResult != null) {
			System.out.println("삭제가 완료되었습니다");
		} else {
			System.out.println("제품이 존재하지 않아 삭제가 실패하였습니다.");
		}
	}
}
