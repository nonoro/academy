package ex0816.study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class GuiThreadExam extends JFrame {
    JTextField text1 = new JTextField(5);
    JTextField text2 = new JTextField(5);

    JButton btn = new JButton("클릭");

    boolean state; // false (true이면 실행중. false이면 중지)


    public GuiThreadExam() {
        setLayout(new FlowLayout()); // JFrame의 레이아웃 변경

        Container con = super.getContentPane();
        con.add(text1);
        con.add(text2);
        con.add(btn);

        setSize(500, 400); // JFrame의 크기
        setLocationRelativeTo(null); // 프레임의 위치를 정중앙에 놓기
        setVisible(true); // JFrame은 기본적으로 인비저블상태라 안보임 그래서 이렇게 비지블 트루로 보이게 해야됨
        // x를 클릭했을때 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new TimerThread().start();
        new DecimalThread(text1).start();

        // 이벤트 등록
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // a ~ z까지 text박스에 출력
                if (!state) {
                    state = true;
                    new Thread() {
                        @Override
                        public void run() {
                            for (char ch = 'a'; ch <= 'z'; ch++ ) {
                                text2.setText(ch  + "");
                                try {
                                    Thread.sleep(100); // 0.1초
                                } catch (InterruptedException ex) {
                                    ex.printStackTrace();
                                }

                            } // for끝

                            state = false;
                        }
                    }.start();
                }

            }
        });

    }// 생성자 끝


    public static void main(String[] args) {
        new GuiThreadExam();
    }
    ///////////////////////////////////////////////////////////////////////////////

    /**
     * JFrame위에 시계를 동작하게 하는 Thread(1초마다 갱신)
     * inner클래스
     */
    class TimerThread extends Thread {
        @Override
        public void run() {
            while (true) {

                //현재 날짜와 시계
                Calendar now = Calendar.getInstance();

                int y = now.get(Calendar.YEAR);
                int m = now.get(Calendar.MONTH) + 1;
                int d = now.get(Calendar.DATE);

                int h = now.get(Calendar.HOUR_OF_DAY);
                int min = now.get(Calendar.MINUTE);
                int s = now.get(Calendar.SECOND);

                String time = y + "년" + m + "월" + d + "일 " + h + "시 " + min + "분 " + s + "초";

                GuiThreadExam.this.setTitle(time); // 중복되는 메소드가 아니면 GuiThreadExam.this. 생략가능
                try {
                    Thread.sleep(1000); // 1초 대기상태
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } // while끝
        } // run끝
    }

}// 클래스 끝
/////////////////////////////////////////////////////////////////////

/**
 * 1 ~ 1000까지 text박스에 출력하기
 * outer클래스 : 재사용성은 좋지만 서로 필요한 객체를 주고받는게 힘들다
 */
class DecimalThread extends Thread {
    private JTextField text;

    public DecimalThread(JTextField text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            // text박스에 숫자 출력
            text.setText(i + "");
            try {
                Thread.sleep(10); // 0.01초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////



