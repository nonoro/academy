package kosta.homework.src.main;


import kosta.homework.src.dao.StudentDAO;
import kosta.homework.src.dao.TeacherDAO;
import kosta.homework.src.vo.Student;
import kosta.homework.src.vo.Teacher;

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
        Teacher subject = TeacherDAO.subjectOfTeacherInfo("java");
        if (subject == null) {
            System.out.println("과목명에 해당하는 정보가 없습니다.");
        } else {
            System.out.println(subject);
        }


//        System.out.println("\n8번 뷰를 미리 만들고 그 뷰를 이용해서 강사의 번호를 인수로 전달받아 정보를 출력.");
//        List<Teacher_View> tv = Teacher_ViewDAO.teacherNumberInfo(3);
//        for (Teacher_View teacher_view : tv) {
//            System.out.println(teacher_view);
//        }

        //        // create는 0과 1로 성공 실패를 볼 수 없고 예외발생 여부에 따라서 성공 실패를 구분할 수 있다.
//        System.out.println("\n--------- 4. 뷰를 생성해보자");
//        int result = Teacher_ViewDAO.createView();
//        if (result == 0) {
//            System.out.println("뷰가 생성되지 않았습니다 = " + result);
//        } else {
//            System.out.println("뷰가 생성되었습니다.= " + result);
//        }

        System.out.println("\n----- 8-1 뷰에서 강사번오에 해당하는 강사의 정보를 검색하기 ------------------------------");
        Teacher teacher = TeacherDAO.getTeacherInfoByNo(1);
        if (teacher == null) {
            System.out.println("강사의 정보가 없습니다.");
        } else {
            System.out.println("--------------강사정보-----------------");
            System.out.print(teacher.get강사번호() + " | ");
            System.out.print(teacher.get강사이름() + " | ");

            System.out.print(teacher.getSubject().get수강코드() + " | ");
            System.out.print(teacher.getSubject().get과목() + " | ");

            System.out.print(teacher.getRoom().get강의실번호() + " | ");
            System.out.print(teacher.getRoom().get수용인원() + "\n");
        }
    }
}
