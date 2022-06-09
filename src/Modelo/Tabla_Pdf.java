package Modelo;

import Servicios.Crud_Pdf;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Tabla_Pdf {

    Crud_Pdf dao = null;

    public void visualizar_PdfVO(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new imgTabla());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Id");
        dt.addColumn("Nombre de PDF");
        dt.addColumn("Archivo PDF");

        ImageIcon icono = null;
        if (get_Image("/img/32pdf.png") != null) {
            icono = new ImageIcon(get_Image("/img/32pdf.png"));
        }

        dao = new Crud_Pdf();
        Pdf vo = new Pdf();
        ArrayList<Pdf> list = dao.Listar_PdfVO();

        if (list.size() > 0) {
            
            
            for (int i = 0; i < list.size(); i++) {
                Object fila[] = new Object[3];
                vo = list.get(i);
                fila[0] = vo.getId();
                fila[1] = vo.getNombrepdf();
                if (vo.getArchivopdf() != null) {
                    fila[2] = new JButton(icono);
                } else {
                    fila[2] = new JButton("Vacio");
                }

                dt.addRow(fila);
            }
            tabla.setModel(dt);
            tabla.setRowHeight(32);
        }
    }

    public Image get_Image(String ruta) {
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(ruta));
            Image mainIcon = imageIcon.getImage();
            return mainIcon;
        } catch (Exception e) {
        }
        return null;
    }

}
