/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.phananh;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import models.PhanAnh;
import views.phananh.XemPAPanel;

/**
 *
 * @author Hoang Trung Hieu
 */
public class XemPAController {
    
    private PhanAnh phanAnh;
    private XemPAPanel panel;

    public XemPAController(PhanAnh phanAnh, XemPAPanel panel) {
        this.phanAnh = phanAnh;
        this.panel = panel;
        setData();
    }
    
    private void setData() {
        panel.setNamePA(phanAnh.getName());
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = dateFormat.format(phanAnh.getDate());  
        
        panel.setDate(strDate);
        panel.setType(phanAnh.getType());
        panel.setState(phanAnh.getState());
        panel.setContent(phanAnh.getContent());
    }

    public XemPAPanel getPanel() {
        return panel;
    }
    
}
