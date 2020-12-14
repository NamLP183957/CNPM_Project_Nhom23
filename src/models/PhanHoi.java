/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author Le Minh Nghia
 */
public class PhanHoi {
    private int maPA;
    private Date ngayPhanHoi;
    private String nguoiLienQuan;
    private String noiDung;
    private String coQuan;
    
    public PhanHoi(){
        
    }

    public PhanHoi(int maPA, Date ngayPhanHoi, String nguoiLienQuan, String noiDung, String coQuan) {
        this.maPA = maPA;
        this.ngayPhanHoi = ngayPhanHoi;
        this.nguoiLienQuan = nguoiLienQuan;
        this.noiDung = noiDung;
        this.coQuan = coQuan;
    }

    public PhanHoi(Date ngayPhanHoi, String nguoiLienQuan, String noiDung, String coQuan) {
        this.ngayPhanHoi = ngayPhanHoi;
        this.nguoiLienQuan = nguoiLienQuan;
        this.noiDung = noiDung;
        this.coQuan = coQuan;
    }

    public int getMaPA() {
        return maPA;
    }

    public void setMaPA(int maPA) {
        this.maPA = maPA;
    }

    public Date getNgayPhanHoi() {
        return ngayPhanHoi;
    }

    public void setNgayPhanHoi(Date ngayPhanHoi) {
        this.ngayPhanHoi = ngayPhanHoi;
    }

    public String getNguoiLienQuan() {
        return nguoiLienQuan;
    }

    public void setNguoiLienQuan(String nguoiLienQuan) {
        this.nguoiLienQuan = nguoiLienQuan;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getCoQuan() {
        return coQuan;
    }

    public void setCoQuan(String coQuan) {
        this.coQuan = coQuan;
    }
    
}
