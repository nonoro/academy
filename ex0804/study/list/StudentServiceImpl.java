package ex0804.study.list;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    List<Student> list = new ArrayList<>();

    /**
     * 초기치 데이터 5명의 정보를 저장
     */
    public StudentServiceImpl() {
        list.add(new Student("A01", "희정", 20, "서울"));
        list.add(new Student("A02", "나영", 25, "대구"));
        list.add(new Student("A03", "효리", 22, "부산"));
        list.add(new Student("A04", "민아", 21, "경기"));
        list.add(new Student("A05", "선경", 20, "서울"));

    }

    @Override
    public boolean insert(Student student) {
        if (selectBySno(student.getSno()) == null) {
            list.add(student);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> selectAll() {
        return list;
    }

    @Override
    public Student selectBySno(String sno) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getSno().equals(sno)) {
                Student student = list.get(i);
                return student;
            }
        }
        return null;
    }

    @Override
    public boolean update(Student student) {
        Student savedSt = this.selectBySno(student.getSno());
        if (savedSt == null) {
            return false;
        }
            savedSt.setAge(student.getAge());
            savedSt.setAddr(student.getAddr());
            return true;
    }

    @Override
    public boolean delete(String sno) {

        Student student = this.selectBySno(sno);
        return list.remove(student);   // remove는 boolean타입

        // selectBySno의 리턴타입은 Student따라서 리턴해주는 값은 리스트에 들어있는 Student객체의 주소값이다
        //  그러므로 list.remove(student)를 하면 selectBySno에서 리턴해준 student의 주소값을 삭제하는것이므로
        // 리스트에서 student의 주소에 해당하는 객체가 다 삭제가 되는것이다
    }
}

