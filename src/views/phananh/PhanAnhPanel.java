/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.phananh;

import controllers.TimKiemController;
import controllers.phananh.SuaPAController;
import controllers.phananh.XemPAController;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.PhanAnh;

/**
 *
 * @author Tran Van Tuyen
 */
public class PhanAnhPanel extends javax.swing.JPanel {

    JFrame parentFrame;
    private TimKiemController control = new TimKiemController();
    private ArrayList<PhanAnh> listSearch = new ArrayList<>();
    
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
        jButtonChange = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        thongTinPhanAnh = new javax.swing.JTable();
        btnDetailView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxLinhVuc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jComboBoxState.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Môi trường", "Chờ tiếp nhận", "Đang giải quyết", "Đã giải quyết", "Từ chối tiếp nhận", "Bị trả lại", "Chờ bổ sung" }));
        jComboBoxState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStateActionPerformed(evt);
            }
        });

        jTextName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextNameKeyPressed(evt);
            }
        });

        jButtonChange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonChange.setText("Sửa phản ánh");
        jButtonChange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonInsert.setText("Thêm phản ánh");
        jButtonInsert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonDelete.setText("Xóa phản ánh");
        jButtonDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        thongTinPhanAnh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        thongTinPhanAnh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thongTinPhanAnh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Người phản ánh", "Nội dung", "Ngày", "Phân loại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        thongTinPhanAnh.setRowHeight(28);
        thongTinPhanAnh.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                thongTinPhanAnhComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(thongTinPhanAnh);

        btnDetailView.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDetailView.setText("Xem Chi Tiết");
        btnDetailView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetailView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailViewActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Trạng thái");

        jComboBoxLinhVuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxLinhVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "An toàn thực phẩm", "Thủ tục hành chính", "An ninh trật tự", "Tôn giáo tín ngưỡng", "Thi đua khen thưởng", "Văn hóa lễ hội", "Kinh doanh", "Thi hành pháp luật", "Lĩnh vực khác" }));
        jComboBoxLinhVuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLinhVucActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Lĩnh vực");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Người phản ánh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLinhVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextName)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDetailView, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLinhVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetailView, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStateActionPerformed
        // TODO add your handling code here:
        String state = jComboBoxState.getSelectedItem().toString();
        String linhVuc = jComboBoxLinhVuc.getSelectedItem().toString();
        String name = jTextName.getText();
        if (state == "Tất cả") state = "";
        if (linhVuc == "Tất cả") linhVuc = "";
        listSearch = null;
        listSearch = control.getPhanAnhByAll(state, linhVuc, name);
        model = new DefaultTableModel();
        model = (DefaultTableModel) thongTinPhanAnh.getModel();
        model.setRowCount(0);
        showResult();
    }//GEN-LAST:event_jComboBoxStateActionPerformed

    private void jTextNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNameKeyPressed
        // TODO add your handling code here:
        String state = jComboBoxState.getSelectedItem().toString();
        String linhVuc = jComboBoxLinhVuc.getSelectedItem().toString();
        String name = jTextName.getText();
        if (state == "Tất cả") state = "";
        if (linhVuc == "Tất cả") linhVuc = "";
        listSearch = null;
        listSearch = control.getPhanAnhByAll(state, linhVuc,name);
        model = new DefaultTableModel();
        model = (DefaultTableModel) thongTinPhanAnh.getModel();
        model.setRowCount(0);
        showResult();
    }//GEN-LAST:event_jTextNameKeyPressed

    private void thongTinPhanAnhComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_thongTinPhanAnhComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_thongTinPhanAnhComponentHidden

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new ThemPAPanel(parentFrame));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void btnDetailViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailViewActionPerformed
        // TODO add your handling code here:    
        int selectedIndex = thongTinPhanAnh.getSelectedRow();
        if (selectedIndex >= 0) {
            PhanAnh phanAnh = listSearch.get(selectedIndex);
            XemPAPanel xemPAPanel = new XemPAPanel(this.parentFrame);
            XemPAController xemPAController = new XemPAController(phanAnh, xemPAPanel);
            this.removeAll();
            this.setLayout(new BorderLayout());
            this.add(xemPAController.getPanel());
            this.validate();
            this.repaint();
            
        } else {
            JOptionPane.showMessageDialog(this, "Hãy chọn một phản ánh!");
        }
    }//GEN-LAST:event_btnDetailViewActionPerformed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        // TODO add your handling code here:
        int rowselected = thongTinPhanAnh.getSelectedRow();
        if(rowselected == -1){
            JOptionPane.showMessageDialog(this, "bạn chưa chọn phản ánh để thay đổi");
            return;
        }
        PhanAnh pa = listSearch.get(rowselected);
        System.out.print(pa.getId());
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new SuaPAPanel(parentFrame,pa));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jComboBoxLinhVucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLinhVucActionPerformed
        String state = jComboBoxState.getSelectedItem().toString();
        String linhVuc = jComboBoxLinhVuc.getSelectedItem().toString();
        String name = jTextName.getText();
        if (state == "Tất cả") state = "";
        if (linhVuc == "Tất cả") linhVuc = "";
        listSearch = null;
        listSearch = control.getPhanAnhByAll(state, linhVuc, name);
        model = new DefaultTableModel();
        model = (DefaultTableModel) thongTinPhanAnh.getModel();
        model.setRowCount(0);
        showResult();
                  
    }//GEN-LAST:event_jComboBoxLinhVucActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        
    }//GEN-LAST:event_formComponentHidden

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        int selectedIndex = thongTinPhanAnh.getSelectedRow();

        if (selectedIndex >= 0) {
            PhanAnh phanAnh = listSearch.get(selectedIndex);
            
            int option = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa phản ánh này?");
            
            if (option == 0) {
                SuaPAController.deletePhanAnh(phanAnh.getId());
                listSearch.remove(phanAnh);
                model.setRowCount(0);
                showResult();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chọn một phản ánh để xóa");
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    
    public void showResultByDate(){
        if(listSearch.isEmpty())
            JOptionPane.showMessageDialog(thongTinPhanAnh, "Không tồn tại dữ liệu cần tìm");
        for (int i = 0; i < listSearch.size(); i++) {
            model.addRow(new Object[]{listSearch.get(i).getId(),listSearch.get(i).getName(),listSearch.get(i).getContent(),listSearch.get(i).getDate(),listSearch.get(i).getType(),listSearch.get(i).getState()});   
        }
    }
    
    static boolean checkYear(int year) 
    { 
        return (((year % 4 == 0) && (year % 100 != 0)) || 
            (year % 400 == 0)); 
    } 
    
    public void showResultByName(){
        
        for (int i = 0; i < listSearch.size(); i++) {
           
            model.addRow(new Object[]{listSearch.get(i).getName(),listSearch.get(i).getContent(),listSearch.get(i).getDate(),listSearch.get(i).getType(),listSearch.get(i).getState()});   
        }
       
    }
    public void showResult(){
//            if(listSearch.isEmpty()) 
//                JOptionPane.showMessageDialog(thongTinPhanAnh, "Không tồn tại dữ liệu cần tìm");
            for (int i = 0; i < listSearch.size(); i++) {
                model.addRow(new Object[]{listSearch.get(i).getName(),
                                            listSearch.get(i).getContent(),
                                            listSearch.get(i).getDate(),
                                            listSearch.get(i).getType(),
                                            listSearch.get(i).getState()});   
            }
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetailView;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JComboBox<String> jComboBoxLinhVuc;
    private javax.swing.JComboBox<String> jComboBoxState;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTable thongTinPhanAnh;
    // End of variables declaration//GEN-END:variables
}
