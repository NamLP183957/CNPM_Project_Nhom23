/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import service.MySQLConnection;
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
                    sql="select * from PHAN_ANH where MA_PHAN_ANH like '" + data+"%'";
                }
                if(id==2){
                    sql="select * from PHAN_ANH where NGUOI_PHAN_ANH like '" + data+"%'";
                }
                if(id==3){
                    sql="select * from PHAN_ANH where NOI_DUNG like '" + data+"%'";
                }     
            }
            rs=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            return rs;
        }
    }
}
