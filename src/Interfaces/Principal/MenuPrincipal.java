package Interfaces.Principal;

import Interfaces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPrincipal extends JFrame{
    public JPanel panel;
    JButton boton1 = new JButton();
    JButton boton2 = new JButton();
    JButton boton3 = new JButton();

    public MenuPrincipal(){
    
        super.setSize(700, 500);
        super.setTitle("Flappy Bird");
        super.setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){
        colocarPaneles();
        Botones();
        Fondo();
    }   
    private void colocarPaneles(){
        
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void Botones(){

        boton1.setBounds(170,350,130,50);
        ImageIcon clickaqui =new ImageIcon("src/source/Start.png");
        boton1.setIcon(new ImageIcon(clickaqui.getImage().getScaledInstance(boton1.getWidth(),boton1.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton1);

        boton2.setBounds(410,350,130,50);
        ImageIcon clickaqui2 =new ImageIcon("src/source/Puntaje.png");
        boton2.setIcon(new ImageIcon(clickaqui2.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton2);

        boton3.setBounds(660,0,30,30);
        ImageIcon clickaqui3 =new ImageIcon("src/source/opciones-removebg-preview.png");
        boton3.setIcon(new ImageIcon(clickaqui3.getImage().getScaledInstance(boton3.getWidth(),boton3.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton3);
        AccionDeBotones1();
        AccionDeBotones2();
        AccionDeBotones3();
    }
    private void Fondo(){
        
        ImageIcon fondo = new ImageIcon("src/source/pajaro_con_fondo-removebg-preview.png");
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(576,120, 50,50);
        etiqueta.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(etiqueta.getWidth(),etiqueta.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta);
        
        ImageIcon pajarito = new ImageIcon("src/source/menu.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 700,461);
        etiqueta2.setIcon(new ImageIcon(pajarito.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void AccionDeBotones1(){
        boton1.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                VentanaJuego();
            }
        });
    }
    
    private void AccionDeBotones2(){
        boton2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Record record = new Record();
                record.setVisible(true);
                dispose();
            }
        });
    }

    private void AccionDeBotones3(){
        boton3.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                Opciones opc = new Opciones();
                opc.setVisible(true);
                dispose();
            }
        });
    }

    private void VentanaJuego(){
        JFrame miVentana = new JFrame();
        Ventana miPanel = new Ventana();
        miVentana.add(miPanel);
        miVentana.setSize(1200,700);
        miVentana.setTitle("Flappy Bird");
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
        dispose();
    }
}