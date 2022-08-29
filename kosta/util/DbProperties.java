package kosta.util;

/**
 * interface안에 잇는 모든 필드는 상수이다. - public static final 자동이다.
 */
public interface DbProperties {
    public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    public static final String USER_ID = "scott";
    public static final String USER_PWD = "TIGER";
}
