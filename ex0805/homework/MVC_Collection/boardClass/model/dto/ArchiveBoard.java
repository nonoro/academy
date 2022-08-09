package ex0805.homework.MVC_Collection.boardClass.model.dto;

import ex0805.map.propertiesExam.PropertiesExam;

import java.util.ResourceBundle;

public class ArchiveBoard extends Board {
    private String fileName;
    private int fileSize;

    public ArchiveBoard() {

    }


    public ArchiveBoard(int no, String subject, String writer, String content, String date, String fileName, int fileSize) {
        super(no, subject, writer, content, date);
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    public static ArchiveBoard of(String[] values) {
        return new ArchiveBoard(Integer.parseInt(values[0]), values[1], values[2], values[3], values[4], values[5], Integer.parseInt(values[6]));
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", 첨부파일 이름 : '").append(fileName).append('\'');
        sb.append(", 파일 용량 : ").append(fileSize);
        sb.append("]");
        return sb.toString();
    }
}
