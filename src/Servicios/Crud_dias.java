package Servicios;

import Controlador.Crl_cliente;
import Modelo.Conexion;
import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud_dias extends Conexion {

    public void DescontarDiasCliente() {

        //UPDATE cliente SET Dias = (Dias - 1);
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE cliente SET Dias = (Dias - 1)";

        try {

            ps = con.prepareStatement(sql);
            ps.execute();

            System.out.println(ANSI_YELLOW + "---DIA RESTADO---");
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(Crud_dias.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void DescontarDiasClientePrueba(int dia) {

        //UPDATE cliente SET Dias = (Dias - 1);
        PreparedStatement ps = null;
        Connection con = getConexion();
        String diaString = String.valueOf(dia);

        String sql = "UPDATE cliente SET Dias = (Dias - like '%" + diaString + "%')";

        try {

            ps = con.prepareStatement(sql);
            ps.execute();

            System.out.println(ANSI_YELLOW + "---DIA RESTADO---");
            System.out.println(ANSI_GREEN + "-Se restaron " + diaString + " dias.");
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        } catch (SQLException ex) {
            Logger.getLogger(Crud_dias.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
