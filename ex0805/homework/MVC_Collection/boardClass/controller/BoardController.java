package ex0805.homework.MVC_Collection.boardClass.controller;

import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;
import ex0805.homework.MVC_Collection.boardClass.model.service.BoardService;
import ex0805.homework.MVC_Collection.boardClass.model.service.BoardServiceImpl;
import ex0805.homework.MVC_Collection.boardClass.model.util.DuplicateException;
import ex0805.homework.MVC_Collection.boardClass.model.util.InexistentException;
import ex0805.homework.MVC_Collection.boardClass.view.FailView;
import ex0805.homework.MVC_Collection.boardClass.view.SuccessView;

import java.util.Map;

public class BoardController {

    private static final BoardService service = BoardServiceImpl.getInstance();

    public BoardController() {

    }

    public static void getAllBoard() {
        try {
            Map<String, Map<String, Board>> boardList = service.getBoardList();
            SuccessView.printBoard(boardList);
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }

    }

    public static void getBoardByKind(String kind) {
        try {
            Map<String, Board> board = service.getBoardByKind(kind);
            SuccessView.printBoardByKind(kind, board);
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }
    }

    public static void getBoardByNo(String subject, int no) {
        try {
            Board board = service.getBoardByNo(subject, no);
            SuccessView.printBoardByNo(board);
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }

    }

    public static void insertBoard(String kind, Board board) {
        try {
            service.insertBoard(kind, board);
        } catch (DuplicateException | InexistentException e) {
            FailView.errorMessage(e);
        }
            SuccessView.printMessage("등록이 완료되었습니다");

    }


    public static void deleteBoard(String subject, int no) {

    }

    public static void updateBoard(Board board, String subject) {

    }

}
