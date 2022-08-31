package ex0830_MVCDBBoard.mvc.service;

import ex0830_MVCDBBoard.mvc.dao.BoardDAO;
import ex0830_MVCDBBoard.mvc.dao.BoardDAOImpl;
import ex0830_MVCDBBoard.mvc.dto.BoardDTO;
import ex0830_MVCDBBoard.mvc.dto.ReplyDTO;

import java.sql.SQLException;
import java.util.List;

public class BoardServiceImpl implements BoardService {
    private BoardDAO boardDAO = new BoardDAOImpl();
    @Override
    public List<BoardDTO> boardSelectAll() throws SQLException {
        // DAO 호출하고 그 결과를 받아서 원하는 결과인지를 판단하고 아니면 예외발생 => 예외발생시 Controller의 catch블럭으로 이동
        List<BoardDTO> list = boardDAO.boardSelectAll();
        if (list.size() == 0) {
            throw new SQLException("게시물 정보가 없습니다.^^");
        }
        return list;
    }

    @Override
    public BoardDTO boardSelectByNo(int boardNo) throws SQLException {
        // DAO 호출하고 그 결과를 받아서 원하는 결과인지를 판단하고 아니면 예외발생
        BoardDTO boardDTO = boardDAO.boardSelectByNo(boardNo);
        if (boardDTO == null) {
            throw new SQLException(boardNo + "에 해당 하는 게시물이 존재하지 않습니다.");
        }
        return boardDTO;
    }

    @Override
    public List<BoardDTO> boardSelectBySubject(String keyWord) throws SQLException {
        List<BoardDTO> list = boardDAO.boardSelectBySubject(keyWord);
        if (list.size() == 0) {
            throw new SQLException("제목에 "+ keyWord +"을/를 포함한 게시물 없습니다");
        }
        return list;
    }


    @Override
    public void boardInsert(BoardDTO boardDTO) throws SQLException {
        int result = boardDAO.boardInsert(boardDTO);
        if (result == 0) {
            throw new SQLException("게시물 입력에 실패하였습니다");
        }
    }

    @Override
    public void boardUpdate(BoardDTO boardDTO) throws SQLException {
        int result = boardDAO.boardUpdate(boardDTO);
        if (result == 0) {
            throw new SQLException("존재하지 않는 게시물이므로 수정에 실패하였습니다");
        }
    }

    @Override
    public void boardDelete(int boardNo) throws SQLException {
        int result = boardDAO.boardDelete(boardNo);
        if (result == 0) {
            throw new SQLException("존재하지 않는 게시물이므로 게시물 삭제 실패하였습니다.");
        }
    }

    @Override
    public void replyInsert(ReplyDTO replyDTO) throws SQLException {
        int result = boardDAO.replyInsert(replyDTO);
        if (result == 0) {
            throw new SQLException("댓글 등록에 실패하였습니다.");
        }
    }

    @Override
    public BoardDTO replySelectByParentNo(int boardNo) throws SQLException {
        BoardDTO boardDTO = boardDAO.replySelectByParentNo(boardNo);
        System.out.println(boardDTO);
        if (boardDTO == null) {
            throw new SQLException("부모글이 존재하지 않습니다");
        } else if (boardDTO.getRepliesList().size() == 0) {
            throw new SQLException(boardNo + "에 해당하는 댓글의 정보가 없습니다");
        }

        return boardDTO;
    }
}
