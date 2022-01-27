package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud_cliente extends Conexion {

    // GUARDAR
    public boolean guardar(Cliente cli) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO cliente (NomApe,Telefono,Dni,Direccion,Correo,Enfermedad,MedicaSiNo,Sexo,FechaActual,FechaFinMes,Dias,FechaNacimientos,Edad,Pago) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, cli.getNomApi());
            ps.setInt(2, cli.getTelefono());
            ps.setInt(3, cli.getDni());
            ps.setString(4, cli.getDireccion());
            ps.setString(5, cli.getCorreo());
            ps.setString(6, cli.getEnfermedad());
            ps.setString(7, cli.getMedicaSiNo());
            ps.setString(8, cli.getSexo());
            ps.setDate(9, cli.getFechaActual());
            ps.setDate(10, cli.getFechafinDeMes());
            ps.setInt(11, cli.getDias());
            ps.setDate(12, cli.getFechaNacimiento());
            ps.setInt(13, cli.getEdad());
            ps.setDouble(14, cli.getPago());

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
    
        //ELIMINAR
    public boolean eliminar(Cliente cli) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM cliente WHERE Dni=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, cli.getDni());

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

}
