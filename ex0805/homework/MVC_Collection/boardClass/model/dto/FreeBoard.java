package ex0805.homework.MVC_Collection.boardClass.model.dto;

public class FreeBoard extends Board {
    private String views;

    public FreeBoard() {
    }

    public FreeBoard(int no, String subject, String writer, String content, String date, String views) {
        super(no, subject, writer, content, date);
        this.views = views;
    }

    public static FreeBoard of(String[] values) {
        return new FreeBoard(Integer.parseInt(values[0])
                ,values[1]
                ,values[2]
                ,values[3]
                ,values[4]
                ,values[5]);
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" FreeBoard의 게시물 : ");
        sb.append(super.toString());
        sb.append(", 조회수='").append(views).append('\'');
        sb.append("]");
        return sb.toString();
    }
}

