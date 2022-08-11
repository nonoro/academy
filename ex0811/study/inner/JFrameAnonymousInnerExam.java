package ex0811.inner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameAnonymousInnerExam extends JFrame { // BoarderLayoutManager 기본으로 가지고 있다.
    JButton btn1 = new JButton("클릭1");
    JButton btn2 = new JButton("클릭2");

    JTextField text = new JTextField(10);

    JTextArea textArea = new JTextArea(5, 10);

    int count = 0;
    /**
     * 주로 화면구성을 생성자에서 작성한다.
     */
    public JFrameAnonymousInnerExam() {
        super("JFrame실습입니다.");

        //JFrame의 LayoutManager를 변경하자
        setLayout(new FlowLayout());

        //JButton추가하기
//        add(btn1, BorderLayout.EAST);
//        add(btn2, BorderLayout.SOUTH);
        add(btn1);
        add(btn2);
        add(text);
        add(textArea);

        //창의 크기
        setSize(500, 400);

        //창의 위치 설정
//        setLocation(300, 200);
        setLocationRelativeTo(null); //정중앙에 놓기 (먼저 창의 크기가 정해져야함)


        //화면보여줘
        super.setVisible(true);

        //x를 클릭하면 프로그램 종료
        setDefaultCloseOperation(JFrameAnonymousInnerExam.EXIT_ON_CLOSE);

        //이벤트 등록 => 이벤트발생주체.addXxxListener(이벤트처리객체);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {    // 이게 익명의 inner클래스 버튼을 누를 때만 실행됨
                text.setText(count++ + "번 클릭 ");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(count++ + "번 클릭 \n");
            }
        });

        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                text.setText(e.getX() + " , " + e.getY());
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JFrameAnonymousInnerExam.this.setTitle("마우스 있다......");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setTitle("마우스 없다......"); // 현재 이 메소드안에 setTitle이 하나밖에 없기때문에 앞에 JFXX.this. 생략가능
            }
        });

    }

    public static void main(String[] args) {
        new JFrameAnonymousInnerExam();

    }

}

//////////////////////////////////////////////////////////////

