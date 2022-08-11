package ex0805.homework.MVC_Collection.boardClass.model.dto;


public class PhotoBoard extends Board {
    private String imgName;

    public PhotoBoard() {

    }

    public static PhotoBoard of(String[] values) {
        return new PhotoBoard(Integer.parseInt(values[0])
                                ,values[1]
                                ,values[2]
                                ,values[3]
                                ,values[4]
                                ,values[5]);
    }

    public PhotoBoard(int no, String subject, String writer, String content, String date, String imgName) {
        super(no, subject, writer, content, date);
        this.imgName = imgName;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" PhotoBoard의 게시물 : ");
        sb.append(super.toString());
        sb.append(", 이미지 이름='").append(imgName).append('\'');
        sb.append("]");
        return sb.toString();
    }
}
