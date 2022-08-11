package ex0805.homework.MVC_Collection.boardClass.model.service;

/**
 * 모든 게시판이 공통으로 사용하게 될 Service
 * (Business Logic)
 */

import ex0805.homework.MVC_Collection.boardClass.model.dto.ArchiveBoard;
import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;
import ex0805.homework.MVC_Collection.boardClass.model.dto.PhotoBoard;
import ex0805.homework.MVC_Collection.boardClass.model.dto.FreeBoard;
import ex0805.homework.MVC_Collection.boardClass.model.util.DuplicateException;
import ex0805.homework.MVC_Collection.boardClass.model.util.InexistentException;

import java.util.*;

public class BoardServiceImpl implements BoardService {

    private static BoardService boardService;

    Map<String, Map<String, Board>> allBoardList = new TreeMap<>();


    private BoardServiceImpl() {

        // 각 kind에 해당하는 Map 준비
        Map<String, Board> archiveBoardRepository = new TreeMap<>();
        Map<String, Board> photoBoardRepository = new TreeMap<>();
        Map<String, Board> freeBoardRepository = new TreeMap<>();


        // 외부 ~.properties파일 로딩하기
        ResourceBundle archiveInfoProperties = ResourceBundle.getBundle("ex0805/homework/MVC_Collection/boardClass/model/dto/archiveInfo");// archive.properties
        ResourceBundle photoInfoProperties = ResourceBundle.getBundle("ex0805/homework/MVC_Collection/boardClass/model/dto/photoInfo");// photoInfo.properties
        ResourceBundle freeBoardProperties = ResourceBundle.getBundle("ex0805/homework/MVC_Collection/boardClass/model/dto/test");// photoInfo.properties

        // key와 value를 분리한다.
        for (String archiveInfoKey : archiveInfoProperties.keySet()) {
            String value = archiveInfoProperties.getString(archiveInfoKey); // no,subject,writer,content,date,fileName,fileSize 값이 value에 들어감

            // value를 콤마를 기준으로 정보를 분리한다. : split(구분자) 메소드 이용
            String[] values = value.split(",");

            // 분리된 value를 하나의 Board객체로 만든다.
            // 각 kind에 해당하는 Map에 추가한다.
            archiveBoardRepository.put(archiveInfoKey, ArchiveBoard.of(values));
        }


        // key와 value를 분리한다.
        for (String photoInfoKey : photoInfoProperties.keySet()) {
            String value = photoInfoProperties.getString(photoInfoKey);

            // value를 콤마를 기준으로 정보를 분리한다. : split(구분자) 메소드 이용
            String[] values = value.split(",");

            // 분리된 value를 하나의 Board객체로 만든다.
            // 각 kind에 해당하는 Map에 추가한다.
            photoBoardRepository.put(photoInfoKey, PhotoBoard.of(values));
        }

        // key와 value를 분리한다.
        for (String testKey : freeBoardProperties.keySet()) {
            String value = freeBoardProperties.getString(testKey);

            // value를 콤마를 기준으로 정보를 분리한다. : split(구분자) 메소드 이용
            String[] values = value.split(",");

            // 분리된 value를 하나의 Board객체로 만든다.
            // 각 kind에 해당하는 Map에 추가한다.
            freeBoardRepository.put(testKey, FreeBoard.of(values));
        }
        // allBoardList에 각 해당하는 kind에 board값을 넣어준다
        allBoardList.put("archive", archiveBoardRepository);
        allBoardList.put("photo", photoBoardRepository);
        allBoardList.put("Test", freeBoardRepository);
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
        if (allBoardList == null || allBoardList.isEmpty()) {
            throw new InexistentException("게시물이 존재하지 않습니다");
        }
        return allBoardList;
    }

