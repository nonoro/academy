package ex0722.lectureData;

public class StaticInitExam {
    public static void main(String[] args) {
        System.out.println("****메인 시작합니다****");
    }

    /*
        환경세팅, 데이터를초기화 및 로딩, DB세팅, 점검해야하는 작업들을 static블럭에 많이 한다.
    */
    static{
        // 기능작성
        System.out.println("메인보다 먼저 실행됩니다");
    }
}
