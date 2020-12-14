/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phanhoi;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import models.PhanHoi;
import views.phanhoi.XemPHPanel;

/**
 *
 * @author THINKBOOK
 */
public class XemPHController {
    private int maPA;
    private XemPHPanel panel;

    public XemPHController(int maPA, XemPHPanel panel) {
        this.maPA = maPA;
        this.panel = panel;
        setData();
    }
    
    private void setData() {
        PhanHoi phanHoi = PhanHoiController.xuatPH(maPA);
        if (phanHoi != null) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = phanHoi.getNgayPhanHoi();
            String strDate = dateFormat.format(date);

            panel.setData(strDate, phanHoi.getCoQuan(), phanHoi.getNguoiLienQuan(), phanHoi.getNoiDung());
        } else {
            System.out.println("controllers.phanhoi.XemPHController.setData()");
        }
        
    }

    public XemPHPanel getPanel() {
        return panel;
    }
}
