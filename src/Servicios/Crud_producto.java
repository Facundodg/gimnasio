package Servicios;

import Modelo.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_producto extends Conexion {

    // GUARDAR
    public boolean guardar(Producto pro) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO producto (Codigo,Nombre,Costo,Venta,Cantidad,Fecha) VALUES (?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, pro.getCodigo_producto());
            ps.setString(2, pro.getNombre_producto());
            ps.setDouble(3, pro.getCosto_producto());
            ps.setDouble(4, pro.getVenta_producto());
            ps.setInt(5, pro.getCantidad_producto());
            ps.setDate(6, pro.getFecha_producto());

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

    // MODIFICAR
    public boolean modificar(Producto pro) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE producto SET Codigo=?,Nombre=?,Costo=?,Venta=?,Cantidad=?,Fecha=? WHERE Id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, pro.getCodigo_producto());
            ps.setString(2, pro.getNombre_producto());
            ps.setDouble(3, pro.getCosto_producto());
            ps.setDouble(4, pro.getVenta_producto());
            ps.setInt(5, pro.getCantidad_producto());
            ps.setDate(6, pro.getFecha_producto());
            ps.setInt(7, pro.getId_producto());

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
    public boolean eliminar(Producto pro) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM producto WHERE Id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, pro.getId_producto());

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
