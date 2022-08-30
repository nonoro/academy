package kosta.homework.src.dao;


import kosta.homework.src.util.DbUtil;
import kosta.homework.src.vo.Room;
import kosta.homework.src.vo.Subject;
import kosta.homework.src.vo.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {
    /**
     * 4번 : “구”를 인수로 전달받아 구에 거주하는 강사의 정보 검색
     * SELECT * FROM TEACHER WHERE 주소 LIKE '%강남구%';
     */
    public static List<Teacher> teacherInfo(String param) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM TEACHER WHERE 주소 LIKE ?";
//        String sql = "SELECT * FROM TEACHER WHERE 주소 LIKE '%' || ? || '%'";
        List<Teacher> list = new ArrayList<>();

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            // ?의 값 설정 필요

            ps.setString(1, "%" + param + "%");
//            ps.setString(1, param);


            rs = ps.executeQuery();

            while (rs.next()) {
                Teacher teacher = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(teacher);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return list;
    }

    public static Teacher subjectOfTeacherInfo(String param) {
        /**
         * 5번 : 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보(서브쿼리)
         * SELECT * FROM TEACHER WHERE 수강코드 = (SELECT 수강코드 FROM SUBJECT  WHERE upper(과목) = upper(‘?’));
         */
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM TEACHER WHERE 수강코드 = (SELECT 수강코드 FROM SUBJECT WHERE upper(과목) = upper(?))";
        Teacher teacher = null;
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, param); // param 이 ?에 전달될때 'param'이렇게 전달됨 그래서 만약 ? 가 기존에 '?' 이면 ' ' 을 빼줘야됨

            rs = ps.executeQuery();

            if (rs.next()) {
                teacher = new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return teacher;
    }

    /**
     * 8번을 객체가 객체를 가지고 있는형식을 이용해서 풀이해보자
     * SELECT * FROM TEACHER_view where 강사번호 = ?
     */
    public static Teacher getTeacherInfoByNo(int teacherNo) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM TEACHER_view where 강사번호 = ?";
        Teacher teacher = null;
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, teacherNo); // param 이 ?에 전달될때 'param'이렇게 전달됨 그래서 만약 ? 가 기존에 '?' 이면 ' ' 을 빼줘야됨

            rs = ps.executeQuery();
            if (rs.next()) {
                teacher = new Teacher();
                teacher.set강사번호(rs.getInt(1));
                teacher.set강사이름(rs.getString(2));

                teacher.setSubject(new Subject(rs.getString(3), rs.getString(4)));

                teacher.setRoom(new Room(rs.getInt(5), rs.getInt(6)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return teacher;
    }
}
