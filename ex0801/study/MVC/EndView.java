package ex0728.수업.MVC;

/*
    사용자 요청에 해당하는 결과를 모니터에 출력하는 클래스
 */

public class EndView {
    /*
        전달된 배열을 출력(전체 검색 결과)
     */
    public static void printAll(Electronics[] elecArr) {
        System.out.println("******************* 전자제품 (" + ElectronicsService.count + ")***********************");
        for (int i = 0; i < ElectronicsService.count; i++) {
            System.out.println(elecArr[i]);
        }
    }

    /*
        모델번호에 해당하는 전자제품 출력하기
     */
    public static void printSearchByModelNo(Electronics modelNo) {
        System.out.println(modelNo);
    }

    /*
        메세지 출력하기
     */
    public static void printMessage(String string) {
        System.out.println(string);
    }
}
