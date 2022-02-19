package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ColorCeldaProducto extends JTable {

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int ColumnIndex) {

        Component componente = super.prepareRenderer(renderer, rowIndex, ColumnIndex);

        if (ColumnIndex == 5) {

            int valor = Integer.parseInt(this.getValueAt(rowIndex, ColumnIndex).toString());

            if (valor < 10) {

                componente.setBackground(Color.orange);
                componente.setForeground(Color.white);

            }
            if (valor < 3) {

                componente.setBackground(Color.red);
                componente.setForeground(Color.white);

            }

            if (valor > 30) {

                componente.setBackground(Color.GREEN);
                componente.setForeground(Color.white);

            }

        } else {
            componente.setBackground(Color.white);
            componente.setForeground(Color.black);
        }

        return componente;
    }

}
