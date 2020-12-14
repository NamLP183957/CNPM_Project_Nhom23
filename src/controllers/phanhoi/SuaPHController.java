/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phanhoi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.PhanHoi;
import service.MySQLConnection;

/**
 *
 * @author Hoang Trung Hieu
 */
public class SuaPHController {
    
    public static boolean changePH(PhanHoi phanHoi) {
        String sql = "UPDATE PHAN_HOI SET NGAY_PHAN_HOI = ?, CO_QUAN = ?, NGUOI_LIEN_QUAN = ?, NOI_DUNG = ? WHERE MA_PHAN_ANH = ?;";
        Connection conn = MySQLConnection.getMySQLConnection();
        PreparedStatement stmt = null;
        boolean result = false;
        try {
            stmt = conn.prepareStatement(sql);
            
            stmt.setDate(1, phanHoi.getNgayPhanHoi());
            stmt.setString(2, phanHoi.getCoQuan());
            stmt.setString(3, phanHoi.getNguoiLienQuan());
            stmt.setString(4, phanHoi.getNoiDung());
            stmt.setInt(5, phanHoi.getMaPA());
            
            result = !stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(controllers.phananh.ThemPAController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SuaPHController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SuaPHController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return result;
        }
    }
}
