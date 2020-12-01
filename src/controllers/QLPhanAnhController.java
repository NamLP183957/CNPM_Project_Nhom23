/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import service.MySQLConnection;

/**
 *
 * @author trado006
 */
public class QLPhanAnhController {
    String name;
    int id;
    String type;
    String state;
    String date;
    ArrayList<String> typeList;
    ArrayList<String> stateList;
    ArrayList<String> dateList;
    public boolean pretareTypeList(){
        String sql = "SELECT PHAN_LOAI FROM PHAN_ANH WHERE NGUOI_PHAN_ANH LIKE '"+name+"';";
        Connection conn = MySQLConnection.getMySQLConnection();
        typeList = new ArrayList<String>();
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            typeList.add(rs.getString(1));
        }
        return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean prepareStateList(){
        String sql = "SELECT TRANG_THAI FROM PHAN_ANH WHERE (NGUOI_PHAN_ANH LIKE '"+name+
                "')AND(PHAN_LOAI='"+type+"');";
        Connection conn = MySQLConnection.getMySQLConnection();
        stateList = new ArrayList<String>();
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            stateList.add(rs.getString(1));
        }
        return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean prepareDateList(){
        String sql = "SELECT NGAY_PHAN_ANH FROM PHAN_ANH WHERE (NGUOI_PHAN_ANH LIKE '"+name+
                "')AND(PHAN_LOAI='"+type+"')AND(TRANG_THAI='"+state+"');";
        Connection conn = MySQLConnection.getMySQLConnection();
        dateList = new ArrayList<String>();
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            dateList.add(rs.getString(1));
        }
        return true;
        }catch(Exception e){
            return false;
        }
    }
    public boolean getId(){
        String sql = "SELECT MA_PHAN_ANH FROM PHAN_ANH WHERE (NGUOI_PHAN_ANH LIKE '"+name+
                "')AND(PHAN_LOAI='"+type+"')AND(TRANG_THAI='"+state+"')AND(NGAY_PHAN_ANH='"+date+"');";
        Connection conn = MySQLConnection.getMySQLConnection();
        
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            id = rs.getInt(1);
            System.out.println(id);
            return true;
        }
        return false;
        }catch(Exception e){
            return false;
        }
    }
    public String getContent(){
        String sql = "SELECT NOI_DUNG FROM PHAN_ANH WHERE MA_PHAN_ANH="+id+";";
        Connection conn = MySQLConnection.getMySQLConnection();
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            return rs.getString(1);
        }
        return null;
        }catch(Exception e){
            return null;
        }
    }
    public boolean updateContent(String content){
        String sql = "UPDATE PHAN_ANH SET NOI_DUNG='"+content+"' WHERE MA_PHAN_ANH="+id+";";
        Connection conn = MySQLConnection.getMySQLConnection();
        try{
        Statement stmt = conn.createStatement();
        if(stmt.execute(sql)==false) return true;
        return false;
        }catch(Exception e){
            return false;
        }
    }
    public boolean deletePhanAnh(){
        String sql = "DELETE FROM PHAN_ANH WHERE MA_PHAN_ANH="+id+";";
        Connection conn = MySQLConnection.getMySQLConnection();
        try{
        Statement stmt = conn.createStatement();
        if(stmt.execute(sql)==false) return true;
        return false;
        }catch(Exception e){
            return false;
        }
    }
    public int setName(String name) {
        this.name = name;
        String sql = "SELECT NGUOI_PHAN_ANH FROM PHAN_ANH WHERE NGUOI_PHAN_ANH LIKE '"+name+"';";
        Connection conn = MySQLConnection.getMySQLConnection();
        typeList = new ArrayList<String>();
        try{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            return 1;
        }
        return 0;
        }catch(Exception e){
            return -1;
        }
    }
    
    public ArrayList<String> getTypeList() {
        return typeList;
    }
    public ArrayList<String> getStateList() {
        return stateList;
    }
    public ArrayList<String> getDateList() {
        return dateList;
    }

    public void setType(String type) {
        System.out.println(type);
        this.type = type;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
