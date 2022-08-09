package ex0805.homework.MVC_Collection.mvcColection.view;

import ex0802.study.interface_study.interface_exam.Board;

import java.util.Map;

public class SuccessView {

    public SuccessView() {

    }

    public static void printBoard(Map<String, Map<String, Board>> board) {
        System.out.println(board);
    }

    public static void printBoardByKind(String subject, Map<String, Board> board) {

    }

    public static void printBoardByNo(Board board) {

    }

    public static void printMessage(String message) {

    }


}
