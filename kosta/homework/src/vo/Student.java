package kosta.homework.src.vo;

public class Student {
    private int 수강생번호;
    private String 수_이름;
    private String 수_주민등록번호;
    private String 수_연락처;
    private String 수_주소;
    private String 수_이메일;

    public Student() {
    }

    public Student(int 수강생번호, String 수_이름, String 수_주민등록번호, String 수_연락처, String 수_주소, String 수_이메일) {
        this.수강생번호 = 수강생번호;
        this.수_이름 = 수_이름;
        this.수_주민등록번호 = 수_주민등록번호;
        this.수_연락처 = 수_연락처;
        this.수_주소 = 수_주소;
        this.수_이메일 = 수_이메일;
    }

    public int get수강생번호() {
        return 수강생번호;
    }

    public void set수강생번호(int 수강생번호) {
        this.수강생번호 = 수강생번호;
    }

    public String get수_이름() {
        return 수_이름;
    }

    public void set수_이름(String 수_이름) {
        this.수_이름 = 수_이름;
    }

    public String get수_주민등록번호() {
        return 수_주민등록번호;
    }

    public void set수_주민등록번호(String 수_주민등록번호) {
        this.수_주민등록번호 = 수_주민등록번호;
    }

    public String get수_연락처() {
        return 수_연락처;
    }

    public void set수_연락처(String 수_연락처) {
        this.수_연락처 = 수_연락처;
    }

    public String get수_주소() {
        return 수_주소;
    }

    public void set수_주소(String 수_주소) {
        this.수_주소 = 수_주소;
    }

    public String get수_이메일() {
        return 수_이메일;
    }

    public void set수_이메일(String 수_이메일) {
        this.수_이메일 = 수_이메일;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student[");
        sb.append("수강생번호=").append(수강생번호);
        sb.append(", 수_이름='").append(수_이름).append('\'');
        sb.append(", 수_주민등록번호='").append(수_주민등록번호).append('\'');
        sb.append(", 수_연락처='").append(수_연락처).append('\'');
        sb.append(", 수_주소='").append(수_주소).append('\'');
        sb.append(", 수_이메일='").append(수_이메일).append('\'');
        sb.append(']');
        return sb.toString();
    }
}
