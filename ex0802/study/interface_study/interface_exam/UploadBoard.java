package ex0802.study.interface_study.interface_exam;

public class UploadBoard extends Board {
    private String fileName;

    public UploadBoard() {

    }

    public UploadBoard(int bno, String subject, String writer, String content, String fileName) {
        super(bno, subject, writer, content);
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", fileName='").append(fileName).append('\'');
        return sb.toString();
    }
}
