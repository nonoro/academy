package ex0805.homework.MVC_Collection.boardClass.view;

import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;

import java.util.Map;

public class SuccessView {

    public SuccessView() {

    }

    public static void printBoard(Map<String, Map<String, Board>> board) {
        for (String key : board.keySet()) {
            System.out.println(key + " Board의 모든 게시물");
            Map<String, Board> boardRepository = board.get(key);

            for (String boardKey : boardRepository.keySet()) {
                System.out.println(boardRepository.get(boardKey));
            }

            System.out.println();
        }

    }

    public static void printBoardByKind(String kind, Map<String, Board> board) {
        System.out.println("=============" + kind + "유형의 게시물 List=================");
        for (String boardKey : board.keySet()) {
            System.out.println(board.get(boardKey));
        }
        System.out.println();
    }

    public static void printBoardByNo(Board board) {
        System.out.println(board);

    }

    public static void printMessage(String message) {

    }


}
