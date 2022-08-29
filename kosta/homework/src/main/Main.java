package main;

import dao.StudentDAO;
import dao.TeacherDAO;
import dao.Teacher_ViewDAO;
import vo.Student;
import vo.Teacher;
import vo.Teacher_View;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("1번 : 성별이 여자인 학생의 정보를 검색하기");
        List<Student> selectMaleStudentInfo = StudentDAO.getSelectMaleStudentInfo();
        for (Student student : selectMaleStudentInfo) {
            System.out.println(student);
        }

        System.out.println("\n4번 : “구”를 인수로 전달받아 구에 거주하는 강사의 정보 검색");
        List<Teacher> selectTeacherInfo = TeacherDAO.teacherInfo("강남구");
        for (Teacher teacher : selectTeacherInfo) {
            System.out.println(teacher);
        }

        System.out.println("\n5번 : 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보(서브쿼리)");
        List<Teacher> subject = TeacherDAO.subjectOfTeacherInfo("java");
        for (Teacher teacher : subject) {
            System.out.println(teacher);
        }

        System.out.println("\n8번 뷰를 미리 만들고 그 뷰를 이용해서 강사의 번호를 인수로 전달받아 정보를 출력.");
        List<Teacher_View> tv = Teacher_ViewDAO.teacherNumberInfo(3);
        for (Teacher_View teacher_view : tv) {
            System.out.println(teacher_view);
        }
    }
}
