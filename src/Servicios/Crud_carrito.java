package Servicios;

import Modelo.Carrito;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud_carrito extends Conexion {

    // GUARDAR
    public boolean guardar(Carrito car) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO ventas (Codigo,Nombre,Cantidad,Venta,Total) VALUES (?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, car.getCodigo());
            ps.setString(2, car.getNombre());
            ps.setInt(3, car.getCantidad());
            ps.setDouble(4, car.getVenta());
            ps.setDouble(5, car.getTotal());

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
    public boolean modificar(Carrito car) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE ventas SET Codigo=?,Nombre=?,Cantidad=?,Venta=?,Total=? WHERE Id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setString(1, car.getCodigo());
            ps.setString(2, car.getNombre());
            ps.setInt(3, car.getCantidad());
            ps.setDouble(4, car.getVenta());
            ps.setDouble(5, car.getTotal());

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
    public boolean eliminar(Carrito car) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM ventas WHERE Id=?";

        try {

            ps = con.prepareStatement(sql);

            ps.setInt(1, car.getId());

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

    //RESTAR CANTIDAD
    public boolean restarCantidad(int cantidad, String codigo) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        //UPDATE producto SET Cantidad = Cantidad - 5 where Id = 0001;
        String sql = "UPDATE producto SET Cantidad = Cantidad - " + cantidad + " where Codigo = " + codigo + "";

        try {

            ps = con.prepareStatement(sql);
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
