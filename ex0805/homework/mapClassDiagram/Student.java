package ex0805.homework.mapClassDiagram;

public class Student extends Person {
    private int kor;
    private int eng;
    private int math;
    private int sum;

    public Student() {

    }


    public Student(String id, String name, int age, int kor, int eng, int math) {
        super(id, name);

        this.kor = age;
        this.eng = kor;
        this.math = eng;
        //총점구하기
        this.sum = kor + eng + math;
    }

    // 수정할때 사용할 생성자
    public Student(String id, String name, int kor, int eng, int math) {
        super(id, name);

        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student : ");
        sb.append(super.toString());
        sb.append("kor=").append(kor);
        sb.append(", eng=").append(eng);
        sb.append(", math=").append(math);
        sb.append(", sum=").append(sum);
        return sb.toString();
    }
}
