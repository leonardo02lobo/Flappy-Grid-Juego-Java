package Interfaces.Extra;

import Interfaces.Ventana;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu_Salir extends JFrame {

    public Menu_Salir() {
        super.setSize(ancho, alto);
        super.setLocationRelativeTo(null);
        super.setTitle("Salir del Juego");
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setBackground(Color.white);
        super.getContentPane().add(panel);

        init();
    }

    private void init() {

        etiqueta.setText("¿Desea salir del Juego?");
        etiqueta.setFont(new Font("calibri", 1, 30));
        etiqueta.setBounds(80, 20, 250, 30);
        panel.add(etiqueta);

        Generar(Aceptar, 50, 100, 100, 30, "Aceptar");
        Generar(Cancelar, 250, 100, 100, 30, "Cancelar");
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

    private final int ancho = 400;
    private final int alto = 200;
    JPanel panel = new JPanel();
    JLabel etiqueta = new JLabel();
    JButton Aceptar = new JButton();
    JButton Cancelar = new JButton();
    public static boolean conf = false;
}