    /**
     * 게시판의유형(Kind)에 따른 게시물 검색하기
     *
     * @param : 게시물유형에 따른 key를 인수로 전달받는다
     * @return : kind에 해당하는 전체게시물 Map으로 리턴
     * @throws : kind에 해당하는 게시물이 한개도 없을 때 InexistentException예외발생
     */
    @Override
    public Map<String, Board> getBoardByKind(String kind) {
        Map<String, Board> boardKind = allBoardList.get(kind);
        if (boardKind == null) {
            throw new InexistentException(kind + " 유형의 게시판은 존재하지 않습니다");
        } else if (boardKind.isEmpty()) {
            throw new InexistentException(kind + " 유형의 게시판에 게시물이 없습니다");
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
        Map<String, Board> boardRepository = getBoardByKind(kind);
        Board findBoard = boardRepository.get(String.valueOf(no));
        if (findBoard == null) {
            throw new InexistentException(kind + " 유형의 게시판에 " + no + "번 게시물은 존재하지 않습니다.");
        }

        return findBoard;
    }

    @Override
    public void insertBoard(String kind, Board board) {
        // kind유무 체크
        Map<String, Board> boardRepository = getBoardByKind(kind);

        // boardRepository가 있으니 글번호 중복체크
        if (duplicateByNo(kind, board.getNo())) {
            throw new DuplicateException(kind + "유형의 게시판에 " + board.getNo() + "번호는 중복이므로 등록할 수 없습니다.");
        }
        boardRepository.put(String.valueOf(board.getNo()), board);
    }

    @Override
    public boolean duplicateByNo(String kind, int no) {
        Map<String, Board> boardRepository = allBoardList.get(kind);
        if (boardRepository.containsKey(String.valueOf(no))) {
            return true;
        }
        return false;
    }

    @Override
    public void deleteBoard(String kind, int no) {
        getBoardByNo(kind, no);
        allBoardList.get(kind).remove(String.valueOf(no));
//        Map<String, Board> board = getBoardByKind(kind);
//        getBoardByNo(kind, no);
//        board.remove(String.valueOf(no));
    }

    @Override
    public void updateBoard(Board board, String kind) {
        // kind에 해당하는 Map을 찾고 그 안에 board.getNo()에 해당하는 키가 있는지 찾는다.
        Board savedBoard = getBoardByNo(kind, board.getNo());
        if (board instanceof ArchiveBoard && savedBoard instanceof ArchiveBoard) {
            ArchiveBoard castingBoard = (ArchiveBoard) board;
            ArchiveBoard castingSavedBoard = (ArchiveBoard) savedBoard;

            castingSavedBoard.setSubject(castingBoard.getSubject());
            castingSavedBoard.setContent(castingBoard.getContent());
            castingSavedBoard.setWriter(castingBoard.getWriter());

            castingSavedBoard.setFileName(castingBoard.getFileName());
            castingSavedBoard.setFileSize(castingBoard.getFileSize());
        } else if (board instanceof PhotoBoard && savedBoard instanceof PhotoBoard) {
            PhotoBoard castingBoard = (PhotoBoard) board;
            PhotoBoard castingSavedBoard = (PhotoBoard) savedBoard;

            castingSavedBoard.setSubject(castingBoard.getSubject());
            castingSavedBoard.setContent(castingBoard.getContent());
            castingSavedBoard.setWriter(castingBoard.getWriter());

            castingSavedBoard.setImgName(castingBoard.getImgName());
        } else if (board instanceof FreeBoard && savedBoard instanceof FreeBoard) {
            FreeBoard castingBoard = (FreeBoard) board;
            FreeBoard castingSavedBoard = (FreeBoard) savedBoard;

            castingSavedBoard.setSubject(castingBoard.getSubject());
            castingSavedBoard.setContent(castingBoard.getContent());
            castingSavedBoard.setWriter(castingBoard.getWriter());

            castingSavedBoard.setViews(castingBoard.getViews());
        } else {
            throw new InexistentException("타입 오류로 수정 할 수 없습니다.");
        }
//        allBoardList.get(kind).put(String.valueOf(board.getNo()), board);
    }
}
