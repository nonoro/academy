package ex0726.과제;//TwoDmArrayExam.java

import java.util.Arrays;

class TwoDmArray {
    //String을 저장하는 twoDmArray 배열선언
    String[][] twoDmArray = new String[10][];

    //메소드 make2DmArray
    //twoDmArray 배열에  값을 할당
    public void make2DmArray() {
        for (int i = 0; i < twoDmArray.length; i++) {
            twoDmArray[i] = new String[i + 1];
            for (int j = 0; j < i + 1; j++) {
                twoDmArray[i][j] = (i + 1) + "동" + (j + 1) + "호";
            }
        }
    }

    //메소드 print2DmArray
    //	twoDmArray 배열의 값을 주어진형식으로 출력
    public void print2DmArray() {
        for (int i = 0; i < twoDmArray.length; i++) {
            if (i > 0) {
                for (int x = 0; x < i; x++) {
                    System.out.print("\t\t");
                }
            }
            for (int j = i; j < twoDmArray.length; j++) {
                System.out.print(twoDmArray[j][i] + "\t");
            }
            System.out.println();
        }
    }
}


public class TwoDmArrayExam {
    //main메소드에서
    public static void main(String[] args) {
        TwoDmArray td = new TwoDmArray();
        td.make2DmArray();
        td.print2DmArray();
    }
}


/*
  본인이름: 권규정
  날짜: 22.07.26
  주제 : 동호수찍기
*/

