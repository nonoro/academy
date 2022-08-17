package ex0817.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread extends Thread {
    Socket sk;
    Frame frame;

    public ReceiveThread(Socket sk, Frame f) {
        this.sk = sk;
        this.frame = f;

    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
            while (true) {
                String message = br.readLine();
                frame.setClientMessage(message);
                System.out.println(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
