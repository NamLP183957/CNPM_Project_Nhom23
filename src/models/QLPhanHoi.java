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
    private String maPH;
    private String ngLienHe;
    private String ngayPH;
    private String noiDung;
    private String coQuan;
    
    public QLPhanHoi(String maPH, String ngLienHe, String ngayPH, String noiDung, String coQuan){
        this.maPH=maPH;
        this.ngLienHe=ngLienHe;
        this.ngayPH=ngayPH;
        this.noiDung=noiDung;
        this.coQuan=coQuan;
    }

    public String getMaPH() {
        return maPH;
    }

    public void setMaPH(String maPH) {
        this.maPH = maPH;
    }

    public String getNgLienHe() {
        return ngLienHe;
    }

    public void setNgLienHe(String ngLienHe) {
        this.ngLienHe = ngLienHe;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
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
