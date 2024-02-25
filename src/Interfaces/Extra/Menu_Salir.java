package Interfaces.Extra;

import Interfaces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import logic.*;

public class Menu_Salir extends JFrame {

    public Menu_Salir() {
        super.setSize(ancho, alto);
        super.setLocationRelativeTo(null);
        super.setTitle(Principal.Titulo);
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
        etiqueta.setBounds(30, 20, 350, 30);
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
                }
            }
        });
    }

    public static String informacion;
    public static String aceptar;
    public static String cancelar;
    private final int ancho = 400;
    private final int alto = 200;
    private final JPanel panel = new JPanel();
    private final JLabel etiqueta = new JLabel();
    private final JButton Aceptar = new JButton();
    private final JButton Cancelar = new JButton();
    public static boolean conf = false;
}
