package ex0817.step09_Network.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;

public class ConnectionExam {

    public ConnectionExam() {
        try {
           /* URL url = new URL("https://www.naver.com/");

            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("ex0817/homework/naver.html"));

            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
                bw.write(data);
                bw.flush();
            }

            System.out.println("***********완료**********************");
*/
            /////////////////////////////////////////////////////////////////////
            URL url = new URL("http://192.168.0.20/Util/epp351.exe");
            BufferedInputStream bis = new BufferedInputStream(url.openStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ex0817/homework/epp351.exe"));

            int i = 0;
            while ((i = bis.read()) != -1) {
                bos.write(i);
                bos.flush();
            }

            bos.close();

            System.out.println("저장완료되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ConnectionExam();
    }
}
