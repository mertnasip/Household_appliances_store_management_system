package Helpers;

import java.sql.*;

public class DBManager {
    
    static String dbUrl = "jdbc:mariadb://localhost:3308/whdb?user=root&password=root1234";


    public Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(dbUrl);
    }

    public void showError (SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error Code: "+exception.getErrorCode());
    }

}
