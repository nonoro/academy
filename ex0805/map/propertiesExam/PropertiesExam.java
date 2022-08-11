package ex0805.map.propertiesExam;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertiesExam {
    Properties pro = new Properties(); //Map의 형태(key, value 도 모두 String이다)

    public PropertiesExam() {
        //데이터 추가
        pro.setProperty("id", "jang");
        pro.setProperty("age", "20");
        pro.setProperty("name", "장희정");

        System.out.println("pro = " + pro);

        for (String key : pro.stringPropertyNames()) {
            String value = pro.getProperty(key);
            System.out.println(key + " = " + value);
        }

    }

    /**
     * 외부 ~.properties파일 읽어오는 방법
     * 1) IO를 이용하는 방법
     * 2) ResourcesBundle 이용하는 방법
     */

    //1) IO를 이용하는 방법
    public void test01() {
        pro.clear(); // 앞에꺼 비우고 이 파일에 있는것만 읽어줌
        try {
            pro.load(new FileInputStream("academy/ex0805/map/propertiesExam/test.properties.properties"));
            System.out.println(pro);

            for (String k : pro.stringPropertyNames()) {
                String value = pro.getProperty(k);
                System.out.println(k + " = " + value);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test02() {
        // 파일의 기준점이 classes폴더를 기준으로 경로를 잡는다 - bin이 기준이고 bin은 class들을 모아 놓는 폴더
        // ~.properties파일을 읽어오는 전용 클래스이다.
        // 그래서 경로를 설정할때 확장자는 생략한다. + academy도 생략 바로 패키지명부터 시작함
        ResourceBundle rb = ResourceBundle.getBundle("ex0805/map/propertiesExam/test.properties");// test.properties.properties

        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(key + " = " + value);
        }

    }

    public static void main(String[] args) {
        PropertiesExam pe = new PropertiesExam();
        System.out.println("**********************************************");
//        pe.test01();
        pe.test02();
    }
}
