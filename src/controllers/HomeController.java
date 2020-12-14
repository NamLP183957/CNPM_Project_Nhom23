/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import service.MySQLConnection;

/**
 *
 * @author Le Phuong Nam
 */
public class HomeController {
    private JLabel jlbPhanAnh;
    private JLabel jlbPhanHoi;
    
    public HomeController(JLabel jlbPhanAnh, JLabel jlbPhanHoi){
        this.jlbPhanAnh = jlbPhanAnh;
        this.jlbPhanHoi = jlbPhanHoi;
    }
    
    public void setData(){
        
        try {
            Connection connection = MySQLConnection.getMySQLConnection();
            
            String TONG_PHAN_ANH_SQL = "SELECT COUNT(*) AS tongPA FROM phan_anh";
            PreparedStatement statement = connection.prepareStatement(TONG_PHAN_ANH_SQL);
            ResultSet rs = statement.executeQuery();
            while(rs.next()) {
                this.jlbPhanAnh.setText("Số lượng phản ánh: " + rs.getLong("tongPA"));
            }
            statement.close();
            
            String TONG_PHAN_HOI_SQL = "SELECT COUNT(*) AS tongPH FROM phan_hoi";
            statement = connection.prepareStatement(TONG_PHAN_HOI_SQL);
            rs = statement.executeQuery();
            while(rs.next()) {
                this.jlbPhanHoi.setText("Số lượng phản hồi: " + rs.getString("tongPH"));
            }
            statement.close();
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                    
    }
}
