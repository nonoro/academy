package ex0817.step09_Network.server_chat_exam;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 키보드 입력을 받아서 상대측의 메세지를 전송하는 쓰레드
 */
public class SendThread extends Thread {
    Socket sk;

    public SendThread(Socket sk, String name) {
        super(name);
        this.sk = sk;
    }

    @Override
    public void run() {
        // 키보드 입력 받기
        Scanner sc = new Scanner(System.in);
        try (PrintWriter pw = new PrintWriter(sk.getOutputStream(), true)) {
            while (true) {
                String inputData = sc.nextLine(); // 키보드 입력 받기
                if (inputData.equals("exit")) {
                    pw.println(inputData);
                    break;
                } else {
                    pw.println(super.getName() + "가 보낸 내용 : " + inputData); // 상대측에 전송
                }

            }
            System.out.println(super.getName() + "의 보내는 스레드가 종료합니다.");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(super.getName() + "의 SendThread 예외가 발생헀습니다.");
        }
    }
}
