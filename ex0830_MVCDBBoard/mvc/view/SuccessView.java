package ex0830_MVCDBBoard.mvc.view;

import ex0830_MVCDBBoard.mvc.dto.BoardDTO;
import ex0830_MVCDBBoard.mvc.dto.ReplyDTO;

import java.util.List;



public class SuccessView {

	public static void selectPrint(List<BoardDTO> list) {
		System.out.println("----Board LIST ("+list.size()+") 개 ------------------");
		for(BoardDTO board : list) {
			System.out.println(board);//board.toString()호출
		}

	}

	public static void messagePrint(String message) {
		System.out.println(message);

	}

	public static void selectByNoPrint(BoardDTO boardDTO) {
		System.out.println(boardDTO);

	}

	public static void selectReplyPrint(BoardDTO boardDTO) {
		System.out.println("댓글 개수 : " + boardDTO.getRepliesList().size() +"개 ---------");
		for(ReplyDTO reply : boardDTO.getRepliesList()) {
			System.out.println("       ▶ " + reply );
		}

	}

}












