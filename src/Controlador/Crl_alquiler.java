package Controlador;

import Modelo.Alarma;
import Vista.Frm_Pantalla_Principal;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Crl_alquiler implements MouseListener {

    Frm_Pantalla_Principal frm_Pantalla_Principal;
    Alarma alarma;

    //variables de control de tiempo
    int segundos;
    int segundos2;
    int segundos3;
    int segundosGuardados;
    String tiempoRestante;
    String tiempoRestante2;
    String tiempoRestante3;

    public Crl_alquiler(Frm_Pantalla_Principal frm_Pantalla_Principal, Alarma alarma) {
        this.frm_Pantalla_Principal = frm_Pantalla_Principal;
        this.alarma = alarma;

        frm_Pantalla_Principal.lbIniciarAlquiler.addMouseListener(this);
    }

    void recibirDatos() {

        try {

            segundos = 0;

            if (!frm_Pantalla_Principal.txtHoraAlquiler.getText().equals("")) {
                segundos = (segundos + (3600 * Integer.parseInt(frm_Pantalla_Principal.txtHoraAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtMinutosAlquiler.getText().equals("")) {
                segundos = (segundos + (60 * Integer.parseInt(frm_Pantalla_Principal.txtMinutosAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtSegundosAlquiler.getText().equals("")) {
                segundos = (segundos + Integer.parseInt(frm_Pantalla_Principal.txtSegundosAlquiler.getText()));
            }

            segundosGuardados = segundos;
            //segundos2 = segundos;

            System.out.println("segundos guardados: " + segundosGuardados);

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "Solo se aceptan numeros !!!");
        }
    }

    void recibirDatos2() {

        try {

            segundos2 = 0;

            if (!frm_Pantalla_Principal.txtHoraAlquiler.getText().equals("")) {
                segundos2 = (segundos2 + (3600 * Integer.parseInt(frm_Pantalla_Principal.txtHoraAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtMinutosAlquiler.getText().equals("")) {
                segundos2 = (segundos2 + (60 * Integer.parseInt(frm_Pantalla_Principal.txtMinutosAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtSegundosAlquiler.getText().equals("")) {
                segundos2 = (segundos2 + Integer.parseInt(frm_Pantalla_Principal.txtSegundosAlquiler.getText()));
            }

            segundosGuardados = segundos2;

            System.out.println("segundos guardados: " + segundosGuardados);

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "Solo se aceptan numeros !!!");
        }
    }

    void recibirDatos3() {

        try {

            segundos3 = 0;

            if (!frm_Pantalla_Principal.txtHoraAlquiler.getText().equals("")) {
                segundos3 = (segundos3 + (3600 * Integer.parseInt(frm_Pantalla_Principal.txtHoraAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtMinutosAlquiler.getText().equals("")) {
                segundos3 = (segundos3 + (60 * Integer.parseInt(frm_Pantalla_Principal.txtMinutosAlquiler.getText())));
            }

            if (!frm_Pantalla_Principal.txtSegundosAlquiler.getText().equals("")) {
                segundos3 = (segundos3 + Integer.parseInt(frm_Pantalla_Principal.txtSegundosAlquiler.getText()));
            }

            segundosGuardados = segundos3;

            System.out.println("segundos guardados: " + segundosGuardados);

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "Solo se aceptan numeros !!!");
        }
    }

    String calcular_tiempo_restante3() {

        int seg, min, horas, dias;

        dias = (segundos3 >= 86400) ? (int) (segundos3 / 86400) : 0;
        horas = (segundos3 >= 3600) ? (int) ((segundos3 - (dias * 86400)) / 3600) : 0;
        min = (segundos3 >= 60) ? (int) ((segundos3 - (dias * 86400) - (horas * 3600)) / 60) : 0;
        seg = (int) (segundos3 - (min * 60) - (horas * 3600) - (dias * 86400));

        //return "    Quedan " + (dias) + " dias, " + (horas) + " horas, " + (min) + " minutos y " + (seg) + " segundos";
        return horas + ":" + min + ":" + seg;
    }

    String calcular_tiempo_restante2() {

        int seg, min, horas, dias;

        dias = (segundos2 >= 86400) ? (int) (segundos2 / 86400) : 0;
        horas = (segundos2 >= 3600) ? (int) ((segundos2 - (dias * 86400)) / 3600) : 0;
        min = (segundos2 >= 60) ? (int) ((segundos2 - (dias * 86400) - (horas * 3600)) / 60) : 0;
        seg = (int) (segundos2 - (min * 60) - (horas * 3600) - (dias * 86400));

        //return "    Quedan " + (dias) + " dias, " + (horas) + " horas, " + (min) + " minutos y " + (seg) + " segundos";
        return horas + ":" + min + ":" + seg;
    }

    String calcular_tiempo_restante() {

        int seg, min, horas, dias;

        dias = (segundos >= 86400) ? (int) (segundos / 86400) : 0;
        horas = (segundos >= 3600) ? (int) ((segundos - (dias * 86400)) / 3600) : 0;
        min = (segundos >= 60) ? (int) ((segundos - (dias * 86400) - (horas * 3600)) / 60) : 0;
        seg = (int) (segundos - (min * 60) - (horas * 3600) - (dias * 86400));

        //return "    Quedan " + (dias) + " dias, " + (horas) + " horas, " + (min) + " minutos y " + (seg) + " segundos";
        return horas + ":" + min + ":" + seg;
    }

    void actualizar_ventanaDeTiempo() {

        if (frm_Pantalla_Principal.jcbAlarma1.isSelected()) {

            frm_Pantalla_Principal.lbReloj1.revalidate();
            frm_Pantalla_Principal.lbReloj1.repaint();

        }

    }

    void actualizar_ventanaDeTiempo2() {

        if (frm_Pantalla_Principal.jcbAlarma2.isSelected()) {

            frm_Pantalla_Principal.lbReloj2.revalidate();
            frm_Pantalla_Principal.lbReloj2.repaint();

        }

    }

    void actualizar_ventanaDeTiempo3() {

        if (frm_Pantalla_Principal.jcbAlarma3.isSelected()) {

            frm_Pantalla_Principal.lbReloj3.revalidate();
            frm_Pantalla_Principal.lbReloj3.repaint();

        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if (e.getSource() == frm_Pantalla_Principal.lbIniciarAlquiler) {

            if (frm_Pantalla_Principal.jcbAlarma1.isSelected()) {

                recibirDatos();
                alarma = new Alarma();//crea la alarma

                Timer temporizador = new Timer();

                TimerTask tarea = new TimerTask() {

                    @Override
                    public void run() {

                        tiempoRestante = calcular_tiempo_restante();
                        //frm_Pantalla_Principal.lbReloj1.setText(tiempoRestante);

                        frm_Pantalla_Principal.lbReloj1.setText(tiempoRestante);

                        if (segundos >= 1800) {

                            frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.GREEN);
                            frm_Pantalla_Principal.jcbAlarma1.setBackground(Color.GREEN);

                        }

                        if (segundos <= 1800) {

                            frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.ORANGE);
                            frm_Pantalla_Principal.jcbAlarma1.setBackground(Color.ORANGE);

                        }

                        if (segundos <= 0) {//si se acabo el tiempo...

                            //cierra la ventana de tiempo restante y cancela el temporizador para ejecutar la alarma                        
                            //frm_Pantalla_Principal.dispose();
                            temporizador.cancel();
                            alarma.start();
                            frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.RED);
                            frm_Pantalla_Principal.jcbAlarma1.setBackground(Color.RED);

                            //poner ventana de advertencia con respecto a la ventana de Tiempo restante
                            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "SE ACABO EL TIEMPO");
                            frm_Pantalla_Principal.lbReloj1.setText("00:00:00");
                            alarma.PermitirReproduccion(false);
                            frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.GRAY);
                            frm_Pantalla_Principal.jcbAlarma1.setBackground(Color.GRAY);

                        }

                        actualizar_ventanaDeTiempo();

                        //frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.GREEN);
                        segundos--;

                    }
                };

                temporizador.schedule(tarea, 0, 1000);//repetir tarea cada segundo

            }

            if (frm_Pantalla_Principal.jcbAlarma2.isSelected()) {

                recibirDatos2();

                Alarma alarma2 = new Alarma(); //crea la alarma

                Timer temporizador2 = new Timer();

                TimerTask tarea2 = new TimerTask() {

                    @Override
                    public void run() {

                        tiempoRestante2 = calcular_tiempo_restante2();
                        //frm_Pantalla_Principal.lbReloj1.setText(tiempoRestante);

                        frm_Pantalla_Principal.lbReloj2.setText(tiempoRestante2);

                        if (segundos2 >= 1800) {

                            frm_Pantalla_Principal.pnlAlarma2.setBackground(Color.GREEN);
                            frm_Pantalla_Principal.jcbAlarma2.setBackground(Color.GREEN);
                            

                        }

                        if (segundos2 <= 1800) {

                            frm_Pantalla_Principal.pnlAlarma2.setBackground(Color.ORANGE);
                            frm_Pantalla_Principal.jcbAlarma2.setBackground(Color.ORANGE);

                        }

                        if (segundos2 <= 0) {//si se acabo el tiempo...

                            //cierra la ventana de tiempo restante y cancela el temporizador para ejecutar la alarma                        
                            //frm_Pantalla_Principal.dispose();
                            temporizador2.cancel();
                            alarma2.start();
                            frm_Pantalla_Principal.pnlAlarma2.setBackground(Color.RED);
                            frm_Pantalla_Principal.jcbAlarma2.setBackground(Color.RED);

                            //poner ventana de advertencia con respecto a la ventana de Tiempo restante
                            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "SE ACABO EL TIEMPO");
                            frm_Pantalla_Principal.lbReloj2.setText("00:00:00");
                            alarma2.PermitirReproduccion(false);
                            frm_Pantalla_Principal.pnlAlarma2.setBackground(Color.GRAY);
                            frm_Pantalla_Principal.jcbAlarma2.setBackground(Color.GRAY);

                        }

                        actualizar_ventanaDeTiempo2();

                        //frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.GREEN);
                        segundos2--;

                    }
                };

                temporizador2.schedule(tarea2, 0, 1000);//repetir tarea cada segundo

            }

            if (frm_Pantalla_Principal.jcbAlarma3.isSelected()) {

                recibirDatos3();

                Alarma alarma3 = new Alarma(); //crea la alarma

                Timer temporizador3 = new Timer();

                TimerTask tarea3 = new TimerTask() {

                    @Override
                    public void run() {

                        tiempoRestante3 = calcular_tiempo_restante3();
                        //frm_Pantalla_Principal.lbReloj1.setText(tiempoRestante);

                        frm_Pantalla_Principal.lbReloj3.setText(tiempoRestante3);

                        if (segundos3 >= 1800) {

                            frm_Pantalla_Principal.pnlAlarma3.setBackground(Color.GREEN);
                            frm_Pantalla_Principal.jcbAlarma3.setBackground(Color.GREEN);
                            

                        }

                        if (segundos3 <= 1800) {

                            frm_Pantalla_Principal.pnlAlarma3.setBackground(Color.ORANGE);
                            frm_Pantalla_Principal.jcbAlarma3.setBackground(Color.ORANGE);

                        }

                        if (segundos3 <= 0) {//si se acabo el tiempo...

                            //cierra la ventana de tiempo restante y cancela el temporizador para ejecutar la alarma                        
                            //frm_Pantalla_Principal.dispose();
                            temporizador3.cancel();
                            alarma3.start();
                            frm_Pantalla_Principal.pnlAlarma3.setBackground(Color.RED);
                            frm_Pantalla_Principal.jcbAlarma3.setBackground(Color.RED);

                            //poner ventana de advertencia con respecto a la ventana de Tiempo restante
                            JOptionPane.showMessageDialog(frm_Pantalla_Principal, "SE ACABO EL TIEMPO");
                            frm_Pantalla_Principal.lbReloj3.setText("00:00:00");
                            alarma3.PermitirReproduccion(false);
                            frm_Pantalla_Principal.pnlAlarma3.setBackground(Color.GRAY);
                            frm_Pantalla_Principal.jcbAlarma3.setBackground(Color.GRAY);

                        }

                        actualizar_ventanaDeTiempo3();

                        //frm_Pantalla_Principal.pnlAlarma1.setBackground(Color.GREEN);
                        segundos3--;

                    }
                };

                temporizador3.schedule(tarea3, 0, 1000);//repetir tarea cada segundo

            }

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

}
