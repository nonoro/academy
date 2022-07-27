package ex0726.exam;

/*
    시작
 */

import ex0726.exam.view.MenuView;

public class StartView {
    public static void main(String[] args) {
    String [][] data = new String[][] {
            {"A01" , "새우깡" , "2500" , "짜고맛나다."},  // ---> Goods
            {"A02" , "고구마깡" , "1500" , "달고맛나다."},  // ---> Goods
            {"A03" , "감자깡" , "2300" , "짜고 조금 맛나다."},  // ---> Goods
            {"A04" , "허니버터칩" , "2800" , "짜고달고맛나다."},  // ---> Goods
            {"A05" , "콘칩" , "1200" , "짜다."}  // ---> Goods
    };



        new MenuView().printMenu(data);
    }
}
