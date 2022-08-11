package ex0811.GUIEventinner;

import javax.swing.*;

public class JFramExam extends JFrame {
    /**
     * 주로 화면구성을 생성자에서 작성한다.
     */
    public JFramExam() {
        super("JFrame실습입니다.");

        //창의 크기
        setSize(500, 400);

        //화면보여줘
        super.setVisible(true);

        //x를 클릭하면 프로그램 종료
        setDefaultCloseOperation(JFramExam.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JFramExam();
    }
}
