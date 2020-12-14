/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phananh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import models.PhanAnh;
import services.MySQLConnection;

/**
 *
 * @author trado006
 */
public class SuaPAController {
    public static void deletePhanAnh(int id){
        String sql = "DELETE FROM PHAN_ANH WHERE MA_PHAN_ANH = " + id + ";";
        String sql2 = "DELETE FROM PHAN_HOI WHERE MA_PHAN_ANH = " + id +";";
                
        Connection conn = MySQLConnection.getMySQLConnection();
        Statement stmt = null;
        try{
            stmt = conn.createStatement();
            stmt.execute(sql);
            stmt.execute(sql2);
        } catch(Exception e) {
            System.out.printf("no connect delete Phan anh");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
    }
    public static void updatePhanAnh(PhanAnh pa){
        System.out.println(pa.toString());
        String sql = "UPDATE PHAN_ANH SET  NGUOI_PHAN_ANH=?, NOI_DUNG=?, NGAY_PHAN_ANH=?, PHAN_LOAI=?, TRANG_THAI=? WHERE MA_PHAN_ANH=?;";
        Connection conn = MySQLConnection.getMySQLConnection();
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, pa.getName());
            stmt.setString(2, pa.getContent());
            stmt.setDate(3, pa.getDate());
            stmt.setString(4, pa.getType());
            stmt.setString(5, pa.getState());
            stmt.setInt(6,pa.getId());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            System.out.println("no connect to data base");
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    
                }
            }
        }
    }
}
