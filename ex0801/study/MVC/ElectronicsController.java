package ex0728.수업.MVC;

/*
    View와 Model 사이에서 중간 역할
     : 사용자의 요청을 받아서 그애 해당하는 서비스를 호출하고
       호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
 */

class ElectronicsController {
    private ElectronicsService service = ElectronicsService.getInstance(); // null

    /*
        전자제품 등록
     */
    public void insert(Electronics electronics) {
        // 인수로 전달된 정보에서 상품번호를 꺼내서 중복여부를 체크한다.
        Electronics dbElec = service.searchByModelNo(electronics.getModelNo());

        // 중복이 아니면 insert하고 중복이면 에러메시지 출력을 호출한다.

        if (dbElec != null) {
            EndView.printMessage(electronics.getModelNo() + "는 이미 등록된 상품입니다.");
        } else {
            if (service.insert(electronics)) {
                EndView.printMessage("등록되었습니다.");
            } else {
                EndView.printMessage("더 이상 등록할 수 없습니다.");
            }
        }

    }

    /*
        전체검색
     */
    public void selectAll() {
        // 서비스를 호출하고 그 결과를 받아서 결과뷰를 호출해준다.
        Electronics[] electronics = service.selectAll();
        EndView.printAll(electronics);
    }

    /*
        모델번호에 해당하는 전자제품 검색
     */
    public void searchByModelNo(int modelNo) {
        Electronics searchByModelNo = service.searchByModelNo(modelNo);
        if (searchByModelNo == null) {
            EndView.printMessage("모델번호가 존재하지 않습니다.");
        } else {
            EndView.printSearchByModelNo(searchByModelNo);

        }
    }

    /*
        모델번호에 해당하는 전자제품 수정하기
     */
    public void update(Electronics electronics) {
        if (service.update(electronics)) {
            EndView.printMessage("모델번호 " + electronics.getModelNo() + "의 수정이 완료되었습니다.");
        } else {
            EndView.printMessage(electronics.getModelNo() + "에 해당하는 모델번호가 존재하지 않아 수정할 수 없습니다..");
        }
    }
}
