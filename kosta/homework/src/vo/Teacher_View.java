package vo;

public class Teacher_View {
    private int 강사번호;
    private String 강사이름;
    private String 수강코드;
    private String 과목;
    private int 강의실번호;
    private int 수용인원;

    public Teacher_View() {
    }

    public Teacher_View(int 강사번호, String 강사이름, String 수강코드, String 과목, int 강의실번호, int 수용인원) {
        this.강사번호 = 강사번호;
        this.강사이름 = 강사이름;
        this.수강코드 = 수강코드;
        this.과목 = 과목;
        this.강의실번호 = 강의실번호;
        this.수용인원 = 수용인원;
    }

    public int get강사번호() {
        return 강사번호;
    }

    public void set강사번호(int 강사번호) {
        this.강사번호 = 강사번호;
    }

    public String get강사이름() {
        return 강사이름;
    }

    public void set강사이름(String 강사이름) {
        this.강사이름 = 강사이름;
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

    public int get강의실번호() {
        return 강의실번호;
    }

    public void set강의실번호(int 강의실번호) {
        this.강의실번호 = 강의실번호;
    }

    public int get수용인원() {
        return 수용인원;
    }

    public void set수용인원(int 수용인원) {
        this.수용인원 = 수용인원;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher_view[");
        sb.append("강사번호=").append(강사번호);
        sb.append(", 강사이름='").append(강사이름).append('\'');
        sb.append(", 수강코드='").append(수강코드).append('\'');
        sb.append(", 과목='").append(과목).append('\'');
        sb.append(", 강의실번호=").append(강의실번호);
        sb.append(", 수용인원=").append(수용인원);
        sb.append(']');
        return sb.toString();
    }
}
