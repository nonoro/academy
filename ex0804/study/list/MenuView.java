package ex0804.study.list;


import java.util.List;
import java.util.Scanner;

/**
 * 사용자의 요청을 키보드로 입력받는 클래스
 */
public class MenuView {
    Scanner sc = new Scanner(System.in);
    StudentService service = new StudentServiceImpl();

    //전역변수 초기화, 생성자 호출

    /**
     * 전체 메뉴를 출력하는 메소드
     */
    public void printMenu() {

        while (true) {
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("1. 전체검색    2. 학생번호검색     3.등록     4. 수정     5. 삭제     9. 종료");
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.print("메뉴선택 > ");

            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    List<Student> list = service.selectAll();
                    EndView.printAll(list);
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
        System.out.print("학번은? ");
        String sno = sc.nextLine();

        System.out.print("학생이름은? ");
        String name = sc.nextLine();

        System.out.print("학생의 나이는? ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("학생의 주소는? ");
        String addr = sc.nextLine();

        Student student = new Student(sno, name, age, addr);
        if (service.insert(student)) {
            EndView.printMessage("등록이 완료되었습니다");
        } else {
            EndView.printMessage("등록에 실패하였습니다");

        }

    }

    /**
     * 모델번호에 해당하는 전자제품 검색하기 위해서 모델번호 키보드입력 처리하는 메소드
     */
    public void inputSearch() {
        System.out.print("찾을 학생번호은? ");
        String sno = sc.nextLine();
        Student student = service.selectBySno(sno);
        if (student != null) {
            EndView.printSearchBySno(student);
        } else {
            EndView.printMessage(sno + "에 해당하는 학생번호가 없습니다");
        }

    }


    /**
     * 학생번호에 해당하는 학생의 나이와 주소를 수정하기 위해 키보드 입력처리하는 메소드
     */
    public void inputUpdate() {
        System.out.print("수정하려는 학생번호는? ");
        String sno = sc.nextLine();

        System.out.print("변경하려는 나이는? ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("변경하려는 주소는? ");
        String addr = sc.nextLine();

        boolean result = service.update(new Student(sno, age, addr));
        if (result) {
            EndView.printMessage("수정이 성공하였습니다.");
        } else {
            EndView.printMessage("수정이 실패하였습니다");
        }
    }

    /**
     * 학생 번호에 해당하는 정보 삭제를 위한 키보드 입력 메소드
     */

    public void inputDelete() {
        System.out.print("삭제 할 학생 번호는? > ");
        String sno = sc.nextLine();
        boolean delete = service.delete(sno);
        if (delete) {
            EndView.printMessage("삭제성공");
        } else {
            EndView.printMessage("삭제실패 존재하지 않는 학번입니다.");
        }

    }

}
