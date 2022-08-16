package ex0804.homework.ex0804.mvc소스.mvc;
/*
    View와 Model 사이에서 중간 역할
     : 사용자의 요청을 받아서 그애 해당하는 서비스를 호출하고
       호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */

import ex0804.homework.ex0804.mvc소스.exception.SearchNotFoundException;

import java.util.List;

class ElectronicsController {
    private ElectronicsService service = ElectronicsService.getInstance(); // null

    /*
        전자제품 등록
     */
    public void insert(Electronics electronics) {
        try {
            // 인수로 전달된 정보에서 상품번호를 꺼내서 중복여부를 체크한다.
            Electronics dbElec = service.searchByModelNo(electronics.getModelNo());
            // 중복이다!!
            EndView.printMessage(electronics.getModelNo() + "는 이미 등록된 상품입니다.");
        } catch (SearchNotFoundException e) {
            // 중복아니다! -> 등록하러가자
            service.insert(electronics);
            EndView.printMessage("등록되었습니다.");
        }
        // 중복이 아니면 insert하고 중복이면 에러메시지 출력을 호출한다.

    }

    /*
        전체검색
     */
    public void selectAll() {
        // 서비스를 호출하고 그 결과를 받아서 결과뷰를 호출해준다.
        List<Electronics> list = service.selectAll();
        EndView.printAll(list);
    }

    /*
        모델번호에 해당하는 전자제품 검색
     */
    public void searchByModelNo(int modelNo) {
        try {
            // 서비스를 호출하고 그 결과를 받아서 결과뷰를 호출한다
            Electronics searchByModelNo = service.searchByModelNo(modelNo);
            EndView.printSearchByModelNo(searchByModelNo);
        } catch (SearchNotFoundException e) {
            EndView.printMessage(e.getMessage());
        }
    }

    /*
        모델번호에 해당하는 전자제품 수정하기
     */
    public void update(Electronics electronics) {
        try {
            service.update(electronics);
            EndView.printMessage("수정되었습니다");
        } catch (SearchNotFoundException e) {
            EndView.printMessage(e.getMessage());
        }
    }

    public void delete(int modelNo) {
        try {
            boolean delete = service.delete(modelNo);
                EndView.printMessage("삭제가 완료되었습니다.");
        } catch (SearchNotFoundException e) {
            EndView.printMessage(e.getMessage());
        }
    }

    /**
     * 종료가 될 때 파일에 저장하기
     */
    public void destroy() {
        service.destroy();
    }
}

