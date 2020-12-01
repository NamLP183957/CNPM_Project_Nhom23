/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import service.MySQLConnection;
import models.QLPhanHoi;
/**
 *
 * @author Vostro 3580
 */
public class QLPhanHoiModify {
    public ResultSet Search(String data, int id){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            conn = MySQLConnection.getMySQLConnection();
            String sql=null;
            st=conn.createStatement();
            if(data.length()>0){
                if(id==1){
                    sql="select * from PHAN_ANH where MA_PHAN_ANH like N'" + data+"%'";
                }
                if(id==2){
                    sql="select * from PHAN_ANH where NGUOI_PHAN_ANH like N'" + data+"%'";
                }
                if(id==3){
                    sql="select * from PHAN_ANH where NOI_DUNG like N'" + data+"%'";
                }     
            }
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
    
    public ResultSet XuatPH(String data){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            conn = MySQLConnection.getMySQLConnection();
            String sql="select * from PhanHoi where MA_PHAN_HOI="+data;
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
    
    public ResultSet GhiNhanPhanHoi(String data){
        Connection conn=null;
        ResultSet rs=null;
        Statement st=null;
        try{
            conn = MySQLConnection.getMySQLConnection();
            String sql="select * from PhanHoi where MA_PHAN_HOI="+data;
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
    
    public static int Add(QLPhanHoi ph){
        Connection conn=null;
        PreparedStatement ps=null;
        int ret=-1;
        try{
        conn = MySQLConnection.getMySQLConnection();
        String sql= "insert into PhanHoi values (?,?,?,?,?)";
        ps=conn.prepareStatement(sql);
        ps.setInt(1,ph.getMaPhanHoi());
        ps.setDate(2, Date.valueOf(ph.getNgayPhanHoi())); 
        ps.setString(3,ph.getNguoiLienQuan());
        ps.setString(4,ph.getNoiDung());
        ps.setString(5,ph.getCoQuan());
        ret=ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                }
                
                if(ps!=null){
                    ps.close();
                }
        
            }catch(Exception ex){
                ex.printStackTrace();
            }
            return ret;
        }
    }
    
    public ResultSet Show(){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            conn = MySQLConnection.getMySQLConnection();
            st=conn.createStatement();
            String sql="select * from PHAN_ANH";
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
    
}
