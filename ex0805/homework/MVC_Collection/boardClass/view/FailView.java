package ex0805.homework.MVC_Collection.boardClass.view;

public class FailView {
    public FailView() {

    }

    public static void errorMessage(Exception e) {
        System.out.println(e.getMessage());
    }
}
