package ex0817.step09_Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
    public ClientExam() {
        try (Socket sk = new Socket("127.0.0.1", 8001)) { // 127.0.0.1 = localhost : 자신IP
            // 서버가 읽기를 먼저 하고 있기 때문에 서버에게 데이터를 보내기를 먼저 해야된다
            // 서버에게 데이터 전송
            PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
            pw.println("서버에 접속하고 싶어요~~~");

            // 서버가 보내오는 데이터를 읽기
            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            String data = br.readLine();
            System.out.println("서버가 보내온 내용" + data);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ClientExam();
    }
}
