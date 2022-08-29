package kosta.dao;

import kosta.util.DbUtil;
import kosta.vo.Emp;

import java.sql.*;

public class sqlInjectionTest {

    /**
     * Statement인 경우
     * SELECT empno, ename, job, sal, hiredate FROM emp WHERE sal > '2000';
     */
    public static void statememtTest(String param) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT empno, ename, job, sal, hiredate FROM emp WHERE sal > " + param + " order by sal";
        try {
            con = DbUtil.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Emp emp = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));

                System.out.println(emp); // emp.toString()
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, st, rs);
        }

    }

    /**
     * PreparedStatement인 경우
     * SELECT empno, ename, job, sal, hiredate FROM emp WHERE sal > '2000';
     */
    public static void preparedStatementTest(String param) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT empno, ename, job, sal, hiredate FROM emp WHERE sal > ?" + " order by sal";
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            // ?의 값 설정 필요
            ps.setString(1, param);

            rs = ps.executeQuery();
            while (rs.next()) {
                Emp emp = new Emp(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));

                System.out.println(emp); // emp.toString()
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps, rs);
        }

    }

    public static void main(String[] args) {
//        System.out.println("--1. Statement인 경우---------------------- ");
//        statememtTest("5000 or 1 = 1"); // 5000 or 1 = 1

        System.out.println("--1. Statement인 경우------------------------------ ");
        preparedStatementTest("5000"); // 5000 or 1 = 1 에러뜸 얘는 ? 가 지정된 곳의 형태의 값만 들어가게끔 설정되어있음
                                                        // 그래서 엉뚱한 조건이나 값이 들어오면 에러떠서 sql injection공격을 막아줌

    }
}
