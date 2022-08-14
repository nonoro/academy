package ex0812.study.io;

import java.io.*;

public class KeyboardInputSaveExam {
    public KeyboardInputSaveExam() {
        // 키보드 입력을 계속 받는다 (exit단어를 만날때까지...)
        // 입력한 내용을 화면에 출력하고 파일에 저장한다
//        File file = new File("ex0812/study/io/chat");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
             BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/study/io/chat"))) {

            while (true) {
                System.out.print("입력 > ");
                String data = br.readLine();
                if (data.equals("exit")) {
                    break;
                }
                System.out.println(data);
                bw.write(data);
                bw.newLine();
                bw.flush();
            }
            System.out.println("프로그램 종료 ~~~~~~~~~~~~~~~~~~! 저장파일 확인하세요.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new KeyboardInputSaveExam();
    }
}
