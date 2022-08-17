package ex0816.study;

public class ThreadExam {

    /**
     * 1 ~ 100 까지 찍을건데 중간중간 a b c의 영문이 찍히게 하는 멀티쓰레드를 만들어보자!
     */
    public static void main(String[] args) {
        System.out.println("*******메인 시작합니다*************************");
        NumberThread th1 = new NumberThread("첫번째 쓰레드");
        NumberThread th2 = new NumberThread("두번째 쓰레드");
        AlphaThread alpha = new AlphaThread();
        Thread th3 = new Thread(alpha, "세번째 Thread");


        // 이건그냥 메소드 호출과 다를 바가 없음
//        th1.run();
//        th2.run();
//        th3.run();

        // 우선순위 우선순위를 준다고해서 우선순위 제일 높은거 다 출력되고 나머지가 되는건 아님
//        th1.setPriority(Thread.MAX_PRIORITY);
//        th2.setPriority(Thread.MIN_PRIORITY);


        // 이게 멀티 쓰레드
        th1.start();
        th2.start();
        th3.start();

        // join() : 특정한 Thread가 일을 다 마칠때까지 아래 문장을 대기
/*        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("총 합 = " + th1.sum);

        System.out.println("*******메인 끝 입니다.*************************");
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////

/**
 * 1 ~ 100까지 출력하는 기능을 가진 쓰레드
 */
class NumberThread extends Thread {
    int sum;
    public NumberThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(super.getName() + " => " + i + ", getPriority = " + super.getPriority()); // getPriority 우선순위 확인
            sum += i;
/*            try {
                Thread.sleep(100); // 0.1초 대기(현재 쓰래드를 중지상태로 만든다 - 일정시간이 끝나면 대기(준비)상태로 간다.)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Thread.yield(); // 양보(실행중 상태에서 대기상태로 이동)
        }
        System.out.println(super.getName());

    }
}

/**
 * a ~ z까지 출력하는 기능을 가진 쓰레드
 */
class AlphaThread implements Runnable {

    @Override
    public void run() {
        Thread th = Thread.currentThread(); // 현재 실행중인 Thread객체

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(th.getName() + "=> " + ch + ", getPriority = " + th.getPriority());
/*            try {
                Thread.sleep(30); // 0.03초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Thread.yield(); // 양보(실행중 상태에서 대기상태로 이동)
        }
        System.out.println(th.getName() + " ===> 종료!!!!" );

    }
}