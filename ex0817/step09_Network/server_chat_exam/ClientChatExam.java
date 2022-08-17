package ex0817.step09_Network.server_chat_exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
    Socket sk;

    public ClientChatExam() {
        try {
            sk = new Socket("127.0.0.1", 8001);
            System.out.println("서버와 채팅을 시작합니다......");

            //보내는 쓰레드
            new SendThread(sk, "Client").start();

            //받는 쓰레드
            new Thread(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
                    while (true) {
                        String input = br.readLine();
                        if (input.equals("exit")) {
                            break;
                        } else {
                            System.out.println(input);
                        }
                    }
                        System.out.println("Client쪽 받는 스레드를 종료합니다.");
                } catch (Exception e) {
                    System.out.println("ClientExam의 받는 스레드 catch 블럭입니다.......");
                }finally {
                    System.exit(0);
                }
            }).start();

        } catch (Exception e) {
            System.out.println("Client쪽 생성자 예외 catch 블럭입니다.......");
        }
    }

    public static void main(String[] args) {
        new ClientChatExam();
    }
}
