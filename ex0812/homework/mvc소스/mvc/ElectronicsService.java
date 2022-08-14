package ex0812.homework.mvc소스.mvc;


import ex0812.homework.mvc소스.exception.SearchNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 전자제품에 관련된 기능을 담당할 클래스  - 싱글톤 클래스
 */
class ElectronicsService {
    //영속성 : 전자제품 정보를 저장하고 관리(등록, 검색, 수정, 삭제.....)
    List<Electronics> list = new ArrayList<>(); //공간 생성

    private static ElectronicsService instance = new ElectronicsService(); //private생성자 호출됨


    /**
     * 외부에서 객체 생성안됨.
     */
    private ElectronicsService() {
//        System.out.println("private 생성자 호출됨.....");
        //데이터를 초기화 세팅
        list.add(new Electronics(100, "선풍기", 35000, "삼성 선풍기"));
        list.add(new Electronics(200, "전자렌지", 55000, "잘 데워져요.."));
        list.add(new Electronics(300, "에어컨", 5500000, "무풍 에어컨 너무 시원해"));
        list.add(new Electronics(400, "냉장고", 800000, "LG 냉장고"));
        list.add(new Electronics(500, "드라이기", 9000, "LG 드라이기"));

    }//생성자끝

    /**
     * 현재 객체를 리턴해준다.
     */
    public static ElectronicsService getInstance() {
        return instance;
    }

    /**
     * 전자제품 등록
     */
    public void insert(Electronics electronics) {//번호, 이름, 가격, 설명
        list.add(electronics);

    }

    /**
     * 등록된 전체 전자제품 검색
     */
    public List<Electronics> selectAll() {
        return list;
    }

    /**
     * 모델번호에 해당하는 전자제품 검색
     *
     * @return : null이면 없다, null아니면 찾은 객체 리턴
     */
    public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
        for (Electronics elec : list) {
            if (elec.getModelNo() == modelNo) {
                return elec;
            }
        }
        // 못찾았다!!
        throw new SearchNotFoundException(modelNo + "번에 해당하는 모델이 존재하지 않습니다.");
    }

    /**
     * 모델번호에 해당하는 전자제품 수정하기
     * (설명만 수정한다)
     */
    public void update(Electronics electronics) throws SearchNotFoundException { //상품번호, 설명
        Electronics saveElec = this.searchByModelNo(electronics.getModelNo());
        //수정하자
        saveElec.setModelDetail(electronics.getModelDetail());
    }

    public boolean delete(int modelNo) throws SearchNotFoundException {
        Electronics deleteElec = this.searchByModelNo(modelNo); // null이 나오면 throws로 인해서 컨트롤러쪽으로 감
        return list.remove(deleteElec);
    }

}//클래스끝