package ex0805.homework.MVC_Collection.mvcColection.model.dto;

public class FreeBoard extends Board {
    private String etc;

    public FreeBoard() {

    }

    public FreeBoard(int no, String subject, String writer, String content, String date, String etc) {
        super(no, subject, writer, content, date);
        this.etc = etc;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", etc : '").append(etc).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
