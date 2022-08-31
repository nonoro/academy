package ex0830_MVCDBBoard.mvc.util;

/*
    db 연동을 위한 로드, 연결, 닫기
 */

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DbUtil {
    private static Properties profile = new Properties();// Map의 형태

    /**
     * 로드 : 연결하려는 DBMS를 선택
     */
    static {
        try {
            // 2개의 외부 ~.properties파일 로딩
            profile.load(new FileInputStream("ex0830_MVCDBBoard/resources/dbInfo.properties"));
            profile.load(new FileInputStream("ex0830_MVCDBBoard/resources/board.properties"));

//            System.out.println(profile.getProperty("driverName"));
//            System.out.println(profile.getProperty("board.selectBySubject"));

            Class.forName(profile.getProperty("driverName"));//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Properties getProfile() {
        return profile;
    }

    /**
     * 연결
     */
    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(profile.getProperty("url"),
                profile.getProperty("userName"),
                profile.getProperty("userPass"));
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
    public static void main(String[] args) {
        try {
            System.out.println("***메인 시작******");
            Connection con = DbUtil.getConnection();
            System.out.println("con = " + con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
