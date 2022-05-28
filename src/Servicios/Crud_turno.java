package Servicios;

import Modelo.Conexion;
import Modelo.Turno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_turno extends Conexion{
    
    // GUARDAR
    public boolean guardar(Turno tu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO turno (Nombre,Dni,Telefono,Direccion,Sexo,Edad,Motivo,Fecha,Hora) VALUES (?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, tu.getNombreTurno());
            ps.setInt(2, tu.getDniTurno());
            ps.setLong(3, tu.getTelefonoTurno());
            ps.setString(4, tu.getDireccionTurno());
            ps.setString(5, tu.getSexoTurno());
            ps.setInt(6, tu.getEdadTurno());
            ps.setString(7, tu.getMotivoTurno());
            ps.setDate(8, tu.getFechaTurno());
            ps.setTime(9, tu.getHoraTurno());
            
            ps.execute();

            return true;

        } catch (SQLException e) {

            System.out.println(e);
            System.out.println("AQUI ES EL PROBLEMA");

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
