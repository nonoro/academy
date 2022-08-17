package ex0817.step09_Network.server_chat_exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {

    Socket sk;

    public ServerChatExam() {
        try (ServerSocket server = new ServerSocket(8001)) {
            System.out.println("클라이언트 접속을 기다립니다.......");
            sk = server.accept();
            System.out.println(sk.getInetAddress() + "님과 채팅을 시작합니다.^^");

            //읽기 스레드
            new ServerReceiveThread().start();
            //보내는 스레드
            new SendThread(sk, "SERVER").start();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerChatExam();
    }
    ////////////////////////////////////////////////////////////////////////////////////

    /**
     * 클라이언트가 보내오는 데이터를 읽어서 모니터에 출력하는 스레드
     */

    class ServerReceiveThread extends Thread {

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
                while (true) {
                    String input = br.readLine();
                    if (input.equals("exit")) {
                        break;
                    } else {
                        System.out.println(input); //super.getName() + "가 보낸 내용 : " + inputData 이런 형식으로 출력됨
                    }
                }
                System.out.println("서버 받는 쓰레드 종료합니다.^^");
            } catch (Exception e) {
                System.out.println("ServerReceiveThread catch 발생 했습니다.........");
            }finally {
                System.exit(0);
            }
        }
    }
}
