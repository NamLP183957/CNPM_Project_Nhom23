/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Vostro 3580
 */
public class SQLconnection {
    
    public SQLconnection(){

    }
    
    public Connection Connect(){
        Connection conn=null;
        try{
            String dbURL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLPAKN";
            String dbUSER="sa";
            String dbPass="123456";
            conn=DriverManager.getConnection(dbURL,dbUSER,dbPass);
               
        }catch(SQLException ex){
            System.err.println("Cannot connect to database!");;
        }
        return conn;
    }
    
}
