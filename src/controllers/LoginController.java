/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import models.Account;
import java.sql.*;
import services.MySQLConnection;
/**
 *
 * @author Tran Van Tuyen
 */
public class LoginController {
       
        //tìm kiếm phản ánh theo ngày
        public static ArrayList<Account> getAccount() {
            ArrayList<Account> list = new ArrayList<>();
            Connection conn = MySQLConnection.getMySQLConnection();
            String select = "select * from tai_khoan ";
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Account ac = new Account();                    
                    ac.setId(rs.getInt("Id"));
                    ac.setUserName(rs.getString("userName"));
                    ac.setPassword(rs.getString("password"));
                    list.add(ac);
                   System.out.println(ac.getId()+ac.getUserName()+ac.getPassword());

                }
            } catch (Exception e) {
            }
            return list;
        }
        
        //kiem tra login
        public boolean login(String username,String password,ArrayList<Account> list) { 
            boolean b = false;
            for (int i = 0; i < list.size(); i++) {  
                if (( list.get(i).getUserName().equals(username) ) && (list.get(i).getPassword().equals(password))){   
                    return true;         
                }
            }
            return false;
        }
        
    public LoginController() {
        
    }
}
     
