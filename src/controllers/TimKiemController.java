package controllers;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import models.PhanAnh;
import java.sql.*;
import service.MySQLConnection;
/**
 *
 * @author Tran Van Tuyen
 */
public class TimKiemController {
        public ArrayList<PhanAnh> getPhanAnhByState(String state) {
            ArrayList<PhanAnh> list = new ArrayList<>();
            Connection conn=MySQLConnection.getMySQLConnection();
            String select = "select * from phan_anh where TRANG_THAI='"+state+"'";
            //System.out.println(state);
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PhanAnh pa = new PhanAnh();
                    pa.setId(rs.getInt("MA_PHAN_ANH"));
                    pa.setName(rs.getString("NGUOI_PHAN_ANH"));
                    pa.setContent(rs.getString("NOI_DUNG"));
                    pa.setDate(rs.getDate("NGAY_PHAN_ANH"));
                    pa.setType(rs.getString("PHAN_LOAI"));
                    pa.setState(rs.getString("TRANG_THAI"));
                    list.add(pa);
                    //System.out.println(pa.getId()+pa.getName()+pa.getState());
                }
            } catch (Exception e) {
            }
            return list;
        }
        
        //tìm kiếm tất cả phản ánh 
        public ArrayList<PhanAnh> getAllPhanAnh() {
            ArrayList<PhanAnh> list = new ArrayList<>();
            Connection conn=MySQLConnection.getMySQLConnection();
            String select = "select * from phan_anh";
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PhanAnh pa = new PhanAnh();
                    pa.setId(rs.getInt("MA_PHAN_ANH"));
                    pa.setName(rs.getString("NGUOI_PHAN_ANH"));
                    pa.setContent(rs.getString("NOI_DUNG"));
                    pa.setDate(rs.getDate("NGAY_PHAN_ANH"));
                    pa.setType(rs.getString("PHAN_LOAI"));
                    pa.setState(rs.getString("TRANG_THAI"));
                     list.add(pa);
                    //System.out.println(pa.getId()+pa.getName()+pa.getContent()+pa.getDate()+pa.getType()+pa.getState());
                }
            } catch (Exception e) {
            }
            return list;
        } 
      
      //tìm kiếm theo tên
        public ArrayList<PhanAnh> getPhanAnhByName(String name) {
            ArrayList<PhanAnh> list = new ArrayList<>();
            Connection conn=MySQLConnection.getMySQLConnection();
            String select = "select * from phan_anh where NGUOI_PHAN_ANH LIKE '%"+ name+ "%'";
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {

                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PhanAnh pa = new PhanAnh();
                    pa.setId(rs.getInt("MA_PHAN_ANH"));
                    pa.setName(rs.getString("NGUOI_PHAN_ANH"));
                    pa.setContent(rs.getString("NOI_DUNG"));
                    pa.setDate(rs.getDate("NGAY_PHAN_ANH"));
                    pa.setType(rs.getString("PHAN_LOAI"));
                    pa.setState(rs.getString("TRANG_THAI"));
                    list.add(pa);
                    //System.out.println(pa.getId()+pa.getName()+pa.getDate());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
          }
        public ArrayList<PhanAnh> getPhanAnhByLinhVuc(String linhVuc) {
            ArrayList<PhanAnh> list = new ArrayList<>();
            Connection conn=MySQLConnection.getMySQLConnection();
            String select = "select * from phan_anh where PHAN_LOAI ='"+ linhVuc+"'";
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PhanAnh pa = new PhanAnh();
                    pa.setId(rs.getInt("MA_PHAN_ANH"));
                    pa.setName(rs.getString("NGUOI_PHAN_ANH"));
                    pa.setContent(rs.getString("NOI_DUNG"));
                    pa.setDate(rs.getDate("NGAY_PHAN_ANH"));
                    pa.setType(rs.getString("PHAN_LOAI"));
                    pa.setState(rs.getString("TRANG_THAI"));
                    list.add(pa);
                    //System.out.println(pa.getId()+pa.getName()+pa.getDate());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
          }
        public ArrayList<PhanAnh> getPhanAnhByAll(String state,String linhVuc,String name) {
            ArrayList<PhanAnh> list = new ArrayList<>();
            Connection conn=MySQLConnection.getMySQLConnection();
            String select = "select * from phan_anh where PHAN_LOAI LIKE '%"+ linhVuc+"%' and TRANG_THAI LIKE'%"+state+"%' and NGUOI_PHAN_ANH LIKE '%"+ name+ "%'";
            try (
                PreparedStatement ps = conn.prepareStatement(select)) {
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    PhanAnh pa = new PhanAnh();
                    pa.setId(rs.getInt("MA_PHAN_ANH"));
                    pa.setName(rs.getString("NGUOI_PHAN_ANH"));
                    pa.setContent(rs.getString("NOI_DUNG"));
                    pa.setDate(rs.getDate("NGAY_PHAN_ANH"));
                    pa.setType(rs.getString("PHAN_LOAI"));
                    pa.setState(rs.getString("TRANG_THAI"));
                    list.add(pa);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
          }
     
}

