package ex0802.study.interface_study.interface_exam;

public class MainApp {

    // 필드를 이용한 다형성
    private BoardInterface boardInterface;
    private Board board;


    public MainApp() {
        // test작업
        // 1. QA
        boardInterface = new QAServiceImpl();
        board = new QABoard(1, "QA test", "희정", "다형성", false);
        test(boardInterface, board);

        System.out.println("-----------------------------------------------------------------");

        // 2. Free
        boardInterface = new FreeServiceImpl();
        board = new FreeBoard();
        test(boardInterface, board);

        System.out.println("-----------------------------------------------------------------");

        // 3. Upload
        boardInterface = new UploadServiceImpl();
        board = new UploadBoard();
        test(boardInterface, board);

        System.out.println("-----------------------------------------------------------------");

        // 4. Photo게시판
        boardInterface = new BoardInterface() { // 익명 객체
            @Override
            public boolean update(Board board) {
                System.out.println("Photo의 update....");

                return false;
            }

            @Override
            public Board selectByBno(int bno) {
                System.out.println("Photo의 selectByBno....");

                return new Board();
            }

            @Override
            public int insert(Board board) {
                System.out.println("Photo의 insert....");
                return 0;
            }

        };

        test(boardInterface, board);

    } // 생성자

    public void test(BoardInterface bi, Board board) { // 인터페이스도 결국 매개변수를 이용한 다형성
        // 등록
        bi.insert(board);

        // 수정
        bi.update(board);

        // 부분검색
        Board returnBoard = bi.selectByBno(10);
        System.out.println(returnBoard);

        // 답변
        bi.replyInsert();

        // 전체검색
        BoardInterface.selectAll();
    }



    public static void main(String[] args) {
        System.out.println("************** 시작하기 *****************");
        MainApp mainApp = new MainApp();

    }
}
