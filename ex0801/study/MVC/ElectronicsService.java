package ex0728.수업.MVC;

import ex0727.constructorExam.exam.GoodsService;

/*
    전자제품에 관련된 기능을 담당할 클래스 - 싱글톤 클래스
 */

public class ElectronicsService {
    public static int count; // 배열방에 저장된 전자제품의 개수를 체크!

    String[][] data = new String[][]{
            {"100", "선풍기", "35000", "삼성 선풍기"},
            {"200", "전자렌지", "55000", "잘 데워져요.."},
            {"300", "에어컨", "5500000", "무풍 에어컨 너무 시원해"},
            {"400", "냉장고", "800000", "LG 냉장고"},
            {"500", "드라이기", "9000", "LG 드라이기"}
    };

    private static ElectronicsService instance = new ElectronicsService(); // private생성자 호출됨

    // 영속성 : 전자제품 정보를 저장하고 관리(등록, 검색, 수정, 삭제)
    Electronics[] elecArr; // 공간 생성


    /*
        외부에서 객체 생성안됨
     */
    private ElectronicsService() {
        // 데이터를 초기화 세팅
        elecArr = new Electronics[10];
        for (int i = 0; i < data.length; i++) {
            elecArr[ElectronicsService.count] = new Electronics(Integer.parseInt(data[i][0]),
                    data[i][1],
                    Integer.parseInt(data[i][2]),
                    data[i][3]);
            ElectronicsService.count++;
        }

    }

    /*
        현재 객체를 리턴해준다
     */
    public static ElectronicsService getInstance() {
        return instance;
    }

    /*
        전자제품 등록
        return : true이면 등록성공, false이면 등록실패
     */

    public boolean insert(Electronics electronics) { // 번호 이름 가격 설명
        // 배열의 길이를 벗어났는지만 체크하고.
        if (elecArr.length == ElectronicsService.count) {
            return false;
        } else {
            elecArr[ElectronicsService.count] = electronics;
            count++;
        }
        return true;
    }

    /*
       등록된 전체 전자제품 검색
    */
    public Electronics[] selectAll() {
        return elecArr;
    }

    /*
        모델번호에 해당하는 전자제품 검색
        @return : null이면 없다, null아니면 찾은 객체 리턴
     */
    public Electronics searchByModelNo(int modelNo) {
        for (int i = 0; i < ElectronicsService.count; i++) {
            if (modelNo == elecArr[i].getModelNo()) {
                return elecArr[i];
            }
        }
        return null;
    }

    /*
        모델번호에 해당하는 전자제품 수정하기
        (설명만 수정한다)
        @return : true이면 수정성공, false이면 수정실패
     */
    public boolean update(Electronics electronics) { // 상품번호, 설명 두개가 들어와야된다.
        if (searchByModelNo(electronics.getModelNo()) == null) {
            return false;
        }

        searchByModelNo(electronics.getModelNo()).setModelDetail(electronics.getModelDetail());
        return true;
    }
}



