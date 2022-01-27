package Modelo;

import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_YELLOW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crud_fecha extends Conexion {

    public boolean guardar_fecha_hoy(Fecha fech) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO fecha (Fecha_hoy) VALUES (?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setDate(1, fech.getFecha_hoy());

            ps.execute();

            return true;

        } catch (SQLException e) {

            System.out.println(e);

            return false;

        } finally {

            try {

                con.close();

            } catch (SQLException e) {

                System.out.println(e);

            }
        }
    }

    public boolean guardar_fecha_ayer(Fecha fech) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO fecha (Fecha_ayer) VALUES (?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setDate(1, fech.getFecha_ayer());

            ps.execute();

            return true;

        } catch (SQLException e) {

            System.out.println(e);

            return false;

        } finally {

            try {

                con.close();

            } catch (SQLException e) {

                System.out.println(e);

            }
        }
    }

    public boolean modificar_fecha_hoy(Fecha fech) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE fecha SET Fecha_hoy=? WHERE Id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setDate(1, fech.getFecha_hoy());
            ps.setInt(2, fech.getId());

            ps.execute();

            return true;

        } catch (SQLException e) {

            System.out.println(e);

            return false;

        } finally {

            try {

                con.close();

            } catch (SQLException e) {

                System.out.println(e);

            }
        }
    }
    
    public void intercambiarFechas(Fecha fech){

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE fecha SET Fecha_ayer = Fecha_hoy";

        try {

            ps = con.prepareStatement(sql);
            ps.execute();

            System.out.println(ANSI_YELLOW + "---SE INTERCAMBIO LAS FECHAS---");
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");


        } catch (SQLException ex) {
            Logger.getLogger(Crud_dias.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }


}
