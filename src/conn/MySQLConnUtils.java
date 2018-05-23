package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MySQLConnUtils {

    public static Connection getMySQLConnection()
            throws ClassNotFoundException, SQLException {
        // Примечание: Изменить параметры соединения соответствующе.

         String hostName = "localhost";
        String dbName = "diplom";
        String userName = "admin";
        String password = "KzB2Tq5ucEkuW5pF";

        return getMySQLConnection(hostName, dbName, userName, password);
    }

    public static Connection getMySQLConnection(String hostName, String dbName,
                                                String userName, String password) throws SQLException,
            ClassNotFoundException {


        Class.forName("com.mysql.jdbc.Driver");
        Properties props = new Properties();
        props.setProperty("useUnicode","true");
        props.setProperty("characterEncoding","utf8");
        props.setProperty("user",userName);
        props.setProperty("password",password);
        props.setProperty("ssl","true");

        String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
        Connection conn=DriverManager.getConnection(connectionURL,props);

        //Connection conn = DriverManager.getConnection(connectionURL, userName,  password);

        return conn;
    }
}