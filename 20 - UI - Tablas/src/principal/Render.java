
package principal;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;


public class Render extends DefaultTableCellRenderer {
    
    //DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        setHorizontalAlignment(SwingConstants.CENTER);
        
        //table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        //table.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        
        
       
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
