package Interfaces.Principal;

import Interfaces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {

        super.setSize(700, 500);
        super.setTitle("Flappy Bird");
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);
        super.getContentPane().add(panel);
        init();
    }

    private void init() {
        Volver();
        Botones(boton1, 170, 350, 130, 50, "src/source/Start.png");
        Botones(boton2, 410, 350, 130, 50, "src/source/Puntaje.png");
        Botones(boton3, 630, 0, 60, 60, "src/source/opciones-removebg-preview.png");
        Fondo(etiqueta, 576, 120, 50, 50, "src/source/pajaro_con_fondo-removebg-preview.png");
        Fondo(etiqueta2, 0, 0, 700, 461, "src/source/menu.png");
    }

    private void Botones(JButton boton, int x, int y, int ancho, int alto, String url) {

        boton.setBounds(x, y, ancho, alto);
        ImageIcon clickaqui = new ImageIcon(url);
        boton.setIcon(new ImageIcon(clickaqui.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton);
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getSource() == boton1) {
                    VentanaJuego();
                } else if (e.getSource() == boton2) {
                    Record record = new Record();
                    record.setVisible(true);
                    dispose();
                } else if (e.getSource() == boton3) {
                    Opciones opc = new Opciones();
                    opc.setVisible(true);
                    dispose();
                }
            }
        });
    }

    private void Fondo(JLabel label, int x, int y, int ancho, int alto, String url) {

        ImageIcon fondo = new ImageIcon(url);
        label.setBounds(x, y, ancho, alto);
        label.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(label);
    }

    private void VentanaJuego() {

        miVentana.add(miPanel);
        miVentana.setSize(1200, 700);
        miVentana.setTitle("Flappy Bird");
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        dispose();
    }

    private void Volver() {
        Timer tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Ventana.band) {
                    setVisible(true);
                    miVentana.dispose();
                }
            }
        });
        tiempo.start();

    }

    JFrame miVentana = new JFrame();
    Ventana miPanel = new Ventana();
    public JPanel panel;
    JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    JButton boton3 = new JButton();
    JLabel etiqueta = new JLabel();
    JLabel etiqueta2 = new JLabel();
}
