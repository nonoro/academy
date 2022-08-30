package kosta.homework.src.util;

import java.sql.*;

/**
 * db 연동을 위한 로드, 연결, 닫기
 */
public class DbUtil {
    /**
     * 로드 : 연결하려는 DBMS를 선택
     */
    static {  // 초기화블럭 맨처음에 실행되는것
        try {
            Class.forName(DbProperties.DRIVER_NAME);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 연결
     */
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(DbProperties.URL, DbProperties.USER_ID, DbProperties.USER_PWD);

        return con;
    }

    /**
     * 닫기 - 사용된 객체 닫기 - select인 경우
     */
    public static void dbClose(Connection con, Statement st, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                dbClose(con, st);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 닫기 - 사용된 객체 닫기 - DML or DDL 인경우 (resultSet이 없는 경우)
     */
    public static void dbClose(Connection con, Statement st) {
        try {
            if (con != null) {
                con.close();
            }
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
