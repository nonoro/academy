package ex0805.homework.MVC_Collection.boardClass.model.service;

/**
 * 모든 게시판이 공통으로 사용하게 될 Service
 * (Business Logic)
 */

import ex0805.homework.MVC_Collection.boardClass.model.dto.ArchiveBoard;
import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;
import ex0805.homework.MVC_Collection.boardClass.model.dto.PhotoBoard;
import ex0805.homework.MVC_Collection.boardClass.model.util.DuplicateException;
import ex0805.homework.MVC_Collection.boardClass.model.util.InexistentException;

import java.util.*;

public class BoardServiceImpl implements BoardService {

    private static BoardService boardService;

    Map<String, Map<String, Board>> allBoardList = new HashMap<>();
    Map<String, Board> archiveBoardRepository = new HashMap<>();
    Map<String, Board> photoBoardRepository = new HashMap<>();

    private BoardServiceImpl() {
        ResourceBundle archiveInfoProperties = ResourceBundle.getBundle("ex0805/homework/MVC_Collection/boardClass/model/dto/archiveInfo");// archive.properties
        ResourceBundle photoInfoProperties = ResourceBundle.getBundle("ex0805/homework/MVC_Collection/boardClass/model/dto/photoInfo");// photoInfo.properties

        for (String archiveInfoKey : archiveInfoProperties.keySet()) {
            String[] values = archiveInfoProperties.getString(archiveInfoKey).split(",");

            archiveBoardRepository.put(archiveInfoKey, ArchiveBoard.of(values));
            allBoardList.put("archive", archiveBoardRepository);
        }

        for (String photoInfoKey : photoInfoProperties.keySet()) {
            String[] values = photoInfoProperties.getString(photoInfoKey).split(",");

            photoBoardRepository.put(photoInfoKey, PhotoBoard.of(values));
            allBoardList.put("photo", photoBoardRepository);
        }
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

    /**
     * 모든 게시물 검색
     *
     * @return : 게시판 유형에 따른 모든 게시물 정보를 Map의 형태로 리턴
     * @throws : 게시물이 한개도 존재 하지 않는다면 InexistentException 예외가 발생한다.
     */
    @Override
    public Map<String, Map<String, Board>> getBoardList() {
        if (allBoardList != null) {
            return allBoardList;
        }
        throw new InexistentException("게시물이 존재하지 않습니다");
    }

    /**
     * 게시판의유형(Kind)에 따른 게시물 검색하기
     *
     * @param : 게시물유형에 따른 key를 인수로 전달받는다
     * @return : kind에 해당하는 전체게시물 Map으로 리턴
     * @throws : kind에 해당하는 게시물이 한개도 없을 때 InexistentException예외발
     */
    @Override
    public Map<String, Board> getBoardByKind(String kind) {
        Map<String, Board> boardKind = allBoardList.get(kind);
        if (boardKind == null) {
            throw new InexistentException(kind + " 유형의 게시판은 존재하지 않습니다");
        }
        return boardKind;
    }

    /**
     * 게시물 유형에서 글번호에 해당하는 게시물 한개를 검색
     *
     * @param : kind 는 게시물 유형,
     * @param : no 는 게시물 글번호
     * @return : 게시물 정보 한개를 Board 형태로 리턴
     * @throws : 검색하는 게시물이 없으면 InexistentException 예외발생
     */
    @Override
    public Board getBoardByNo(String kind, int no) {
        getBoardByKind(kind);

        Map<String, Board> boardRepository = allBoardList.get(kind);
        Board findBoard = boardRepository.get(String.valueOf(no));
        if (findBoard == null) {
            throw new InexistentException(kind + " 유형의 게시판에 " + no + "번 게시물은 존재하지 않습니다.");
        }

        return findBoard;
    }

    @Override
    public boolean insertBoard(String kind, Board board) {
        Map<String, Board> boardRepository = getBoardByKind(kind);

        if (!duplicateByNo(kind, board.getNo())) {
            boardRepository.put(String.valueOf(board.getNo()), board);
            return true;
        }

        return false;
    }

    @Override
    public boolean duplicateByNo(String kind, int no) {
        Map<String, Board> boardRepository = allBoardList.get(kind);
        if (!boardRepository.containsKey(String.valueOf(no))) {
            return false;
        }
        throw new DuplicateException(kind + "유형의 게시판에 " + no + "번호는 중복이므로 등록할 수 없습니다.");
    }

    @Override
    public boolean deleteBoard(String kind, int no) {
        return false;
    }

    @Override
    public boolean updateBoard(Board board, String kind) {
        return false;
    }
}
