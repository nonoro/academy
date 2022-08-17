package ex0817.homework;

import java.net.Socket;

public class ClientChat {
    Socket sk;
    Frame f;

    public ClientChat() {
        try {
            f = new Frame("Client");
            sk = new Socket("127.0.0.1", 8010);
            f.output.append("Client 님이 들어오셨습니다.\n");
            f.setSocket(sk);

            //보내는 쓰레드
//            new SendThread(sk, f).start();
            //받는 쓰레드
//            new ReceiveThread(sk, f);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClientChat();
    }
}
