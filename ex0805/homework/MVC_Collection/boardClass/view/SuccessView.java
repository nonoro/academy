package ex0805.homework.MVC_Collection.boardClass.view;

import ex0805.homework.MVC_Collection.boardClass.model.dto.Board;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SuccessView {

    public SuccessView() {

    }

    public static void printBoard(Map<String, Map<String, Board>> allMap) {
        /*
        for (String key : allMap.keySet()) {
            System.out.println("--------------" + key + " Board의 모든 게시물--------------");
            Map<String, Board> boardRepository = allMap.get(key);
        */

           /* for (String boardKey : boardRepository.keySet()) {
                System.out.println(boardRepository.get(boardKey));
            }
            */

            /*
            // 내림차순으로 출력하기
            TreeMap<String, Board> tm = (TreeMap<String, Board>) boardRepository;
            Iterator<String> it = tm.descendingKeySet().iterator();
            while (it.hasNext()) {
                String k = it.next();
                System.out.println(boardRepository.get(k));
            }
             */

            /* 향상된 포문
            for (String s : tm.descendingKeySet()) {
                System.out.println(boardRepository.get(s));
            }
             } System.out.println();
            */
        if (allMap instanceof TreeMap) {
            TreeMap treeMap = (TreeMap) allMap;
            Iterator<String> it = treeMap.descendingKeySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                System.out.println("--------------" + key + " Board의 모든 게시물--------------");
                Map<String, Board> boardRepository = allMap.get(key);

                if (boardRepository instanceof TreeMap) {
                    TreeMap<String, Board> TreeBoardRepository = (TreeMap) boardRepository;
                    Iterator<String> itr = TreeBoardRepository.descendingKeySet().iterator();
                    while (itr.hasNext()) {
                        String k = itr.next();
                        System.out.println(TreeBoardRepository.get(k));
                    }
                    System.out.println();
                }
            }
        }
    }

    public static void printBoardByKind(String kind, Map<String, Board> kindMap) {
        System.out.println("=============" + kind + "유형의 게시물 List=================");
        for (String boardKey : kindMap.keySet()) {
            System.out.println(kindMap.get(boardKey));
        }
        System.out.println();
    }

    public static void printBoardByNo(Board board) {
        System.out.println(board);

    }

    public static void printMessage(String message) {
        System.out.println(message);
    }


}
