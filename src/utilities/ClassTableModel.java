
package utilities;

import java.util.List;
import javafx.util.Pair;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.PhanAnh;

/**
 *
 * @author Tran Van Tuyen
 */
public class ClassTableModel {
   
    public DefaultTableModel setPhanAnhTable(List<PhanAnh> listPhanAnh, JTable phanAnhTable) {
        
        DefaultTableModel dtm = (DefaultTableModel) phanAnhTable.getModel();
        dtm.setRowCount(0);
        dtm.setColumnIdentifiers(new Object[] {
            "STT", "Người phản ánh", "Ngày", "Nội dung", "Lĩnh vực", "Trạng thái"
        });
        
        for(int i = 0; i < listPhanAnh.size(); i++) {
            PhanAnh phanAnh = listPhanAnh.get(i);
            dtm.addRow(new Object[]{
                i+1, phanAnh.getName(), phanAnh.getDate(), phanAnh.getContent(), phanAnh.getType(), phanAnh.getState()
            });
        }
        
        return dtm;
    }
    
    public DefaultTableModel setThongKeTable(String tieuChi, List<Pair<Integer, String> > list, JTable jtb){
        DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
        dtm.setRowCount(0);
        dtm.setColumnIdentifiers(new Object[]{
            tieuChi, "Số lượng"
        });
        
        for(int i = 0; i < list.size(); i++){
            String field = list.get(i).getValue();
            int soLuong = list.get(i).getKey();
            dtm.addRow(new Object[] {
                field, soLuong
            });
        }
        
        return dtm;
    }
}
