package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_turno extends Conexion{
    
    // GUARDAR
    public boolean guardar(Turno tu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO turno (Nombre,Dni,Fecha,Hora) VALUES (?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, tu.getNombreTurno());
            ps.setInt(2, tu.getDniTurno());
            ps.setDate(3, tu.getFechaTurno());
            ps.setTime(4, tu.getHoraTurno());
            
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
