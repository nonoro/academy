package ex0805.homework.MVC_Collection.boardClass.model.util;

public class InexistentException extends RuntimeException {
    public InexistentException() {

    }

    public InexistentException(String message) {
        super(message);
    }
}
