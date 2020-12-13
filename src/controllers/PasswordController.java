/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import models.Account;
import models.PhanAnh;
import service.MySQLConnection;

/**
 *
 * @author acer
 */
public class PasswordController {
    ArrayList<Account> list=LoginController.getAccount();
    public static int getIdOfUserChange(String username,String password,ArrayList<Account> list){ 
            for (int i = 0; i < list.size(); i++) {  
               // System.out.println(( list.get(i).getPassword().equals(password))); 
                if (( list.get(i).getUserName().equals(username) ) && (list.get(i).getPassword().equals(password))){   
                    return list.get(i).getId();         
               }
              
            }
            return 0; 
    }
    public static void changePassword(int id,String newPassword){
        Connection conn=MySQLConnection.getMySQLConnection();
            String sqlUpdatePassword = "update tai_khoan set password="+newPassword+" where id="+ id;
            try {
                 Statement st = conn.createStatement();
                 st.execute(sqlUpdatePassword);
            }  
                  
            catch (Exception e) {
                e.printStackTrace();
        }
    }   
}
