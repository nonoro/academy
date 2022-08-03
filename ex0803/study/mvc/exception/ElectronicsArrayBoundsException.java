package ex0803.study.mvc.exception;
/**
 * Electronics 배열에 값을 넣을때 배멸읠 길이가 벗어났을때 발생할 예외객체
 */
public class ElectronicsArrayBoundsException extends Exception {
    public ElectronicsArrayBoundsException() {

    }

    public ElectronicsArrayBoundsException(String message) {
        super(message);
    }
}
