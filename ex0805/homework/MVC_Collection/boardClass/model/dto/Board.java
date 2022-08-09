package ex0805.homework.MVC_Collection.boardClass.model.dto;

public class Board {
    private int no;
    private String subject;
    private String writer;
    private String content;
    private String date;

    public Board() {

    }

    public Board(int no, String subject, String writer, String content, String date) {
        this.no = no;
        this.subject = subject;
        this.writer = writer;
        this.content = content;
        this.date = date;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" [ 번호 : ").append(no);
        sb.append(", 제목 : '").append(subject).append('\'');
        sb.append(", 작성자 : '").append(writer).append('\'');
        sb.append(", 내용 : '").append(content).append('\'');
        sb.append(", 날짜 : '").append(date).append('\'');
        return sb.toString();

    }
}
