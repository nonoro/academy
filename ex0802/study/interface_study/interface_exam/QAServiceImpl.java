package ex0802.study.interface_study.interface_exam;

public class QAServiceImpl implements BoardInterface {
    @Override
    public int insert(Board board) {
        System.out.println("QAServiceImpl의 insert call....");
        return 1;
    }

    @Override
    public boolean update(Board board) {
        System.out.println("QAServiceImpl의 update call....");
        return true;
    }

    @Override
    public Board selectByBno(int bno) {
        System.out.println("QAServiceImpl의 seletByBno(int bno) call....");

        Board board = new QABoard(bno, "QA", "희정", "글번호검색완료", false);

        return board;
    }

    @Override
    public void replyInsert() {
        System.out.println("QAServiceImpl의 replyInsert() 입니다.");
    }
}
