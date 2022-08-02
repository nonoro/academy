package ex0802.study.interface_study.interface_exam;

/**
 * 모든 게시판이 공통으로 가지고 속성을 관리하는 객체
 */

public class Board {
    private int bno;
    private String subject;
    private String writer;
    private String content;



    public Board() {
    }

    public Board(int bno, String subject, String writer, String content) {
        this.bno = bno;
        this.subject = subject;
        this.writer = writer;
        this.content = content;
    }


    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Board ");
        sb.append("bno=").append(bno);
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", writer='").append(writer).append('\'');
        sb.append(", content='").append(content).append('\'');
        return sb.toString();
    }
}
