package Controlador;

import Modelo.Configuraciones;
import Modelo.Crud_configuraciones;
import Vista.Frm_Ingreso;
import Vista.Frm_Pantalla_Principal;
import Vista.Frm_registro;
import Vista.Frm_usuario_info;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Crl_configuraciones implements MouseListener {

    Frm_Pantalla_Principal frm_Pantalla_Principal;
    Frm_usuario_info frm_usuario_info;
    Frm_registro frm_registro;
    Frm_Ingreso frm_ingreso;
    Configuraciones configuraciones;
    Crud_configuraciones mod_crud_configuraciones;

    boolean sonido = false;

    public Crl_configuraciones(Frm_Pantalla_Principal frm_Pantalla_Principal, Frm_usuario_info frm_usuario_info, Frm_registro frm_registro, Frm_Ingreso frm_ingreso, Configuraciones configuraciones, Crud_configuraciones mod_crud_configuraciones) {

        this.frm_Pantalla_Principal = frm_Pantalla_Principal;
        this.frm_usuario_info = frm_usuario_info;
        this.frm_registro = frm_registro;
        this.frm_ingreso = frm_ingreso;
        this.configuraciones = configuraciones;
        this.mod_crud_configuraciones = mod_crud_configuraciones;

        frm_usuario_info.jrbModoNocturno.addMouseListener(this);
        frm_usuario_info.jrbSonido.addMouseListener(this);
        frm_Pantalla_Principal.btnGuardaCliente_IC.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (e.getSource() == frm_usuario_info.jrbModoNocturno) {

            if (frm_usuario_info.jrbModoNocturno.isSelected() == true) {

                System.out.println("entro LUNA");
                ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/Luna_modoNocturno.png")); //pones la ruta de la imagen
                Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(32, 30, Image.SCALE_DEFAULT));
                frm_usuario_info.jrbModoNocturno.setIcon(fondo1);

                frm_Pantalla_Principal.panel_salir_sistema.setBackground(Color.GRAY);
                frm_Pantalla_Principal.jPanel2.setBackground(Color.GRAY);
                frm_Pantalla_Principal.jPanel1.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBTienda.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBCliente.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBRutina.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBUsuario.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBDieta.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBAtencionAlCliente.setBackground(Color.GRAY);
                frm_Pantalla_Principal.TBTienda.setForeground(Color.WHITE);
                frm_Pantalla_Principal.TBCliente.setForeground(Color.WHITE);
                frm_Pantalla_Principal.TBRutina.setForeground(Color.WHITE);
                frm_Pantalla_Principal.TBUsuario.setForeground(Color.WHITE);
                frm_Pantalla_Principal.TBDieta.setForeground(Color.WHITE);
                frm_Pantalla_Principal.TBAtencionAlCliente.setForeground(Color.WHITE);
                frm_Pantalla_Principal.lbSalirSistema.setForeground(Color.WHITE);
                frm_Pantalla_Principal.lbMinimizarVentana.setForeground(Color.WHITE);

                frm_ingreso.jpIngresoUsuario.setBackground(Color.GRAY);
                frm_ingreso.txtUsuario.setBackground(Color.GRAY);
                frm_ingreso.txtContraseña.setBackground(Color.GRAY);
                frm_ingreso.lbUsuario.setForeground(Color.WHITE);
                frm_ingreso.lbContraseña.setForeground(Color.WHITE);
                frm_ingreso.jsUsuario.setBackground(Color.WHITE);
                frm_ingreso.jsContraseña.setBackground(Color.WHITE);
                frm_ingreso.lbSalirSistemaIngreso.setForeground(Color.WHITE);
                frm_ingreso.lbMinimizarVentana.setForeground(Color.WHITE);

                frm_registro.jpRegistro.setBackground(Color.GRAY);
                frm_registro.lbSalirSistemaRegistro.setForeground(Color.WHITE);
                frm_registro.lbMinimizarRegistro.setForeground(Color.WHITE);
                frm_registro.lbNombreUsuario.setForeground(Color.WHITE);
                frm_registro.lbContraseña.setForeground(Color.WHITE);
                frm_registro.lbConfirmarContraseña.setForeground(Color.WHITE);
                frm_registro.lbContraseñaPuesto.setForeground(Color.WHITE);
                frm_registro.lbPuesto.setForeground(Color.WHITE);

            } else {

                System.out.println("entro SOL");
                ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/Sol_modoNocturno.png")); //pones la ruta de la imagen
                Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
                frm_usuario_info.jrbModoNocturno.setIcon(fondo1);

                frm_Pantalla_Principal.panel_salir_sistema.setBackground(Color.blue);
                frm_Pantalla_Principal.jPanel2.setBackground(Color.blue);
                frm_Pantalla_Principal.jPanel1.setBackground(Color.blue);
                frm_Pantalla_Principal.TBTienda.setBackground(Color.blue);
                frm_Pantalla_Principal.TBCliente.setBackground(Color.blue);
                frm_Pantalla_Principal.TBRutina.setBackground(Color.blue);
                frm_Pantalla_Principal.TBUsuario.setBackground(Color.blue);
                frm_Pantalla_Principal.TBDieta.setBackground(Color.blue);
                frm_Pantalla_Principal.TBAtencionAlCliente.setBackground(Color.blue);
                frm_Pantalla_Principal.TBTienda.setForeground(Color.BLACK);
                frm_Pantalla_Principal.TBCliente.setForeground(Color.BLACK);
                frm_Pantalla_Principal.TBRutina.setForeground(Color.BLACK);
                frm_Pantalla_Principal.TBUsuario.setForeground(Color.BLACK);
                frm_Pantalla_Principal.TBDieta.setForeground(Color.BLACK);
                frm_Pantalla_Principal.TBAtencionAlCliente.setForeground(Color.BLACK);
                frm_Pantalla_Principal.lbSalirSistema.setForeground(Color.BLACK);
                frm_Pantalla_Principal.lbMinimizarVentana.setForeground(Color.BLACK);

                frm_ingreso.jpIngresoUsuario.setBackground(Color.blue);
                frm_ingreso.txtUsuario.setBackground(Color.blue);
                frm_ingreso.txtContraseña.setBackground(Color.blue);
                frm_ingreso.lbUsuario.setForeground(Color.BLACK);
                frm_ingreso.lbContraseña.setForeground(Color.BLACK);
                frm_ingreso.jsUsuario.setBackground(Color.BLACK);
                frm_ingreso.jsContraseña.setBackground(Color.BLACK);
                frm_ingreso.lbSalirSistemaIngreso.setForeground(Color.BLACK);
                frm_ingreso.lbMinimizarVentana.setForeground(Color.BLACK);

                frm_registro.jpRegistro.setBackground(Color.blue);
                frm_registro.lbSalirSistemaRegistro.setForeground(Color.BLACK);
                frm_registro.lbMinimizarRegistro.setForeground(Color.BLACK);
                frm_registro.lbNombreUsuario.setForeground(Color.BLACK);
                frm_registro.lbContraseña.setForeground(Color.BLACK);
                frm_registro.lbConfirmarContraseña.setForeground(Color.BLACK);
                frm_registro.lbContraseñaPuesto.setForeground(Color.BLACK);
                frm_registro.lbPuesto.setForeground(Color.BLACK);

            }

        }

        if (e.getSource() == frm_usuario_info.jrbSonido) {

            if (frm_usuario_info.jrbSonido.isSelected() == true) {

                ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/sonido.png")); //pones la ruta de la imagen
                Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
                frm_usuario_info.jrbSonido.setIcon(fondo1);

                System.out.println("sonido activado");
                sonido = true;
                
                sonido();

            } else {

                ImageIcon imagen1 = new ImageIcon(getClass().getResource("/img/mute.png")); //pones la ruta de la imagen
                Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
                frm_usuario_info.jrbSonido.setIcon(fondo1);

                System.out.println("sonido desactivado");
                sonido = false;

            }

        }

        if (e.getSource() == frm_Pantalla_Principal.btnGuardaCliente_IC) {

            if (sonido == true) {

                sonido();

            } else {

                System.out.println("sonido esta apagado");

            }

        }

    }

    //METODO DE SONIDOS DE LOS BOTONES COMUNES.
    public void sonido() {

        try {

            new JFXPanel();

            String pon = new File("song.mp3").toURI().toString();

            new MediaPlayer(new Media(pon)).play();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
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

}
