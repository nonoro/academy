package ex0805.homework.MVC_Collection.mvcColection.model.dto;

public class PhotoBoard extends Board {
    private String imgName;

    public PhotoBoard() {

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
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", 이미지 이름='").append(imgName).append('\'');
        sb.append("]");
        return sb.toString();
    }
}
