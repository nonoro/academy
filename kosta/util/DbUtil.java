package kosta.util;

/*
    db 연동을 위한 로드, 연결, 닫기
 */

import java.sql.*;

public class DbUtil {

    /**
     * 로드 : 연결하려는 DBMS를 선택
     */
    static {
        try {
            Class.forName(DbProperties.DRIVER_NAME);//
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * 연결
     */
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(DbProperties.URL,
                                                        DbProperties.USER_ID,
                                                        DbProperties.USER_PWD);
        return con;
    }

    /**
     * 닫기 - 사용된 객체 닫기 - Select인 경우
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
         * 닫기 - 사용된 객체 닫기 - DML or DDL 인경우 ( resultSet이 없는경우 )
         */
    public static void dbClose(Connection con, Statement st) {
        // 얘는 여기서 직접 처리해줌 왜냐면 DAO에가서 처리하면 finally블록에서 또 try-catch를 해야되서 너무 지저분함
        try {
            if (st != null) {
                st.close();
            }

            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*
    public static void main(String[] args) {
        try {
            System.out.println("***메인 시작******");
            Connection con = DbUtil.getConnection();
            System.out.println("con = " + con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
