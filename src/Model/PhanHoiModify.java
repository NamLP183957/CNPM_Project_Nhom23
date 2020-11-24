/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.SQLconnection;
import java.sql.Date;


/**
 *
 * @author Vostro 3580
 */
public class PhanHoiModify {
    
    public PhanHoiModify(){
        
    }
    
    public static int themPhanHoi(PhanHoi ph){
        Connection conn=null;
        Statement st=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        int ret=0;
        conn= new SQLconnection().Connect();
        try{
        String sql= "insert into PhanHoi values (?,?,?,?,?)";
        pr=conn.prepareStatement(sql);
        pr.setInt(1,ph.getMaPhanHoi());
        pr.setDate(2, Date.valueOf(ph.getNgayPhanHoi())); 
        pr.setString(3,ph.getNguoiLienQuan());
        pr.setString(4,ph.getNoiDung() );
        pr.setString(5, ph.getCoQuan());
        ret=pr.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                }
                if(st!=null){
                    st.close();
                }
                if(pr!=null){
                    pr.close();
                }
        
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return ret;
        }
    }
    
    public static void timKiemPhanAnh(){
        
    }
    
    
}   
