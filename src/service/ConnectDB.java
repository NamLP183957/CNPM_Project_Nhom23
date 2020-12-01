package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


 
public class ConnectDB {
    private static String DB_URL = "jdbc:mysql://localhost:3306/quan_ly_phan_anh";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
    
    public static void main(String args[]) {
    	
    }
    public static Connection getXAMPPConnection() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            return conn;
        } catch (Exception ex) {
            System.out.println("error connect to database");
        }
        return null;
    }
    // -1 no connect
    //  1 did
    public static int excuteCheck(String s) {
    	Connection conn = ConnectDB.getXAMPPConnection();
		if (conn == null) return -1;
		try {
			Statement stmt = conn.createStatement();
			if(stmt.execute(s)==false) return 1;
			else return 0;
		}catch(Exception ex) {
			return -1;
		}
    }
    // -1 no connect
    //  0 non available
    //  1 available
    public static int excuteQueryCheck(String s) {
    	Connection conn = ConnectDB.getXAMPPConnection();
		if (conn == null) return -1;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(s);
			if(rs.next()) return 1;
			else return 0;
		}catch(Exception ex) {
			return -1;
		}
    }
}

