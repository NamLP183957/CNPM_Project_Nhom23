/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phananh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.PhanAnh;
import service.MySQLConnection;

/**
 *
 * @author ADMIN
 */
public class ThemPAController {
    
    public static void insert(PhanAnh pa) {
        Connection conn = null;
        conn = MySQLConnection.getMySQLConnection();
        
        String sql = "INSERT INTO phan_anh (NGUOI_PHAN_ANH, NOI_DUNG, NGAY_PHAN_ANH, PHAN_LOAI, TRANG_THAI) "
                            + "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, pa.getName());
            stmt.setString(2, pa.getContent());
            stmt.setDate(3, pa.getDate());
            stmt.setString(4, pa.getType());
            stmt.setString(5, pa.getState());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(controllers.phananh.ThemPAController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(controllers.phananh.ThemPAController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(controllers.phananh.ThemPAController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
