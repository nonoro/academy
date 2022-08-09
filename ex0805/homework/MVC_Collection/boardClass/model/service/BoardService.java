package ex0805.homework.MVC_Collection.boardClass.model.service;

import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;

import java.util.Map;

public interface BoardService {
    public Map<String, Map<String, Board>> getBoardList();

    public Map<String, Board> getBoardByKind(String subject);

    public Board getBoardByNo(String subject, int no);

    public boolean insertBoard(String subject, Board board);

    public boolean duplicateByNo(String subject, int no);

    public boolean deleteBoard(String subject, int no);

    public boolean updateBoard(Board board, String subject);

}
