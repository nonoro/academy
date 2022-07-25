package solution;

import java.util.Scanner;

public class EncapsulationExam {
    private int pass = 1234;
    private int weight = 76;

    // get은 보통 리턴값이 있고 set은 없다

    /* 몸무게 검색 */
    /* return : 0은 비번 불일치, 0보다 크면 몸무게*/
    public int getWeight(int inputPass) {   //  타입이있는 get타입에는 되도록이면 메시지출력 넣지 말 것
        if (this.isPassCheck(inputPass)) {
            return this.weight;
        }
        return 0;
    }

    /* 몸무게 변경 */
    public void setWeight(int newWeight, int inputPass) { // 보통 void는 메세지도 넣어줘야되는 경우가 많음
        if (this.isPassCheck(inputPass)) {
            this.weight = newWeight;
            System.out.println("몸무게가 변경되었습니다.");
        } else {
            System.out.println("비밀번호 불일치로 몸무게를 변경할 수 없습니다.");
        }
    }

    /* 비밀번호 변경 */
    public void getPassChange(int oldPass, int newPass) {
        if (this.isPassCheck(oldPass)) {
            this.pass = newPass;
        } else {
            System.out.println("비밀번호가 변경되었습니다.");
        }

    }

    /* 비밀번호 체크 */
    private boolean isPassCheck(int inputPass) {        //  1번으로 만들어야 될 메서드
        if (this.pass == inputPass) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) { // main메소드에서는 보통 static 이기 때문에 객체를 생성해야됨 static 이라고 다른 메소드나 변수를 static으로 바꾸면 계속 꼬임
        EncapsulationExam es = new EncapsulationExam();
        Scanner scanner = new Scanner(System.in);
        int inputPass = 0; // 자주 사용되기 때문에 전역변수로 선언해서 값만 바꿔쓴다.

        while (true) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("1. 몸무게 검색    2. 몸무게 변경   3. 비밀번호변경      9. 종료");
            System.out.println("----------------------------------------------------------------");
            System.out.print("선택 > ");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.print("비밀번호를 입력하세요 > ");
                inputPass = scanner.nextInt();
                System.out.println();
                int result = es.getWeight(inputPass);
                System.out.println(result > 0 ? "당신의 몸무게는 > " + result + " kg입니다" : "비밀번호 오류로 몸무게를 검색 할 수 없습니다.\n");

            } else if (menuNum == 2) {
                System.out.print("변경 할 몸무게를 입력하세요 > ");
                int newWeight = scanner.nextInt();
                System.out.println();

                System.out.print("비밀번호를 입력하세요 > ");
                inputPass = scanner.nextInt();
                System.out.println();

                es.setWeight(newWeight, inputPass);
            } else if (menuNum == 3) {
                System.out.print("기존 비밀번호를 입력하세요 > ");
                int oldPass = scanner.nextInt();
                System.out.println();

                System.out.print("변경 할 비밀번호를 입력하세요 > ");
                int newPass = scanner.nextInt();
                System.out.println();

                es.getPassChange(oldPass, newPass);
            } else if (menuNum == 9) {
                //  while문을 빠져나가라
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("메뉴는 1~3 또는 9 만 입력해주세요.");
            }
        } // while 마지막
    }

}
