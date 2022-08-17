package ex0816.homework;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        /*Thread thread = new BeepThread();
        thread.start();*/
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {

                toolkit.beep();
                }
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                }
            }
        };

        thread.start();




        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

        }
    }
}
