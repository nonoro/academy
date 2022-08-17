package ex0817.step09_Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public ServerExam() {
        try (ServerSocket server = new ServerSocket(8001)) {
            while (true) {
                System.out.println("클라이언트 접속을 대기중입니다......^^");
                Socket sk = server.accept();// 클라이언트 접속 대기중

                System.out.println(sk.getInetAddress() + "님 접속하셨습니다.");

                // 접속한 클라이언트로 부터 전송된 데이터읽기
                BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
                String data = br.readLine();
                System.out.println("클라이언트가 보내온 내용" + data);

                // 접속한 클라이언트에게 데이터 전송하기
                PrintWriter pw = new PrintWriter(sk.getOutputStream(), true); // byte단위로(getOutputStream) 받아서 문자단위로 바꿔주는 역할(PrintWriter)
                pw.println("서버에 접속하신걸 환영합니다.~~~~~~~~~"); // print는 autoFlush가 안되므로 무조건 println

                sk.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ServerExam();
    }
}
