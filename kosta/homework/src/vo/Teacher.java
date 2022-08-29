package vo;

public class Teacher {
    private int 강사번호;
    private String 강사이름;
    private String 주민등록번호;
    private String 연락처;
    private String 주소;
    private String 이메일;
    private String 수강코드;

    public Teacher() {
    }

    public Teacher(int 강사번호, String 강사이름, String 주민등록번호, String 연락처, String 주소, String 이메일, String 수강코드) {
        this.강사번호 = 강사번호;
        this.강사이름 = 강사이름;
        this.주민등록번호 = 주민등록번호;
        this.연락처 = 연락처;
        this.주소 = 주소;
        this.이메일 = 이메일;
        this.수강코드 = 수강코드;
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

    public String get주민등록번호() {
        return 주민등록번호;
    }

    public void set주민등록번호(String 주민등록번호) {
        this.주민등록번호 = 주민등록번호;
    }

    public String get연락처() {
        return 연락처;
    }

    public void set연락처(String 연락처) {
        this.연락처 = 연락처;
    }

    public String get주소() {
        return 주소;
    }

    public void set주소(String 주소) {
        this.주소 = 주소;
    }

    public String get이메일() {
        return 이메일;
    }

    public void set이메일(String 이메일) {
        this.이메일 = 이메일;
    }

    public String get수강코드() {
        return 수강코드;
    }

    public void set수강코드(String 수강코드) {
        this.수강코드 = 수강코드;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teacher[");
        sb.append("강사번호=").append(강사번호);
        sb.append(", 강사이름='").append(강사이름).append('\'');
        sb.append(", 주민등록번호='").append(주민등록번호).append('\'');
        sb.append(", 연락처='").append(연락처).append('\'');
        sb.append(", 주소='").append(주소).append('\'');
        sb.append(", 이메일='").append(이메일).append('\'');
        sb.append(", 수강코드='").append(수강코드).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
