package ex0812.study.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterExam {
    public BufferedReaderWriterExam() {
        //문자 단위로 파일 읽기 - Buffered 이용
        // ;를 사용해서 try() 괄호안에 하나이상 넣을 수 있다
        try (BufferedReader br = new BufferedReader(new FileReader("ex0811/study/io/read.txt")) ;
             BufferedWriter bw = new BufferedWriter(new FileWriter("ex0812/study/io/write.txt"))) {
           /*
            while (true) {
                int i = br.read();
                if (i == -1) {
                    break;
                }
                System.out.println(i + " = " + (char) i);
            }
            */
            ///////////////////////////////////////////////////
            //한줄읽기
            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
                bw.write(data);
                bw.newLine();
            }
            ///////////////////////////////////////////////////////
            ////문자단위로 파일지정
            bw.write(65);//ㅁ

            bw.write(13);
            bw.write(10);

            bw.write("배고프다\n");
            bw.write("점심메뉴는?\n");
            bw.write("글쎄요??");

            bw.newLine(); // 개행
            bw.write("서브웨이~");

            bw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BufferedReaderWriterExam();
    }
}
