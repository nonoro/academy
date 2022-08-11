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

    /**
     * 전체검색
     */

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

    public static void getBoardByNo(String kind, int no) {
        try {
            Board board = service.getBoardByNo(kind, no);
            SuccessView.printBoardByNo(board);
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }

    }

    public static void insertBoard(String kind, Board board) {
        try {
            service.insertBoard(kind, board);
            SuccessView.printMessage("등록이 완료되었습니다");
        } catch (DuplicateException | InexistentException e) {
            FailView.errorMessage(e);
        }


    }


    public static void deleteBoard(String kind, int no) {
        try {
            service.deleteBoard(kind, no);
            SuccessView.printMessage(kind + "게시판의 " + no + "번 게시물이 삭제되었습니다");
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }
    }

    public static void updateBoard(Board board, String kind) {
        try {
            service.updateBoard(board, kind);
            SuccessView.printMessage(kind + "게시판의 " + board.getNo() + "번 게시물이 수정되었습니다");
        } catch (InexistentException e) {
            FailView.errorMessage(e);
        }
    }

}
