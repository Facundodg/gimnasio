package Modelo;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderImagen extends DefaultTableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,
            boolean hasFocus,int r,int column){
        
        
        if(value instanceof JLabel){
            
            JLabel lb1 = (JLabel) value;
            return lb1;
        }
        
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, r, column);
        
        
    }
    
    
    
}
