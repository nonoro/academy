package ex0816.homework;

import java.awt.*;

// 메인 쓰레드만 이용한 경우
public class BeepPrintExample1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 발생
            try {
                Thread.sleep(500); // 0.5초 일시정지
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            for (int j = 0; j < 5; j++) {
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }

}

