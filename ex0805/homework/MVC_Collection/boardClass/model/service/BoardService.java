package ex0805.homework.MVC_Collection.boardClass.model.service;

import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;
import ex0805.homework.MVC_Collection.boardClass.model.util.InexistentException;

import java.util.Map;

public interface BoardService {
    public Map<String, Map<String, Board>> getBoardList();

    public Map<String, Board> getBoardByKind(String kind);

    public Board getBoardByNo(String kind, int no);

    public void insertBoard(String kind, Board board);

    public boolean duplicateByNo(String kind, int no);

    public void deleteBoard(String kind, int no);

    public void updateBoard(Board board, String kind);

}
