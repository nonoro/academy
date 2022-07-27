package ex0727.수업.exam;

public class  StartView{
	public static void main(String[] args) {
		String [][] data = new String [][]{
				{"A01" , "새우깡" , "2500" , "짜고맛나다."},  // ---> Goods
				{"A02" , "고구마깡" , "1500" , "달고맛나다."},  // ---> Goods
				{"A03" , "감자깡" , "2300" , "짜고 조금 맛나다."},  // ---> Goods
				{"A04" , "허니버터칩" , "2800" , "짜고달고맛나다."},  // ---> Goods
				{"A05" , "콘칩" , "1200" , "짜다."}  // ---> Goods
			};

		System.out.println("*************프로그램을 시작합니다.*****************************");

		new MenuView().printMenu(data); // MenuView를 생성하면 MenuView 초기화

	}
}
