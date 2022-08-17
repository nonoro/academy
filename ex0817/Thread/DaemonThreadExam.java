package ex0817.Thread;

public class DaemonThreadExam {
    public static void main(String[] args) {
        System.out.println("*********************** 메인 시작합니다 ****************************");

        Runnable r = () -> {
            while (true) {
                System.out.println("나는 데몬스레드입니다.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }

            }
        };

        Thread th = new Thread(r);
        th.setDaemon(true); // 나는 데몬쓰레드가 된다 -> 메인 쓰레드가 종료되면 함께 종료가 된다.
        th.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }


        System.out.println("*********************** 메인 종료합니다 ****************************");

    }
}

