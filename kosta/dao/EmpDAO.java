package kosta.dao;

import kosta.util.DbUtil;
import kosta.vo.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
    /**
     * 모든 사원의 이름 검색
     *  : select ename from emp
     */
    public static void getSelectEname() {
        Connection con = null; //
        Statement st = null;
        ResultSet rs = null;
        // 로드
        try {
            // 연결
            con = DbUtil.getConnection();
            // 실행
            st = con.createStatement();
            rs = st.executeQuery("select ename from emp"); // executeQuery 메소드는 오라클에 쿼리를 전송하고 그 결과를 받아온다
            while (rs.next()) {                                 // 디비에 인서트하고 커밋안하면 그정보는 자바로 호출했을때 조회가 안됨 왜냐면 트렌젝션이 끝난게 아니라서
                // 각 열의 값들을 조회하기
                String ename = rs.getString(1);// ename 컬럼
                System.out.println(ename);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
        // 닫기
            DbUtil.dbClose(con, st, rs);
        }
    }

    /**
     * 사원등록하기
     * INSERT INTO emp(empno, ename, job, sal, HIREDATE) VALUES (9222, '미나', 'teacher', 3000 , sysdate)
     */
    public static void insert(Emp emp) {
        // 로드 연결 실행 닫기
        Connection con = null; // 디비에 연결을 하기위한 connection con, st 얘내 둘은 무조건 기본으로 디비 사용할때 필요
        Statement st = null; // 문장을 만들어내는 statement resultSet은 select할때만 필요
        String sql = "INSERT INTO emp(empno, ename, job, sal, HIREDATE) VALUES ("+emp.getEmpno()+", '"+emp.getEname()+"', '"+emp.getJob()+"', "+emp.getSal()+" , sysdate)";

        System.out.println("sql = " + sql);

        try {
            con = DbUtil.getConnection();
            st = con.createStatement();
            int result = st.executeUpdate(sql);
            if (result == 0) {
                System.out.println(result + " : 등록되지 않았습니다.");
            } else {
                System.out.println(result + " : 등록되었습니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.dbClose(con, st);
        }
    }


    /**
     * 사원 등록하기 (PreparedStatement 이용하기)
     */
    public static void preparedInsert(Emp emp) {
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO emp(empno, ename, job, sal, HIREDATE) VALUES (?, ?, ?, ?, sysdate)";
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            // 만약 ?가 있다면 ?의 개수마늠 순서대로 setXxx필요!
            ps.setInt(1, emp.getEmpno());
            ps.setString(2, emp.getEname());
            ps.setString(3, emp.getJob());
            ps.setInt(4, emp.getSal());

            //쿼리실행 -DB쪽으로 쿼리 전송
            int result = ps.executeUpdate();
            if (result == 0) {
                System.out.println(result + " : 등록되지 않았습니다.");
            } else {
                System.out.println(result + " : 등록되었습니다..");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con, ps);
        }
    }

    /**
     * 모든 사원의 정보를 검색
     * SELECT empno, ename, job, sal, hiredate FROM emp;
     */
    public static List<Emp> selectAll() {
        Connection con = null; // 커넥션은 절대 공유하면 안됨 이게 하나의 트렌젝션이라서 그래서 계속 같은게 겹친다고 메서드로 뺄수가 없음
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select empno, ename, job, sal, hiredate from emp";
        List<Emp> list = new ArrayList<>();
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            // 컬럼의 정보를 가져오기
            ResultSetMetaData rmd = rs.getMetaData();
            for (int i = 1; i <= rmd.getColumnCount(); i++) {
                String columnName = rmd.getColumnName(i);
                System.out.print(columnName + "\t     ");
            }
            System.out.println();

            while (rs.next()) {// 커서를 앞으로이동
                int empno =  rs .getInt("empno");
                String ename = rs.getString("ename");
                String job = rs.getString(3);
                int sal = rs.getInt(4);
                String hiredate = rs.getString(5);

                System.out.println(empno + " | " + ename + " | " + job + " | " + sal + " | " + hiredate);

                list.add(new Emp(empno, ename, job, sal, hiredate));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.dbClose(con, ps, rs);

        }
        return list;
    }
}
