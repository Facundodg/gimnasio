package Controlador;

import Vista.Frm_Pantalla_Principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Crl_nutricionista implements ChangeListener, MouseListener {

    Frm_Pantalla_Principal frm_Pantalla_Principal;

    public Crl_nutricionista(Frm_Pantalla_Principal frm_Pantalla_Principal) {

        this.frm_Pantalla_Principal = frm_Pantalla_Principal;

        frm_Pantalla_Principal.jSlPeso.addChangeListener(this);
        frm_Pantalla_Principal.jSlAltura.addChangeListener(this);
        frm_Pantalla_Principal.jSlEdad.addChangeListener(this);
        frm_Pantalla_Principal.jSlCC.addChangeListener(this);

        frm_Pantalla_Principal.jrbhombreIMC.addMouseListener(this);
        frm_Pantalla_Principal.jrbmujerIMC.addMouseListener(this);
        frm_Pantalla_Principal.pnlCalcularIMC.addMouseListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        if (e.getSource() == frm_Pantalla_Principal.jSlPeso) {

            frm_Pantalla_Principal.txtPeso.setText(String.valueOf(frm_Pantalla_Principal.jSlPeso.getValue()) + " Kg");

        }
        if (e.getSource() == frm_Pantalla_Principal.jSlAltura) {

            double cant = Double.valueOf(frm_Pantalla_Principal.jSlAltura.getValue()) / 100;

            frm_Pantalla_Principal.txtAltura.setText(cant + " Mt");

        }
        if (e.getSource() == frm_Pantalla_Principal.jSlEdad) {

            frm_Pantalla_Principal.txtEdadCalculadora.setText(frm_Pantalla_Principal.jSlEdad.getValue() + " Años");

        }
        if (e.getSource() == frm_Pantalla_Principal.jSlCC) {

            frm_Pantalla_Principal.txtCC.setText(frm_Pantalla_Principal.jSlCC.getValue() + " Cm");

        }

    }

    @Override
    public void mouseClicked(MouseEvent t) {

        if (t.getSource() == frm_Pantalla_Principal.jrbhombreIMC) {

            frm_Pantalla_Principal.lbMasculinoColor.setForeground(Color.WHITE);
            frm_Pantalla_Principal.lbFemeninoColor.setForeground(Color.BLACK);

        }

        if (t.getSource() == frm_Pantalla_Principal.jrbmujerIMC) {

            frm_Pantalla_Principal.lbMasculinoColor.setForeground(Color.BLACK);
            frm_Pantalla_Principal.lbFemeninoColor.setForeground(Color.WHITE);

        }

        if (t.getSource() == frm_Pantalla_Principal.pnlCalcularIMC) {

            calcularIMC();
            calcularGC();
            calcularTMB();
            calcularMacroNutrientes();

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

    //-------------------METODOS BASICOS-------------------
    public void calcularIMC() {

        if (frm_Pantalla_Principal.jrbhombreIMC.isSelected()) {

            System.out.println("hombre");

            String peso = frm_Pantalla_Principal.txtPeso.getText();
            String altura = frm_Pantalla_Principal.txtAltura.getText();

            String p = peso.substring(0, 3);
            String al = altura.substring(0, 4);

            double pesoDouble = Double.parseDouble(p);
            double alturaDouble = Double.parseDouble(al);

            double IMC = pesoDouble / (alturaDouble * alturaDouble);

            IMC = Math.round(IMC * 10.0 / 10.0);

            if (IMC < 18.5) {

                String resultado = "El IMC: " + IMC + "(BAJO DE PESO)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.RED);

            } else if (IMC > 18.5 && IMC < 24.9) {

                String resultado = "El IMC: " + IMC + "(PESO NORMAL)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.GREEN);

            } else if (IMC > 25 && IMC < 29.9) {

                String resultado = "El IMC: " + IMC + "(EXCESO DE PESO)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.green);

            } else if (IMC > 30 && IMC < 34.9) {

                String resultado = "El IMC: " + IMC + "(OBESIDAD)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.blue);

            } else if (IMC > 35) {

                String resultado = "El IMC: " + IMC + "(OBESIDAD MORBIDA)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.CYAN);

            }

            String resultado = "El IMC: " + IMC;

            frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);

        } else if (frm_Pantalla_Principal.jrbmujerIMC.isSelected()) {

            System.out.println("mujer");

            String peso = frm_Pantalla_Principal.txtPeso.getText();
            String altura = frm_Pantalla_Principal.txtAltura.getText();

            String p = peso.substring(0, 3);
            String al = altura.substring(0, 4);

            double pesoDouble = Double.parseDouble(p);
            double alturaDouble = Double.parseDouble(al);

            double IMC = pesoDouble / (alturaDouble * alturaDouble);

            IMC = Math.round(IMC * 10.0 / 10.0);

            if (IMC < 18.5) {

                String resultado = "El IMC: " + IMC + "(BAJO DE PESO)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.RED);

            } else if (IMC > 18.6 && IMC < 24.9) {

                String resultado = "El IMC: " + IMC + "(PESO NORMAL)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.GREEN);

            } else if (IMC > 25 && IMC < 29.9) {

                String resultado = "El IMC: " + IMC + "(EXCESO DE PESO)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.green);

            } else if (IMC > 30 && IMC < 34.9) {

                String resultado = "El IMC: " + IMC + "(OBESIDAD)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.blue);

            } else if (IMC > 35) {

                String resultado = "El IMC: " + IMC + "(OBESIDAD MORBIDA)";

                frm_Pantalla_Principal.lbResultadoIMC.setText(resultado);
                frm_Pantalla_Principal.lbResultadoIMC.setForeground(Color.CYAN);

            }

        }

    }

    public void calcularGC() {

        if (frm_Pantalla_Principal.jrbhombreIMC.isSelected()) {

            System.out.println("hombre");

            String edad = frm_Pantalla_Principal.txtEdadCalculadora.getText();
            String CC = frm_Pantalla_Principal.txtCC.getText();

            String edadSubCadena = edad.substring(0, 3);
            String CCSubCadena = CC.substring(0, 3);

            System.out.println("edad: " + edadSubCadena);
            System.out.println("cc: " + CCSubCadena);

            double edadInt = Double.parseDouble(edadSubCadena);
            double CCDouble = Double.parseDouble(CCSubCadena);

            double GC = (0.567 * CCDouble) + (0.101 * edadInt) - 31.8;

            GC = Math.round(GC * 10.0 / 10.0);

            frm_Pantalla_Principal.lbResultadoGC.setText("GC: " + GC + "%");
            System.out.println(GC);

        } else if (frm_Pantalla_Principal.jrbmujerIMC.isSelected()) {

            System.out.println("mujer grasa");

            String edad = frm_Pantalla_Principal.txtEdadCalculadora.getText();
            String CC = frm_Pantalla_Principal.txtCC.getText();

            String edadSubCadena = edad.substring(0, 3);
            String CCSubCadena = CC.substring(0, 3);

            System.out.println("edad: " + edadSubCadena);
            System.out.println("cc: " + CCSubCadena);

            double edadInt = Double.parseDouble(edadSubCadena);
            double CCDouble = Double.parseDouble(CCSubCadena);

            double GC = (0.439 * CCDouble) + (0.221 * edadInt) - 9.4;

            GC = Math.round(GC * 10.0 / 10.0);

            frm_Pantalla_Principal.lbResultadoGC.setText("GC: " + GC + "%");
            System.out.println(GC);

        }

    }

    public void calcularTMB() {

        //hombre
        if (frm_Pantalla_Principal.jrbhombreIMC.isSelected()) {

            String altura = frm_Pantalla_Principal.txtAltura.getText();
            String alturaString = altura.substring(0, 3);
            System.out.println(alturaString);
            double alturaCM = Double.valueOf(alturaString) * 100;
            System.out.println("altura en cm: " + alturaCM);

            String pesoString = frm_Pantalla_Principal.txtPeso.getText();
            String pesoSubString = pesoString.substring(0, 3);
            double peso = Double.valueOf(pesoSubString);

            String edadString = frm_Pantalla_Principal.txtEdadCalculadora.getText();
            String edadSubString = edadString.substring(0, 2);
            System.out.println(edadSubString);
            double edad = Double.valueOf(edadSubString);

            double TMB = (10 * peso) + (6.25 * alturaCM) - (5 * edad) - 5;

            String intencidad = frm_Pantalla_Principal.jcbIntencidadEntrenamiento.getSelectedItem().toString();

            //intencidad
            if (intencidad.equals("Muy Ligero")) {

                double TMBtotal = TMB * 1.2;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Ligero")) {

                double TMBtotal = TMB * 1.375;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Moderado")) {

                double TMBtotal = TMB * 1.55;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Activo")) {

                double TMBtotal = TMB * 1.725;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Muy Activo")) {

                double TMBtotal = TMB * 1.9;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            }

        } else if (frm_Pantalla_Principal.jrbmujerIMC.isSelected()) {

            String altura = frm_Pantalla_Principal.txtAltura.getText();
            String alturaString = altura.substring(0, 3);
            System.out.println(alturaString);
            double alturaCM = Double.valueOf(alturaString) * 100;
            System.out.println("altura en cm: " + alturaCM);

            String pesoString = frm_Pantalla_Principal.txtPeso.getText();
            String pesoSubString = pesoString.substring(0, 3);
            double peso = Double.valueOf(pesoSubString);

            String edadString = frm_Pantalla_Principal.txtEdadCalculadora.getText();
            String edadSubString = edadString.substring(0, 2);
            System.out.println(edadSubString);
            double edad = Double.valueOf(edadSubString);

            double TMB = (10 * peso) + (6.25 * alturaCM) - (5 * edad) - 161;

            System.out.println("tmb: " + TMB);

            String intencidad = frm_Pantalla_Principal.jcbIntencidadEntrenamiento.getSelectedItem().toString();

            //intencidad
            if (intencidad.equals("Muy Ligero")) {

                double TMBtotal = TMB * 1.2;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Ligero")) {

                double TMBtotal = TMB * 1.375;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Moderado")) {

                double TMBtotal = TMB * 1.55;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Activo")) {

                double TMBtotal = TMB * 1.725;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            } else if (intencidad.equals("Muy Activo")) {

                double TMBtotal = TMB * 1.9;

                TMBtotal = Math.round(TMBtotal * 10.0 / 10.0);

                frm_Pantalla_Principal.lbResultadoTMB.setText("TMB: " + TMBtotal);

                String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

                if (objetivo.equals("Bajar Peso")) {

                    double objetivoTotal = TMBtotal - TMBtotal * 0.20;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para bajar de peso: " + objetivoTotal);

                } else if (objetivo.equals("Subir Peso")) {

                    double objetivoTotal = TMBtotal + TMBtotal * 0.25;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para subir de peso: " + objetivoTotal);

                } else if (objetivo.equals("Mantener Peso")) {

                    double objetivoTotal = TMBtotal;

                    objetivoTotal = Math.round(objetivoTotal * 10.0 / 10.0);

                    frm_Pantalla_Principal.lbResultadoTMBObjetivo.setText("TMB para mantener peso: " + objetivoTotal);

                }

            }

        }
    }

    public void calcularMacroNutrientes() {

        double gramosProteina = 0;
        double caloriasProteina = 0;
        double gramosGrasa = 0;
        double caloriasGrasa = 0;
        double caloriasTotalesDouble = 0;
        double caloriasCarboHidratos = 0;
        double gramosCarboHidratos = 0;

        String pesoString = frm_Pantalla_Principal.txtPeso.getText();
        String pesoSubString = pesoString.substring(0, 2);
        double peso = Double.valueOf(pesoSubString);

        String objetivo = frm_Pantalla_Principal.jcbObjetivo.getSelectedItem().toString();

        if (objetivo.equals("Bajar Peso")) {

            gramosProteina = 2.5 * peso;
            caloriasProteina = gramosProteina * 4;

            gramosGrasa = 1 * peso;
            caloriasGrasa = gramosGrasa * 9;

            String caloriasTotales = frm_Pantalla_Principal.lbResultadoTMBObjetivo.getText();
            String caloriasTotalesSubString = caloriasTotales.substring(23, 29);

            if (caloriasTotalesSubString.length() == 0) {

                JOptionPane.showMessageDialog(null, "Te esta faltando CALCULAR LAS CALORIAS PARA SACAR ESTE CALCULO");

            } else {

                caloriasTotalesDouble = Double.valueOf(caloriasTotalesSubString);

                caloriasCarboHidratos = caloriasTotalesDouble - (caloriasProteina + caloriasGrasa);

                gramosCarboHidratos = caloriasCarboHidratos / 4;

                frm_Pantalla_Principal.lbCaloriasProteina.setText("Calorias de Proteina: " + String.valueOf(caloriasProteina));
                frm_Pantalla_Principal.lbCaloriasGrasa.setText("Calorias de Grasas: " + String.valueOf(caloriasGrasa));
                frm_Pantalla_Principal.lbCaloriasCarbono.setText("Calorias de CarboHidratos: " + String.valueOf(caloriasCarboHidratos));

                frm_Pantalla_Principal.lbGramosProteina.setText("Gramos Proteina: " + String.valueOf(gramosProteina));
                frm_Pantalla_Principal.lbGramosGrasa.setText("Gramos Grasa: " + String.valueOf(gramosGrasa));
                frm_Pantalla_Principal.lbGramosCarbohidrato.setText("Gramos CarboHidrato: " + String.valueOf(gramosCarboHidratos));

            }

        } else if (objetivo.equals("Subir Peso")) {

            gramosProteina = 2.1 * peso;
            caloriasProteina = gramosProteina * 4;

            gramosGrasa = 1.5 * peso;
            caloriasGrasa = gramosGrasa * 9;

            String caloriasTotales = frm_Pantalla_Principal.lbResultadoTMBObjetivo.getText();
            String caloriasTotalesSubString = caloriasTotales.substring(23, 29);

            if (caloriasTotalesSubString.length() == 0) {

                JOptionPane.showMessageDialog(null, "Te esta faltando CALCULAR LAS CALORIAS PARA SACAR ESTE CALCULO");

            } else {

                caloriasTotalesDouble = Double.valueOf(caloriasTotalesSubString);

                caloriasCarboHidratos = caloriasTotalesDouble - (caloriasProteina + caloriasGrasa);

                gramosCarboHidratos = caloriasCarboHidratos / 4;

                frm_Pantalla_Principal.lbCaloriasProteina.setText("Calorias de Proteina: " + String.valueOf(caloriasProteina));
                frm_Pantalla_Principal.lbCaloriasGrasa.setText("Calorias de Grasas: " + String.valueOf(caloriasGrasa));
                frm_Pantalla_Principal.lbCaloriasCarbono.setText("Calorias de CarboHidratos: " + String.valueOf(caloriasCarboHidratos));

                frm_Pantalla_Principal.lbGramosProteina.setText("Gramos Proteina: " + String.valueOf(gramosProteina));
                frm_Pantalla_Principal.lbGramosGrasa.setText("Gramos Grasa: " + String.valueOf(gramosGrasa));
                frm_Pantalla_Principal.lbGramosCarbohidrato.setText("Gramos CarboHidrato: " + String.valueOf(gramosCarboHidratos));

            }

        } else if (objetivo.equals("Mantener Peso")) {

            gramosProteina = 2.0 * peso;
            caloriasProteina = gramosProteina * 4;

            gramosGrasa = 1.2 * peso;
            caloriasGrasa = gramosGrasa * 9;

            String caloriasTotales = frm_Pantalla_Principal.lbResultadoTMBObjetivo.getText();
            String caloriasTotalesSubString = caloriasTotales.substring(23, 29);

            if (caloriasTotalesSubString.length() == 0) {

                JOptionPane.showMessageDialog(null, "Te esta faltando CALCULAR LAS CALORIAS PARA SACAR ESTE CALCULO");

            } else {

                caloriasTotalesDouble = Double.valueOf(caloriasTotalesSubString);

                caloriasCarboHidratos = caloriasTotalesDouble - (caloriasProteina + caloriasGrasa);

                gramosCarboHidratos = caloriasCarboHidratos / 4;

                frm_Pantalla_Principal.lbCaloriasProteina.setText("Calorias de Proteina: " + String.valueOf(caloriasProteina));
                frm_Pantalla_Principal.lbCaloriasGrasa.setText("Calorias de Grasas: " + String.valueOf(caloriasGrasa));
                frm_Pantalla_Principal.lbCaloriasCarbono.setText("Calorias de CarboHidratos: " + String.valueOf(caloriasCarboHidratos));

                frm_Pantalla_Principal.lbGramosProteina.setText("Gramos Proteina: " + String.valueOf(gramosProteina));
                frm_Pantalla_Principal.lbGramosGrasa.setText("Gramos Grasa: " + String.valueOf(gramosGrasa));
                frm_Pantalla_Principal.lbGramosCarbohidrato.setText("Gramos CarboHidrato: " + String.valueOf(gramosCarboHidratos));

            }

        }

        int proteinaGramos = (int) Math.round(gramosProteina);
        int proteinaCalorias = (int) Math.round(caloriasProteina);
        
        int grasaGramos = (int) Math.round(gramosGrasa);
        int grasaCalorias = (int) Math.round(caloriasGrasa);
        
        int carbohidratosGramos = (int) Math.round(gramosCarboHidratos);
        int carbohidratosCalorias = (int) Math.round(caloriasCarboHidratos);
        
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Proteina Calorias", proteinaCalorias);
        datos.setValue("Grasa Calorias", grasaCalorias);
        datos.setValue("Carbohidrato Calorias", carbohidratosCalorias);
        
        JFreeChart grafica_circular = ChartFactory.createPieChart("Porcentaje De Calorias", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_circular);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(200,200));
        
        frm_Pantalla_Principal.jPGraficaPastel.setLayout(new BorderLayout());
        frm_Pantalla_Principal.jPGraficaPastel.add(panel,BorderLayout.NORTH);

    }

}
