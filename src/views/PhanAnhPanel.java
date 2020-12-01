/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.TimKiemController;
import java.awt.BorderLayout;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.PhanAnh;

/**
 *
 * @author acer
 */
public class PhanAnhPanel extends javax.swing.JPanel {

    JFrame parentFrame;
    private TimKiemController control=new TimKiemController();
    private ArrayList<PhanAnh> listSearchDate=new ArrayList<>();
    private ArrayList<PhanAnh> listSearchState=new ArrayList<>();
    private ArrayList<PhanAnh> listSearchName=new ArrayList<>();
    DefaultTableModel model;
     public PhanAnhPanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxState = new javax.swing.JComboBox<>();
        jTextName = new javax.swing.JTextField();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        thongTinPhanAnh = new javax.swing.JTable();

        jComboBoxState.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Mới ghi nhận", "Đang giải quyết", "Đã giải quyết" }));
        jComboBoxState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStateActionPerformed(evt);
            }
        });

        jTextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNameKeyPressed(evt);
            }
        });

        jComboBoxDay.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMonth.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBoxYear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jComboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxYearActionPerformed(evt);
            }
        });

        jButton1.setText("Tìm kiếm theo ngày");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonChange.setText("Sửa phản ánh");

        jButtonInsert.setText("Thêm phản ánh");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Xóa phản ánh");

        thongTinPhanAnh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Nội dung", "Ngày", "Phân loại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        thongTinPhanAnh.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                thongTinPhanAnhComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(thongTinPhanAnh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxYearActionPerformed

    private void jComboBoxStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStateActionPerformed
        // TODO add your handling code here:
        String state = jComboBoxState.getSelectedItem().toString();
            System.out.println(state);
            /*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date d=new Date();
            PhanAnh a= new PhanAnh(1,"Ha","khong",d,"hda","dfahd");
            PhanAnh b= new PhanAnh(2,"Ha","khonfhbdvsg",d,"hda","dfahd");
            model=(DefaultTableModel) thongTinPhanAnh.getModel();
            listSearchDate.add(a);
            listSearchDate.add(b);
            */
            if (state=="Tất cả") {listSearchState=control.getAllPhanAnh(); System.out.println(listSearchState.size());}
            else {listSearchState=control.getPhanAnhByState(state);}
            model=(DefaultTableModel) thongTinPhanAnh.getModel();
            model.setRowCount(0);
            showResult();
    }//GEN-LAST:event_jComboBoxStateActionPerformed

    private void jTextNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNameKeyPressed
        // TODO add your handling code here:
        String nameSearch=null;
        nameSearch=jTextName.getText();
        listSearchName=null;
        listSearchName =control.getPhanAnhByName(nameSearch);

        // System.out.println("length="+listSearchName.size());
        model=new DefaultTableModel();
        model=(DefaultTableModel) thongTinPhanAnh.getModel();
        model.setRowCount(0);
         showResultByName();
    }//GEN-LAST:event_jTextNameKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String day=jComboBoxDay.getSelectedItem().toString();
        String month=jComboBoxMonth.getSelectedItem().toString();
        String year=jComboBoxYear.getSelectedItem().toString();
        Boolean test=true;
        int day1=Integer.parseInt(day);
        int year1=Integer.parseInt(year);
        int month1=Integer.parseInt(month);
        switch(month1){
               case 4: if (day1==31)  {JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 4 chỉ có 30 ngày");test=false;break;}
               case 6: if (day1==31)  {JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 6 chỉ có 30 ngày");test=false;break;};
               case 9:  if (day1==31)  {JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 9 chỉ có 30 ngày");test=false;break;};
               case 11: if (day1==31)  {JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 11 chỉ có 30 ngày");test=false;break;};
               case 2: {if(!checkYear(year1) &&(day1>=29)){JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 2 năm không nhuận chỉ có 28 ngày");test=false;break;}
                        if (checkYear(year1) &&(day1>=30)){JOptionPane.showMessageDialog(thongTinPhanAnh, "Tháng 2 năm  nhuận chỉ có 29 ngày");test=false;break;}
               };
        }
          if (test){
            Date date=Date.valueOf(year+"-"+month+"-"+day);
            //System.out.println(date);
            listSearchDate=control.getPhanAnhByDate(date);
            model=(DefaultTableModel) thongTinPhanAnh.getModel();
            model=(DefaultTableModel) thongTinPhanAnh.getModel();
            model.setRowCount(0);
            
            showResultByDate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thongTinPhanAnhComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_thongTinPhanAnhComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_thongTinPhanAnhComponentHidden

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new ThemPAPanel(parentFrame));   
    }//GEN-LAST:event_jButtonInsertActionPerformed
    
    public void showResultByDate(){
        if(listSearchDate.isEmpty())  JOptionPane.showMessageDialog(thongTinPhanAnh, "Không tồn tại dữ liệu cần tìm");
        for (int i = 0; i < listSearchDate.size(); i++) {
            model.addRow(new Object[]{listSearchDate.get(i).getId(),listSearchDate.get(i).getName(),listSearchDate.get(i).getContent(),listSearchDate.get(i).getDate(),listSearchDate.get(i).getType(),listSearchDate.get(i).getState()});   
        }
    }
    
    static boolean checkYear(int year) 
    { 
        return (((year % 4 == 0) && (year % 100 != 0)) || 
            (year % 400 == 0)); 
    } 
    
    public void showResultByName(){
        
        for (int i = 0; i < listSearchName.size(); i++) {
           
            model.addRow(new Object[]{listSearchName.get(i).getId(),listSearchName.get(i).getName(),listSearchName.get(i).getContent(),listSearchName.get(i).getDate(),listSearchName.get(i).getType(),listSearchName.get(i).getState()});   
        }
       
    }
    public void showResult(){
            if(listSearchState.isEmpty())  JOptionPane.showMessageDialog(thongTinPhanAnh, "Không tồn tại dữ liệu cần tìm");
            //System.out.println(listSearchState.size());
            for (int i = 0; i < listSearchState.size(); i++) {
                model.addRow(new Object[]{listSearchState.get(i).getId(),listSearchState.get(i).getName(),listSearchState.get(i).getContent(),listSearchState.get(i).getDate(),listSearchState.get(i).getType(),listSearchState.get(i).getState()});   
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTable thongTinPhanAnh;
    // End of variables declaration//GEN-END:variables
}
