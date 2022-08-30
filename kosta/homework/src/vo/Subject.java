package kosta.homework.src.vo;

public class Subject {
    private String 수강코드;
    private String 과목;

    public Subject() {
    }

    public Subject(String 수강코드, String 과목) {
        this.수강코드 = 수강코드;
        this.과목 = 과목;
    }

    public String get수강코드() {
        return 수강코드;
    }

    public void set수강코드(String 수강코드) {
        this.수강코드 = 수강코드;
    }

    public String get과목() {
        return 과목;
    }

    public void set과목(String 과목) {
        this.과목 = 과목;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject[");
        sb.append("수강코드='").append(수강코드).append('\'');
        sb.append(", 과목='").append(과목).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
