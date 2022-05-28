package Servicios;

import Modelo.Conexion;
import Modelo.Usuario;
import static Controlador.Crl_cliente.ANSI_CYAN;
import static Controlador.Crl_cliente.ANSI_GREEN;
import static Controlador.Crl_cliente.ANSI_RESET;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Crud_usuario extends Conexion {

    private static String base = "gimnasio_main";
    private static String url = "jdbc:mysql://localhost:3306/" + base;
    private static String usuario = "root";
    private static String contraseña = "root";
    private String SQL_CONSULTAR = "SELECT * FROM Imagen";
    private Connection con = null;

    public Crud_usuario() {
    }

    //GUARDAR
    public boolean guardar(Usuario usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuario (Puesto,Usuario,Contraseña,Imagen) VALUES (?,?,?,?)"; //COMO EL ID ES AUTO INCREMENTAL
        //NO ES NECESARIO AGREGAR EL ID A LA LINEA 
        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getPuesto_usuario());
            ps.setString(2, usu.getNombre_usuario());
            ps.setString(3, usu.getContraseña_usuario());
            ps.setBytes(4, usu.getImagen());

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

    //MOSTRAR USUARIO-IMAGEN
    public ArrayList CargarImagenes() {

        ArrayList imagenes = new ArrayList();

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        try {

            ps = con.prepareStatement("SELECT * FROM usuario");
            rs = ps.executeQuery();

            while (rs.next()) {

                Usuario usu = new Usuario();

                usu.setPuesto_usuario(rs.getString("Puesto"));
                usu.setNombre_usuario(rs.getString("Usuario"));
                usu.setContraseña_usuario(rs.getString("Contraseña"));
                usu.setImagen(rs.getBytes("Imagen"));

                imagenes.add(usu);

            }

            return imagenes;

        } catch (SQLException e) {

            return null;
        }

    }

    public ArrayList ImagenPerfil(Usuario usu) {

        ArrayList imagenes = new ArrayList();

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT * FROM usuario WHERE Usuario = ?";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getNombre_usuario());

            rs = ps.executeQuery();

            while (rs.next()) {

                usu.setImagen(rs.getBytes("Imagen"));

                imagenes.add(usu);

            }

            return imagenes;

        } catch (SQLException e) {

            return null;
        }

    }

    public boolean PuestoPerfil(Usuario usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuario WHERE Usuario = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getNombre_usuario());

            rs = ps.executeQuery();

            if (rs.next()) {

                usu.setPuesto_usuario(rs.getString("Puesto"));

                return true;
            }

            return false;

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

    public boolean IdPerfil(Usuario usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuario WHERE Usuario = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getNombre_usuario());

            rs = ps.executeQuery();

            if (rs.next()) {

                usu.setId_usuario(rs.getInt("Id"));

                return true;
            }

            return false;

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

    //CONECTAR PARA MOSTRAR LA TABLA DE USUARIOS
    public boolean conectar() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = (Connection) DriverManager.getConnection(url, usuario, contraseña);

            System.out.println(ANSI_GREEN + "-Conecto Correcta." + ANSI_RESET);
            System.out.println(ANSI_CYAN + "----------------------------------------------------------");

        } catch (SQLException e) {

            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;

    }

    //BUSCA PARA INGRESO
    public boolean buscar(Usuario usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuario WHERE Usuario = ? and Contraseña =?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getNombre_usuario());
            ps.setString(2, usu.getContraseña_usuario());

            rs = ps.executeQuery();

            if (rs.next()) {

                return true;

            }

            return false;

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

    //VERIFICAR USUARIOS REPETIDOS
    public boolean UsuarioRepetido(Usuario usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM usuario WHERE Usuario = ?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, usu.getNombre_usuario());

            rs = ps.executeQuery();

            if (rs.next()) {

                return true;

            }

            return false;

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
