package ex0802.study.interface_study.interface_exam;

public class QABoard extends Board {
    private boolean replyState; // false

    public QABoard() {

    }

    public QABoard(int bno, String subject, String writer, String content, boolean replyState) {
        super(bno, subject, writer, content);
        this.replyState = replyState;
    }

    public boolean isReplyState() { // boolean형은 get이 아니고 true & false밖에 없어서 is로 시작함
        return replyState;
    }

    public void setReplyState(boolean replyState) {
        this.replyState = replyState;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", replyState=").append('\'').append(replyState).append('\'');
        return sb.toString();
    }
}
