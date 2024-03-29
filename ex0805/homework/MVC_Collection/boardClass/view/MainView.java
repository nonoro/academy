package ex0805.homework.MVC_Collection.boardClass.view;


import ex0805.homework.MVC_Collection.boardClass.controller.BoardController;
import ex0805.homework.MVC_Collection.boardClass.model.dto.ArchiveBoard;
import ex0805.homework.MVC_Collection.boardClass.model.dto.PhotoBoard;
import ex0805.homework.MVC_Collection.boardClass.model.dto.FreeBoard;

public class MainView {

	public static void main(String[] args) {
		//1.archive와 photo 모든 게시물 검색
		System.out.println("1. 모든 게시물 검색");
		BoardController.getAllBoard();


		System.out.println("\n");

		//2. archive 또는 photo  게시판에 있는 모든 게시물 검색
		System.out.println("2. 게시판 유형에 따른 검색");

		System.out.println("2-1.게시판유형이 존재하는 경우.....");
		BoardController.getBoardByKind("archive");

		BoardController.getBoardByKind("photo");

		BoardController.getBoardByKind("Test");


		System.out.println("2-2.게시판유형이 없는 경우.....");
		BoardController.getBoardByKind("test.properties");


		System.out.println("\n");

		/*3.글번호에 해당하는 자료실검색
		 존재하는 게시물 검색할 경우와 없는 게시물 검색 각각 test.properties 결과 출력하기*/

		System.out.println("3.Board에서 글번호에 해당하는 게시물 검색");
		System.out.println("-----게시물이 존재하는 경우 검색 test.properties----- ");
		BoardController.getBoardByNo("archive", 10); //존재하는 게시물
		BoardController.getBoardByNo("photo", 10); //존재하는 게시물
		BoardController.getBoardByNo("Test", 10); //존재하는 게시물



		System.out.println();

		System.out.println("-----게시물이 없는 경우(글번호 오류)  검색 test.properties-----");
		BoardController.getBoardByNo("archive", 50);// 없는 게시물
		BoardController.getBoardByNo("Test", 50);// 없는 게시물


		System.out.println();

		System.out.println("-----게시물이 없는 경우(kind오류)  검색 test.properties-----");
		BoardController.getBoardByNo("test.properties", 10);// 없는 게시물

		System.out.println("\n");


		//4. 등록하기
		System.out.println("--4-1. 등록하기(성공!!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(40, "mvc공부", "장희정111", "재미있다.", "2018-08-18", "a.jpg"));

		System.out.println("--4-1. 등록하기(성공!!)");
		BoardController.insertBoard("Test" ,
				new FreeBoard(30, "집에가기", "김영철", "1시간전.", "2022-08-10", "7"));

		System.out.println("--4-2. 등록하기(실패!! - 글번호 중복!)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(10, "mvc공부", "장희정", "재미있다.", "2018-08-18", "a.jpg"));

		System.out.println("--4-2. 등록하기(실패!! - kind 잘못!!!!)");
		BoardController.insertBoard("photo2" ,
				new PhotoBoard(50, "mvc공부", "장희정", "재미있다.", "2018-08-18", "a.jpg"));

		System.out.println("--4-3. 등록하기(과연~)");
		BoardController.insertBoard("photo" ,
				new PhotoBoard(60, "mvc공부", "장희정", "재미있다.", "2018-08-18", "a.jpg"));

		System.out.println("---검색하기 --------");
		BoardController.getAllBoard();

		System.out.println("--5. 삭제하기..............");
		System.out.println("---5-1. 삭제성공하기-----------------");
		BoardController.deleteBoard("photo", 20);
		BoardController.deleteBoard("Test", 10);



		System.out.println("---5-2. 삭제실패하기(kind 오류) -----------------");
		BoardController.deleteBoard("test.properties", 20);


		System.out.println("---5-3. 삭제실패하기(글번호 오류) -----------------");
		BoardController.deleteBoard("photo", 70);

		System.out.println("---검색하기 --------");
		BoardController.getAllBoard();

		System.out.println("---6.수정하기----------------");
		System.out.println("--6-1. photo수정 완료-----------------");
		BoardController.updateBoard(new PhotoBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "test.properties.gif") , "photo");

		System.out.println("--6-2. archive수정 완료-----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "archive");

		System.out.println("--6-2. Test수정 완료-----------------");
		BoardController.updateBoard(new FreeBoard(20, "저녁시간", "김미정", "밥먹자", null, "100") , "Test");

		//게시판유형 잘못
		System.out.println("--6-3. 수정실패(kind 잘못) -----------------");
		BoardController.updateBoard(new ArchiveBoard(10, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "test.properties");

		System.out.println("--6-3. 수정실패(no 잘못) -----------------");
		BoardController.updateBoard(new ArchiveBoard(80, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "archive");

		System.out.println("--6-4. 수정실패(타입 오류) -----------------");
		BoardController.updateBoard(new ArchiveBoard(30, "점심시간", "이효리", "뭐 먹지??", null, "a.xls",300) , "photo");

		System.out.println("---검색하기 --------");
		BoardController.getAllBoard();
	}
}





