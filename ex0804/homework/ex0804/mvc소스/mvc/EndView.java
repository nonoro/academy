package ex0804.homework.ex0804.mvc소스.mvc;

import java.util.List;

/**
 사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스
 */
class EndView{
	/**
	 전달된 배열을 출력(전체 검색 결과)
	 */
	public static void printAll(List<Electronics> elecArr){
		System.out.println("**** 전자제품("+ elecArr.size() +")개 정보 ********************");

		for(Electronics e : elecArr){
			System.out.println(e);
		}

		System.out.println();
	}

	/**
	 모델번호에 해당하는 전자제품 출력하기
	 */
	public static void printSearchByModelNo(Electronics electronics){
		System.out.println("-----"+ electronics.getModelNo() +" 정보 입니다. ---------");
		System.out.println(electronics);


	}
	/**
	 성공 여부에 관련된 메시지 출력
	 */
	public static void printMessage(String message){
		System.out.println(message);
	}

}