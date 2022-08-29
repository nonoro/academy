package dao;

import util.DbUtil;
import vo.Student;
import vo.Teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    /**
     * 1번 : 성별이 여자인 학생의 정보를 검색하기
     * SELECT * FROM STUDENT WHERE substr(수_주민등록번호, 8, 1) = 2;
     */
    public static List<Student> getSelectMaleStudentInfo() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM STUDENT WHERE substr(수_주민등록번호, 8, 1) = 2";
        List<Student> list = new ArrayList<>();
        // 로드
        try {
            // 연결
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // 컬럼의 정보를 가져오기
            while (rs.next()) {
                int 수강생번호 = rs.getInt(1);
                String 수_이름 = rs.getString(2);
                String 수_주민등록번호 = rs.getString(3);
                String 수_연락처 = rs.getString(4);
                String 수_주소 = rs.getString(5);
                String 수_이메일 = rs.getString(6);

                list.add(new Student(수강생번호, 수_이름, 수_주민등록번호, 수_연락처, 수_주소, 수_이메일));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return list;
    }
}
