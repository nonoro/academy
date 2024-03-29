package ex0804.homework.ex0804.mvc소스.mvc;

import java.util.Scanner;

/**
 * 사용자의 요청을 키보드로 입력받는 클래스
 */
public class MenuView {
    Scanner sc = new Scanner(System.in);
    ElectronicsController controller = new ElectronicsController(); //전역변수 초기화, 생성자 호출

    /**
     * 전체 메뉴를 출력하는 메소드
     */
    public void printMenu() {

        while (true) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1. 전체검색    2. 모델번호검색     3.등록     4. 수정     5. 삭제     9. 종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("메뉴선택 > ");

            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    controller.selectAll();
                    break;
                case "2":
                    this.inputSearch();
                    break;
                case "3":
                    this.inputInsert();
                    break;
                case "4":
                    this.inputUpdate();
                    break;
                case "5":
                    this.inputDelete();
                    break;
                case "9":
                    //최종 list를 파일에 저장한다!!!
                    System.out.println("파일에 모든 정보를 저장완료했습니다.");
                    System.out.println("프로그램 종료합니다^^.");
                    controller.destroy();
                    System.exit(0);
                default:
                    System.out.println("메뉴를 다시 선택해주세요!!!!");

            }//switch문끝

        }//while문끝

    }//메소드끝


    /**
     * 등록할때 키보드 입력을 처리하는 메소드
     */
    public void inputInsert() {
        System.out.print("모델번호은? ");
        int modelNo = Integer.parseInt(sc.nextLine());

        System.out.print("모델이름은? ");
        String modelName = sc.nextLine();

        System.out.print("모델가격은? ");
        int modelPrice = Integer.parseInt(sc.nextLine());

        System.out.print("모델설명은? ");
        String modelDetail = sc.nextLine();

        Electronics elec = new Electronics(modelNo, modelName, modelPrice, modelDetail);
        controller.insert(elec);

    }

    /**
     * 모델번호에 해당하는 전자제품 검색하기 위해서 모델번호 키보드입력 처리하는 메소드
     */
    public void inputSearch() {
        System.out.print("찾을 전자제품 모델번호은? ");
        int modelNo = Integer.parseInt(sc.nextLine());
        controller.searchByModelNo(modelNo);


    }


    /**
     * 모델번호에 해당하는 설명을 수정하기 위해 키보드 입력처리하는 메소드
     */
    public void inputUpdate() {
        System.out.print("수정하려는 전자제품 모델번호는? ");
        int modelNo = Integer.parseInt(sc.nextLine());

        System.out.print("변경하려는 모델설명은? ");
        String modelDetail = sc.nextLine();

        controller.update(new Electronics(modelNo, modelDetail));

    }

    private void inputDelete() {
        System.out.print("삭제하려는 전자제품 모델번호는? ");
        int modelNo = Integer.parseInt(sc.nextLine());
        controller.delete(modelNo);
    }
}

