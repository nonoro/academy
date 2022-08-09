package ex0805.homework.MVC_Collection.mvcColection.model.service;

import ex0805.homework.MVC_Collection.mvcColection.model.dto.Board;

import java.util.HashMap;
import java.util.Map;

public class BoardServiceImpl implements BoardService {

    private static BoardService boardService;

    Map<String, Map<String, Board>> allBoardList = new HashMap<>();

    private BoardServiceImpl() {

    }

    public static BoardService getInstance() {
        /*
        'lazy'의 개념: 프로그래밍에서 lazy라는 개념은 필요할 때, 바로 실행하지 않고
          미루다가 필요한 순간 그때 어떠한 행위를 하겠다는 의미
        */
        if (boardService == null) {
            boardService = new BoardServiceImpl();
        }
        return boardService;
    }

    @Override
    public Map<String, Map<String, Board>> getBoardList() {
        return null;
    }

    @Override
    public Map<String, Board> getBoardByKind(String subject) {
        return null;
    }

    @Override
    public Board getBoardByNo(String subject, int no) {
        return null;
    }

    @Override
    public boolean insertBoard(String subject, Board board) {
        return false;
    }

    @Override
    public boolean duplicateByNo(String subject, int no) {
        return false;
    }

    @Override
    public boolean deleteBoard(String subject, int no) {
        return false;
    }

    @Override
    public boolean updateBoard(Board board, String subject) {
        return false;
    }
}
