package Modelo;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CrudPdf {

    /*Metodo listar*/
    public ArrayList<Pdf> Listar_PdfVO() {
        ArrayList<Pdf> list = new ArrayList<Pdf>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM rutina;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pdf vo = new Pdf();
                vo.setId(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setArchivopdf(rs.getBytes(3));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }

    /*Metodo agregar*/
    public void Agregar_PdfVO(Pdf vo) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO rutina (Nombre, Pdf) VALUES(?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConexion().prepareStatement(sql);
            
            ps.setString(1, vo.getNombrepdf());
            ps.setBytes(2, vo.getArchivopdf());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Modificar*/
    public void Modificar_PdfVO(Pdf vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE rutina SET nombrepdf = ?, archivopdf = ? WHERE Id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setBytes(2, vo.getArchivopdf());
            ps.setInt(3, vo.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    public void Modificar_PdfVO2(Pdf vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE rutina SET nombrepdf = ? WHERE Id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_PdfVO(Pdf vo) {
        Conexion conec = new Conexion();
        String sql = "DELETE FROM rutina WHERE Id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConexion().prepareStatement(sql);
            ps.setInt(1, vo.getId());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    //Permite mostrar PDF contenido en la base de datos
    public void ejecutar_archivoPDF(int id) {

        Conexion cn = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        byte[] b = null;

        try {
            ps = cn.getConexion().prepareStatement("SELECT Pdf FROM rutina WHERE Id = ?;");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getBytes(1);
            }
            InputStream bos = new ByteArrayInputStream(b);

            int tamanoInput = bos.available();
            byte[] datosPDF = new byte[tamanoInput];
            bos.read(datosPDF, 0, tamanoInput);

            OutputStream out = new FileOutputStream("new.pdf");
            out.write(datosPDF);

            //abrir archivo
            out.close();
            bos.close();
            ps.close();
            rs.close();
            cn.desconectar();

        } catch (IOException | NumberFormatException | SQLException ex) {
            System.out.println("Error al abrir archivo PDF " + ex.getMessage());
        }
    }

}
