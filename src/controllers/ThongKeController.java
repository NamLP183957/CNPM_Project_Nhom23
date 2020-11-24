/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import service.MySQLConnection;

/**
 *
 * @author ADMIN
 */
public class ThongKeController {
    private DefaultCategoryDataset dataset;
    private List<Pair<Integer, String> > list;
    
    public void  createDataSet(String tieuChi){
        dataset = new DefaultCategoryDataset();
        list = new ArrayList<>();
        try {
            Connection connection = MySQLConnection.getMySQLConnection();
            PreparedStatement statement = null;
            switch(tieuChi) {
                case "Trạng thái":
                    String TRANG_THAI_SQL = "SELECT COUNT(*) AS tong, trang_thai AS trangThai "
                    + "FROM phan_anh GROUP BY (trang_thai)";
                    statement = connection.prepareStatement(TRANG_THAI_SQL);
                    break;
                    
                case "Lĩnh vực":
                    String LINH_VUC_SQL = "SELECT COUNT(*), phan_loai "
                            + "FROM phan_anh GROUP BY (phan_loai)";
                    statement = connection.prepareStatement(LINH_VUC_SQL);
                    break;
                    
                case "Quý":
                    String QUI_SQL = "SELECT COUNT(*)," +
                            "CASE WHEN month(ngay_phan_anh) >= 1 && month(ngay_phan_anh) <= 3 THEN 'I'" +
                            "WHEN month(ngay_phan_anh) >= 4 && month(ngay_phan_anh) <= 6 THEN 'II'" +
                            "WHEN month(ngay_phan_anh) >= 7 && month(ngay_phan_anh) <= 9 THEN 'III'" +
                            "ELSE 'IV' END " +
                            "FROM phan_anh GROUP BY (" +
                            "CASE WHEN month(ngay_phan_anh) >= 1 && month(ngay_phan_anh) <= 3 THEN 'I'" +
                            "WHEN month(ngay_phan_anh) >= 4 && month(ngay_phan_anh) <= 6 THEN 'II'" +
                            "WHEN month(ngay_phan_anh) >= 7 && month(ngay_phan_anh) <= 9 THEN 'III'" +
                            "ELSE 'IV' END)";
                    statement = connection.prepareStatement(QUI_SQL);
                    break;
                    
                case "Năm":
                    String NAM_SQL = "SELECT COUNT(*), YEAR(ngay_phan_anh) "
                            + "FROM phan_anh GROUP BY (YEAR(ngay_phan_anh))";
                    statement = connection.prepareStatement(NAM_SQL);
                    break;
            }
            
            
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()) {
                dataset.addValue(rs.getInt(1), "Số phản ánh", rs.getString(2));
                list.add(new Pair<>(rs.getInt(1), rs.getString(2)));
            }
            statement.close();
            connection.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public JFreeChart createChart(String tieuChi){
        createDataSet(tieuChi);
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê phản ánh theo " + tieuChi, tieuChi, "Số phản ánh",
               dataset , PlotOrientation.VERTICAL, true, true, false
        );
        return barChart;
    }
    
    public void drawChart(JPanel root, String tieuChi) {
        ChartPanel chartPanel = new ChartPanel(createChart(tieuChi));
        chartPanel.setPreferredSize(new java.awt.Dimension(490, 750));
        root.removeAll();
        root.add(chartPanel);
        root.updateUI();
    }
    
    
}
