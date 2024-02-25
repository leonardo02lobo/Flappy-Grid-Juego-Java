package Interfaces.Extra;

import Archivos.Variables;
import Interfaces.Ventana;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu_Salir extends JFrame {

    public Menu_Salir() {
        super.setSize(ancho, alto);
        super.setLocationRelativeTo(null);
        super.setTitle("Flappy Bird");
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setBackground(Color.white);
        super.getContentPane().add(panel);

        init();
    }

    private void init() {

        etiqueta.setText(informacion);
        etiqueta.setFont(new Font("calibri", 1, 25));
        etiqueta.setBounds(30, 20, 300, 30);
        panel.add(etiqueta);

        Generar(Aceptar, 50, 100, 100, 30, aceptar);
        Generar(Cancelar, 250, 100, 100, 30, cancelar);
    }

    private void Generar(JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setBounds(x, y, ancho, alto);
        panel.add(boton);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == Aceptar) {
                    conf = true;
                } else if (e.getSource() == Cancelar) {
                    dispose();
                    Ventana.tiempo.start();
                    conf = false;
                }
            }
        });
    }

    public static String informacion;
    public static String aceptar;
    public static String cancelar;
    private final int ancho = 400;
    private final int alto = 200;
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel();
    JButton Aceptar = new JButton();
    JButton Cancelar = new JButton();
    public static boolean conf = false;
    Variables variable = new Variables();
}
