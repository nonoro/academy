package ex0830_MVCDBBoard.mvc.controller;

import ex0830_MVCDBBoard.mvc.dto.BoardDTO;
import ex0830_MVCDBBoard.mvc.dto.ReplyDTO;
import ex0830_MVCDBBoard.mvc.service.BoardService;
import ex0830_MVCDBBoard.mvc.service.BoardServiceImpl;
import ex0830_MVCDBBoard.mvc.view.FailView;
import ex0830_MVCDBBoard.mvc.view.SuccessView;

import java.sql.SQLException;
import java.util.List;

public class BoardController {
    private static BoardService boardService = new BoardServiceImpl();

    public static void boardSelectByAll() {
        // 서비스 호출하고 그 결과에 따라 성공 또는 실패 뷰로 이동한다.
        try {
            List<BoardDTO> list = boardService.boardSelectAll();
            SuccessView.selectPrint(list);
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void boardSelectByNo(int parseInt) {
        // 서비스를 호출하고 그 결과에 따라 성공 또는 실패 뷰로 이동한다.
        try {
            BoardDTO boardDTO = boardService.boardSelectByNo(parseInt);
            SuccessView.selectByNoPrint(boardDTO);
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void boardSelectBySubject(String word) {
        // 서비스를 호출하고 그 결과에 따라 성공 또는 실패 뷰로 이동한다.
        try {
            List<BoardDTO> list = boardService.boardSelectBySubject(word);
            SuccessView.selectPrint(list);
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void boardInsert(BoardDTO board) {
        try {
            boardService.boardInsert(board);
            SuccessView.messagePrint("게시물 등록이 완료되었습니다.");
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void boardUpdate(BoardDTO board) {
        try {
            boardService.boardUpdate(board);
            SuccessView.messagePrint("게시물 수정이 완료되었습니다.");
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }

    }

    public static void boardDelete(int no) {
        try {
            boardService.boardDelete(no);
            SuccessView.messagePrint("게시물 삭제가 완료되었습니다.");
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void replySelectByParentNo(int boardNo) {
        try {
            BoardDTO boardDTO = boardService.replySelectByParentNo(boardNo);
            SuccessView.selectReplyPrint(boardDTO);
        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }
    }

    public static void replyInsert(ReplyDTO replyDTO) {
        try {
            boardService.replyInsert(replyDTO);
            SuccessView.messagePrint(replyDTO.getBoardNo() + "번 게시물의 댓글 등록이 완료되었습니다.");

        } catch (SQLException e) {
            FailView.errorMessage(e.getMessage());
        }


    }
}
