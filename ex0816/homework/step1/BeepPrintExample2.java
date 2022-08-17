package ex0816.homework;

import java.awt.*;

// 메인 쓰레드만 이용한 경우
public class BeepPrintExample2 {
    public static void main(String[] args) {
 /*       Toolkit toolkit = Toolkit.getDefaultToolkit();
        Runnable beepTask = new BeepTask();*/
        /*Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });*/
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });
        thread.start();
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

