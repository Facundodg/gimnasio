package Servicios;

import Modelo.Conexion;
import Modelo.Configuraciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_configuraciones extends Conexion {

    // MODIFICAR MODO NOCTURNO
    public boolean modificarModoNorcturno(Configuraciones conf) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE configuraciones SET ModoNocturno=? WHERE usuarioId=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setBoolean(1, conf.getModoNocturno());
            ps.setString(2, conf.getUsuarioId());

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

    // MODIFICAR IDIOMA
    public boolean modificarIdioma(Configuraciones conf) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE configuraciones SET Idioma=? WHERE usuarioId=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, conf.getIdioma());
            ps.setString(2, conf.getUsuarioId());

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
    
    // MODIFICAR SONIDO
    public boolean modificarSonido(Configuraciones conf) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE configuraciones SET Sonido=? WHERE usuarioId=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setBoolean(1, conf.getSonido());
            ps.setString(2, conf.getUsuarioId());

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
