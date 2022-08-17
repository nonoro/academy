package ex0817.Thread;

public class InterruptedExam {
    public static void main(String[] args) {
        System.out.println("*** 메인 시작합니다 *******************");
        Thread th = new Thread(() -> {
            try {                       // interrupt는 이렇게 while문안으로 멈추게하는 쓰레드메소드가 들어가야한다.
                while (true) {
                    System.out.println("Thread 재미있다.........");
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
            }
        });

        th.start();

        // 3초가 지나면 th 스레드를 종료시킨다.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }

        // interrupt()는 스레드가 잠시 일시중지상태가 되어야만 현재 스레드를 중지시킬수있다.
        th.interrupt(); // th 스레드를 중지시켜라


        System.out.println("*** 메인 종료합니다 *******************");

    }
}
