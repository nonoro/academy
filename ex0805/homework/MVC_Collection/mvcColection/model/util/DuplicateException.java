package ex0805.homework.MVC_Collection.mvcColection.model.util;

public class DuplicateException extends Exception {
    public DuplicateException() {

    }

    public DuplicateException(int no) {
        super(String.valueOf(no));
    }
}
