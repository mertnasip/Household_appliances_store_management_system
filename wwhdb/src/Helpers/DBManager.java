package Helpers;

import java.sql.*;

public class DBManager {
    
    static String dbUrl = "jdbc:mariadb://localhost:3308/whdb?user=root&password=root1234";


    public Connection getConnection()  {
        try {
			return (Connection) DriverManager.getConnection(dbUrl);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }

    public void showError (SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error Code: "+exception.getErrorCode());
    }

}
