package Vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ColorCeldaCliente extends JTable {

    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int ColumnIndex) {

        Component componente = super.prepareRenderer(renderer, rowIndex, ColumnIndex);

        if (ColumnIndex == 6) {

            int valor = Integer.parseInt(this.getValueAt(rowIndex, ColumnIndex).toString());

            if (valor > 20) {

                componente.setBackground(Color.green);
                componente.setForeground(Color.white);

            }

            if (valor < 20) {

                componente.setBackground(Color.orange);
                componente.setForeground(Color.white);

            }
            if (valor < 5) {

                componente.setBackground(Color.red);
                componente.setForeground(Color.white);

            }

        } else {
            componente.setBackground(Color.white);
            componente.setForeground(Color.black);
        }

        return componente;
    }

}
