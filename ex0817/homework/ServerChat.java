package ex0817.homework;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    Socket sk;
    Frame f;

    public ServerChat() {
        try (ServerSocket server = new ServerSocket(8010)) {
            f = new Frame("Server");
            sk = server.accept();
            f.output.append("Server님이 들어오셨습니다.\n");


            //읽기 쓰레드
            new ReceiveThread(sk, f).start();
            //보내기 쓰레드
//            new SendThread(sk, f).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerChat();
    }
}
