/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hoang Trung Hieu
 */
public class MySQLConnection {
    public static String DB_URL = "jdbc:mysql://localhost:3306/quan_ly_phan_anh";
    public static String USERNAME = "root";
    public static String PASSWORD = "hoanghieu";
    
    public static Connection getMySQLConnection(String dbURL, String username, String password) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connect successfully!");
        } catch (SQLException ex) {
            System.out.println("Connect failure!");
            Logger.getLogger(services.MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static Connection getMySQLConnection() {
        return getMySQLConnection(DB_URL, USERNAME, PASSWORD);
    }
}
