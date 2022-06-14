/*
 * Programa Temporizador con musica mp3
 * Este este codigo programa dos Frames (ventanas), 
 * Donde la primera se encarga de recibir los datos (Horas, Minutos y Segundos) 
 * en sus correspondientes campos de Texto
 * Y la segunda se encarga de actualizar y mostrar el tiempo restante mientras
 * el temporizador esta en movimiento
 * 
 */
package Temporizador;

import Alarma.Alarma;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Jesus Hernandez
 */
public class Temporizador extends JFrame implements ActionListener {

    //variables de control de tiempo
    int segundos;    
    String tiempoRestante;

    //variables de la ventana principal
    JLabel txt_horas;
    JLabel txt_minutos;
    JLabel txt_segundos;
    JTextField campoDeTexto_horas;
    JTextField campoDeTexto_minutos;
    JTextField campoDeTexto_segundos;
    JButton botonAceptar;

    //variables de la ventana de tiempo
    JFrame mostrarTiempoRestante;//ventana de tiempo
    JLabel mensaje_de_tiempo;

    //control de alarma
    Alarma alarma;

    //sirve para poner la ventana de tiempo en la esquina superior derecha de la pantalla
    int anchoDePantalla = Toolkit.getDefaultToolkit().getScreenSize().width;

    public Temporizador() {
        crear_ventanaPrincipal();
    }

    private void crear_ventanaPrincipal() {

        setTitle("Ajustar Temporizador");
        setSize(275, 200);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txt_horas = new JLabel("HORAS:");
        txt_horas.setBounds(35, 20, 60, 30);
        txt_minutos = new JLabel("MINUTOS:");
        txt_minutos.setBounds(35, 50, 60, 30);
        txt_segundos = new JLabel("SEGUNDOS:");
        txt_segundos.setBounds(35, 80, 90, 30);

        campoDeTexto_horas = new JTextField();
        campoDeTexto_horas.setBounds(115, 20, 100, 30);

        campoDeTexto_minutos = new JTextField();
        campoDeTexto_minutos.setBounds(115, 50, 100, 30);

        campoDeTexto_segundos = new JTextField();
        campoDeTexto_segundos.setBounds(115, 80, 100, 30);

        botonAceptar = new JButton();
        botonAceptar.setText("ACEPTAR");
        botonAceptar.setBounds(75, 125, 100, 27);
        botonAceptar.addActionListener(this);

        add(txt_horas);
        add(txt_minutos);
        add(txt_segundos);
        add(campoDeTexto_horas);
        add(campoDeTexto_minutos);
        add(campoDeTexto_segundos);
        add(botonAceptar);
    }

    JFrame crear_ventanaDeTiempo() {

        JFrame ventana_tiempo = new JFrame("TIEMPO RESTANTE");

        ventana_tiempo.setSize(400, 60);
        ventana_tiempo.setResizable(false);
        ventana_tiempo.setAlwaysOnTop(true);
        ventana_tiempo.setLocation((anchoDePantalla - ventana_tiempo.getWidth()), 0);
        ventana_tiempo.setDefaultCloseOperation(EXIT_ON_CLOSE);

        mensaje_de_tiempo = new JLabel();
        mensaje_de_tiempo.setBounds(0, 5, 100, 50);

        ventana_tiempo.add(mensaje_de_tiempo);
        return ventana_tiempo;
    }
    
    @Override//accion ejecutada por el botonAceptar
    public void actionPerformed(ActionEvent evento) {
        //si el evento activado es del boton Aceptar
        if (evento.getSource() == botonAceptar) {
            
            recibirDatos();
            this.dispose();//cierra la ventana principal
            
            alarma = new Alarma();//crea la alarma
            
            //creando la ventana de tiempo restante
            mostrarTiempoRestante = crear_ventanaDeTiempo();
            mostrarTiempoRestante.setVisible(true);

            //crea y ajusta el temporizador con la tarea a ejecutar
            Timer temporizador = new Timer();
            TimerTask tarea = new TimerTask() {

                @Override
                public void run() {

                    tiempoRestante = calcular_tiempo_restante();
                    mensaje_de_tiempo.setText(tiempoRestante);
                    actualizar_ventanaDeTiempo();

                    if (segundos == 0) {//si se acabo el tiempo...

                        //cierra la ventana de tiempo restante y cancela el temporizador para ejecutar la alarma                        
                        mostrarTiempoRestante.dispose();
                        temporizador.cancel();
                        alarma.start();

                        //poner ventana de advertencia con respecto a la ventana de Tiempo restante
                        JOptionPane.showMessageDialog(mostrarTiempoRestante, "SE ACABO EL TIEMPO");

                        //Opcion de repeticion
                        byte opcion = (byte) JOptionPane.showOptionDialog(null, "REPETIR?",
                                "TEMPORIZADOR", 0, 3, null, new String[]{"SI", "NO"}, 0);

                        if (opcion == 0) {//reinicia el programa

                            alarma.PermitirReproduccion(false);
                            setVisible(true);//mostrar ventana principal

                        } else {//terminar el programa

                            alarma.PermitirReproduccion(false);
                            System.exit(0);//salir

                        }

                    }
                    segundos--;

                }
            };
            temporizador.schedule(tarea, 0, 1000);//repetir tarea cada segundo

        }
    }

    /**
     * recibe los datos de los campos de texto para Horas, minutos y segundos,
     * y transforma el tiempo en segundos
     */
    void recibirDatos() {
        
        try {
            
            segundos = 0;

            if (!campoDeTexto_horas.getText().equals("")) {
                segundos = ( segundos + (3600 * Integer.parseInt(campoDeTexto_horas.getText())) );
            }

            if (!campoDeTexto_minutos.getText().equals("")) {
                segundos = ( segundos + (60 * Integer.parseInt(campoDeTexto_minutos.getText())) );
            }

            if (!campoDeTexto_segundos.getText().equals("")) {
                segundos = ( segundos + Integer.parseInt(campoDeTexto_segundos.getText()) );
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(this, "Solo se aceptan numeros !!!");
            System.exit(0);
        }
    }

    /**
     * calcula el tiempo restante a partir de los segundos
     * @return 
     */
    String calcular_tiempo_restante() {
        
        int seg, min, horas, dias;
        
        dias = (segundos >= 86400) ? (int) (segundos / 86400) : 0;
        horas = (segundos >= 3600) ? (int) ((segundos - (dias * 86400)) / 3600) : 0;
        min = (segundos >= 60) ? (int) ((segundos - (dias * 86400) - (horas * 3600)) / 60) : 0;
        seg = (int) (segundos - (min * 60) - (horas * 3600) - (dias * 86400));
        
        return "    Quedan " + (dias) + " dias, " + (horas) + " horas, " + (min) + " minutos y " + (seg) + " segundos";
    }

    
    /**
     * revalida y actualiza la ventana de tiempo restante
     */
    void actualizar_ventanaDeTiempo() {
        
        mostrarTiempoRestante.revalidate();
        mostrarTiempoRestante.repaint();
    }
    
    /**
     * ejecuta el programa Temporizador
     * @param args 
     */
    public static void main(String[] args) {

        new Temporizador().setVisible(true);
    }

}
