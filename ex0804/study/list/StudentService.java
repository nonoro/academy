package ex0804.study.list;

import java.util.List;

public interface StudentService {
    /**
     * 등록하기
     * @return : true이면 등록성공, false이면 등록실패
     */
    boolean insert(Student student);


    /**
     * 전체검색
     */
    List<Student> selectAll();

    /**
     * 학번에 해당하는 학생의 정보검색
     */
    Student selectBySno(String sno);

    /**
     * 학번에 해당하는 학생의 정보삭제
     * @return : true이면 삭제성공, false이면 삭제실패
     */
    boolean delete(String sno);

    /**
     * 학번에 해당하는 학생의 정보수정(나이, 주소)
     * @return : true이면 수정성공, false이면 수정실패
     */
    boolean update(Student student);
}

