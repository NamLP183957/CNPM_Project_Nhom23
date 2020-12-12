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
import java.util.Vector;
import models.QLPhanHoi;
import service.MySQLConnection;
/**
 *
 * @author Vostro 3580
 */
public class QLPhanHoiModify {
    public ResultSet Search(String data, String selected){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        try{
            conn=MySQLConnection.getMySQLConnection();
            String sql=null;
            st=conn.createStatement();
            if(data.length()>0){
                sql="select * from PHAN_ANH where NGUOI_PHAN_ANH like N'"+data+"%' and PHAN_LOAI=N'"+selected+"'"; 
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
            conn=MySQLConnection.getMySQLConnection();
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
            conn=MySQLConnection.getMySQLConnection();
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
        conn=MySQLConnection.getMySQLConnection();
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
            conn=MySQLConnection.getMySQLConnection();
            st=conn.createStatement();
            String sql="select * from PHAN_ANH";
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
    
    public Vector<String> comboxLinhVuc(){
        Connection conn=null;
        Statement st=null;
        ResultSet rs=null;
        Vector<String> data=null;
        try{
            conn=MySQLConnection.getMySQLConnection();
            st=conn.createStatement();
            String sql="select distinct PHAN_LOAI from PHAN_ANH ";
            rs=st.executeQuery(sql);
            data=new Vector<String>();
            while(rs.next()){
                data.add(rs.getString("PHAN_LOAI").toString());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return data;
        }
    }
    
    public int Edit(String dataND, int dataMaPH){
        String sql="Update PhanHoi set NOI_DUNG=? where MA_PHAN_HOI=?";
        Connection conn=null;
        PreparedStatement st=null;
        int ret=-1;
        try{
            conn=MySQLConnection.getMySQLConnection();
            st=conn.prepareStatement(sql);
            st.setString(1, dataND);
            st.setInt(2, dataMaPH);
            ret=st.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return ret;
        }
    }
}
