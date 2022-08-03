package ex0803.study.실습;

public class ExceptionExam extends Exception {
    static int count;

    public ExceptionExam() {
        super("애들은 가라");
        count++;
    }

    public ExceptionExam(String message) {
        super(message);
        count++;
    }

}
