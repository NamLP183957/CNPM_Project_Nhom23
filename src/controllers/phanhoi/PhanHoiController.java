/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phanhoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.PhanHoi;
import service.MySQLConnection;
/**
 *
 * @author Le Minh Nghia
 */
public class PhanHoiController {
    
    public static PhanHoi xuatPH(int data) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        conn = MySQLConnection.getMySQLConnection();
        String sql = "select * from PHAN_HOI where MA_PHAN_ANH = " + data;
        PhanHoi phanHoi = new PhanHoi();
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                phanHoi.setMaPA(rs.getInt("MA_PHAN_ANH"));
                phanHoi.setNgayPhanHoi(rs.getDate("NGAY_PHAN_HOI"));
                phanHoi.setNguoiLienQuan(rs.getString("NGUOI_LIEN_QUAN"));
                phanHoi.setNoiDung(rs.getString("NOI_DUNG"));
                phanHoi.setCoQuan(rs.getString("CO_QUAN"));
            }  
        } catch (SQLException ex) {
            Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return phanHoi;
        }
        
    }
    
    public static int add(PhanHoi ph) {
        Connection conn = null;
        PreparedStatement ps = null;
        conn = MySQLConnection.getMySQLConnection();
        String sql = "insert into PHAN_HOI (MA_PHAN_ANH, NGAY_PHAN_HOI, NGUOI_LIEN_QUAN, NOI_DUNG, CO_QUAN ) "
                    + "values (?,?,?,?,?)";
        int ret = -1;
        try {
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, ph.getMaPA());
            ps.setDate(2, ph.getNgayPhanHoi()); 
            ps.setString(3, ph.getNguoiLienQuan());
            ps.setString(4, ph.getNoiDung());
            ps.setString(5, ph.getCoQuan());
            
            ret = ps.executeUpdate();
        
        } catch (SQLException ex) {
            Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return ret;
        }    
    }
      
    public int edit(PhanHoi pH) {
        String sql = "Update PHAN_HOI set NGAY_PHAN_HOI=?, NGUOI_LIEN_QUAN=?, NOI_DUNG=?, CO_QUAN=? where MA_PHAN_ANH = ?";
        Connection conn = null;
        PreparedStatement st = null;
        int ret = -1;
        try {
            conn = MySQLConnection.getMySQLConnection();
            st = conn.prepareStatement(sql);
            
            st.setDate(1, pH.getNgayPhanHoi());
            st.setString(2, pH.getNguoiLienQuan());
            st.setString(3, pH.getNoiDung());
            st.setString(4, pH.getCoQuan());
            st.setInt(5, pH.getMaPA());
            ret = st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return ret;
        }    
    }
    
    public static boolean isPhanHoiExist(int maPA) {
        Connection conn = null;
        conn = MySQLConnection.getMySQLConnection();
        ResultSet rs = null;
        String sql = "select * from PHAN_HOI where MA_PHAN_ANH=" + maPA;
        Statement stmt = null;
        boolean check = false;
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
             
            check = rs.isBeforeFirst();
             
        } catch (SQLException ex) {
            Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PhanHoiController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            return check;  
        }    
    }
}
