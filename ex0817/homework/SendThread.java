package ex0817.homework;

import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {
    Socket sk;
    Frame f;

    public SendThread(Socket sk, Frame f) {
        this.sk = sk;
        this.f = f;
    }

    @Override
    public void run() {
        try (PrintWriter pw = new PrintWriter(sk.getOutputStream(), true)) {
            while (true) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
