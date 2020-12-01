/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Vostro 3580
 */
public class QLPhanHoi {
    private int maPhanHoi;
    private String ngayPhanHoi;
    private String nguoiLienQuan;
    private String noiDung;
    private String coQuan;
    
    public QLPhanHoi(){
        
    }

    public int getMaPhanHoi() {
        return maPhanHoi;
    }

    public void setMaPhanHoi(int maPhanHoi) {
        this.maPhanHoi = maPhanHoi;
    }

    public String getNgayPhanHoi() {
        return ngayPhanHoi;
    }

    public void setNgayPhanHoi(String ngayPhanHoi) {
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
