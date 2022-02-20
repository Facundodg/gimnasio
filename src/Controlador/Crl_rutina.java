package Controlador;

import Modelo.Conexion;
import Modelo.Crud_Pdf;
import Modelo.Pdf;
import Modelo.Tabla_Pdf;
import Vista.Frm_Pantalla_Principal;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Crl_rutina implements MouseListener, ActionListener, KeyListener {

    Frm_Pantalla_Principal frm_pantalla_principal;
    Crud_Pdf crudPdf;
    Pdf modelo_pdf;
    Tabla_Pdf tabla_pdf;
    int id = -1;
    String ruta_archivo = "";

    public Crl_rutina(Frm_Pantalla_Principal frm_pantalla_principal, Crud_Pdf crudPdf, Pdf modelo_pdf, Tabla_Pdf tabla_pdf) {
        this.frm_pantalla_principal = frm_pantalla_principal;
        this.crudPdf = crudPdf;
        this.modelo_pdf = modelo_pdf;
        this.tabla_pdf = tabla_pdf;

        tabla_pdf.visualizar_PdfVO(frm_pantalla_principal.tlbRutinas);

        frm_pantalla_principal.lbguardarRutina.addMouseListener(this);
        frm_pantalla_principal.btnseleccionar.addActionListener(this);
        frm_pantalla_principal.tlbRutinas.addMouseListener(this);
        frm_pantalla_principal.lbEliminarRutina.addMouseListener(this);
        frm_pantalla_principal.lbModificarRutina.addMouseListener(this);
        frm_pantalla_principal.TxtNombreRutina.addKeyListener(this);
        frm_pantalla_principal.txtBuscarRutina.addKeyListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_pantalla_principal.lbguardarRutina) {

            String nombre = frm_pantalla_principal.TxtNombreRutina.getText();
            File ruta = new File(ruta_archivo);

            if (nombre.trim().length() != 0 && ruta_archivo.trim().length() != 0) {
                guardar_pdf(nombre, ruta);
                tabla_pdf.visualizar_PdfVO(frm_pantalla_principal.tlbRutinas);
                ruta_archivo = "";

            } else {
                JOptionPane.showMessageDialog(null, "Rellenar todo los campos");
            }

        }

        if (e.getSource() == frm_pantalla_principal.lbEliminarRutina) {

            eliminar_pdf(Integer.parseInt(frm_pantalla_principal.lbIdRutina.getText()));
            tabla_pdf.visualizar_PdfVO(frm_pantalla_principal.tlbRutinas);
            ruta_archivo = "";

        }

        if (e.getSource() == frm_pantalla_principal.lbModificarRutina) {

            String nombre = frm_pantalla_principal.TxtNombreRutina.getText();
            File ruta = new File(ruta_archivo);

            if (nombre.trim().length() != 0 && ruta_archivo.trim().length() != 0) {

                modificar_pdf(Integer.parseInt(frm_pantalla_principal.lbIdRutina.getText()), nombre, ruta);
                tabla_pdf.visualizar_PdfVO(frm_pantalla_principal.tlbRutinas);

            } else if (ruta_archivo.trim().length() == 0) {

                modificar_pdf(Integer.parseInt(frm_pantalla_principal.lbIdRutina.getText()), nombre, ruta);
                tabla_pdf.visualizar_PdfVO(frm_pantalla_principal.tlbRutinas);

            }
            ruta_archivo = "";

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    //---------------METODOS BASICOS---------------------
    public void seleccionar_pdf() {

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fi = new FileNameExtensionFilter("pdf", "pdf");
        j.setFileFilter(fi);
        int se = j.showOpenDialog(frm_pantalla_principal);
        if (se == 0) {
            this.frm_pantalla_principal.btnseleccionar.setText("" + j.getSelectedFile().getName());
            ruta_archivo = j.getSelectedFile().getAbsolutePath();

        } else {
        }
    }

    public void guardar_pdf(String nombre, File ruta) {

        Crud_Pdf pa = new Crud_Pdf();
        Pdf po = new Pdf();
        po.setNombrepdf(nombre);
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            po.setArchivopdf(pdf);
        } catch (IOException ex) {
            po.setArchivopdf(null);
            System.out.println("Error al agregar archivo pdf " + ex.getMessage());
        }
        pa.Agregar_PdfVO(po);
    }

    public void eliminar_pdf(int id) {

        Crud_Pdf pa = new Crud_Pdf();
        Pdf po = new Pdf();
        po.setId(id);
        pa.Eliminar_PdfVO(po);

    }

    public void modificar_pdf(int codigo, String nombre, File ruta) {

        Crud_Pdf pa = new Crud_Pdf();
        Pdf po = new Pdf();
        po.setId(codigo);
        po.setNombrepdf(nombre);
        try {
            byte[] pdf = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(pdf);
            po.setArchivopdf(pdf);
        } catch (IOException ex) {
            po.setArchivopdf(null);
            System.out.println("Error al agregar archivo pdf " + ex.getMessage());
        }
        pa.Modificar_PdfVO(po);
    }

    public void FiltrarDatosNombre(String valor) {

        System.out.println("entrando");
        String[] titulos = {"Id", "Nombre", "Pdf"};
        String[] registros = new String[3];

        PreparedStatement ps = null;
        Conexion conn = new Conexion();
        Connection con = conn.getConexion();

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String sql = "select * from rutina where Nombre like '%" + valor + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Pdf vo = new Pdf();

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Pdf");

                modelo.addRow(registros);

            }

            frm_pantalla_principal.tlbRutinas.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm_pantalla_principal.btnseleccionar) {

            System.out.println("entre");
            seleccionar_pdf();

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

        FiltrarDatosNombre(frm_pantalla_principal.txtBuscarRutina.getText());

    }

}
