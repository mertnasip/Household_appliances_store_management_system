package Helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//
public class DBManager {
    static String username = "root";
    static String password = "system2000";
    static String dbUrl = "jdbc:mysql://localhost:3306/wwhdb?autoReconnect=true&useSSL=false";


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, username, password);
    }

    public void showError(SQLException exception) {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }

}
