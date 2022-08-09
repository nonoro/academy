package ex0805.homework.MVC_Collection.mvcColection.controller;

import ex0805.homework.MVC_Collection.mvcColection.model.dto.Board;
import ex0805.homework.MVC_Collection.mvcColection.model.service.BoardService;
import ex0805.homework.MVC_Collection.mvcColection.model.service.BoardServiceImpl;

public class BoardController {

    BoardService service = BoardServiceImpl.getInstance();

    public BoardController() {

    }

    public static void getAllBoard() {
    }

    public static void getBoardByKind(String subject) {
    }

    public static void getBoardByno(String subject, int no) {

    }

    public static void insertBoard(String subject, Board board) {

    }

    public static void deleteBoard(String subject, int no) {

    }

    public static void updateBoard(Board board, String subject) {

    }

}
