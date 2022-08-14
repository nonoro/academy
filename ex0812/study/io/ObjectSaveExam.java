package ex0812.study.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
    public ObjectSaveExam() {
        //저장할 객체를 생성
        Student st1 = new Student("희정", 10, "서울");
        Student st2 = new Student("나영", 12, "대구");

        List<Student> list = new ArrayList<>();
        list.add(new Student("민희", 20, "성남"));
        list.add(new Student("소민", 22, "제주도"));
        list.add(new Student("진서", 21, "여수"));

        // 객체를 파일에 저장하고 싶다. - ObjectOutputStream
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("ex0812/study/io/objSave.txt"))) {
            os.writeObject(st1);
            os.writeObject(st2);

            os.writeObject(list);
            System.out.println("저장완료 - 파일 확인해보자!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ObjectSaveExam();
    }
}
