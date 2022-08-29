package dao;

import util.DbUtil;
import vo.Teacher;
import vo.Teacher_View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Teacher_ViewDAO {
    public static List<Teacher_View> teacherNumberInfo(int param) {
        /**
         * 8번은 뷰를 미리 만든다.
         * CREATE OR REPLACE VIEW TEACHER_VIEW
         * AS
         * SELECT t.강사번호, t.강사이름, t.수강코드, j.과목, r.강의실번호, r.수용인원
         * FROM TEACHER t INNER JOIN SUBJECT j ON t.수강코드 = j.수강코드
         * 				  	      INNER JOIN SUGANGTB g ON t.강사번호 = g.강사번호
         * 		       			  INNER JOIN ROOM r ON r.강의실번호 = g.강의실번호;
         *
         * 위의 쿼리를 실행해서 뷰로 만든다
         *
         * 그리고 나서 그 강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력한다.
         *  SELECT * FROM TEACHER_view where 강사번호 = ?;
         *
         */
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM TEACHER_view where 강사번호 = ?";
        List<Teacher_View> list = new ArrayList<>();

        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, param);

            rs = ps.executeQuery();
            while (rs.next()) {
                Teacher_View tv = new Teacher_View(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
                list.add(tv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.dbClose(con, ps, rs);
        }
        return list;
    }
}
