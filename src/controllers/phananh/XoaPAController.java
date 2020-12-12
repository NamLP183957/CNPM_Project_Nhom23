/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phananh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.PhanAnh;
import service.MySQLConnection;

/**
 *
 * @author THINKBOOK
 */
public class XoaPAController {
    
    public static void delete(int id) {
        Connection conn = null;
        conn = MySQLConnection.getMySQLConnection();
        
        String sql = "DELETE FROM phan_anh WHERE MA_PHAN_ANH = ?";
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
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
