package Interfaces.Principal;

import Interfaces.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import logic.*;

public class Opciones extends JFrame{

    
    public Opciones(){
        super.setSize(ancho, alto);
        super.setTitle(Principal.Titulo);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }
    
    private void init(){
        panel.setLayout(null);
        this.getContentPane().add(panel);

        CargarLabel(opciones,250,20,configuracion);
        CargarLabel(idioma,60,60,lenguaje);
        
        JButton ingles = new JButton("Ingles");
        ingles.setBounds(60,100,100,20);
        panel.add(ingles);
        ingles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana.url = "src/Archivos/Idi-ENG.txt";
                guardar.setEnabled(true);
            }
        });
        
        guardar.setText("Guardar y Salir");
        guardar.setEnabled(false);
        guardar.setBounds((ancho/2),400,100,30);
        panel.add(guardar);
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuPrincipal v = new MenuPrincipal();
                v.setVisible(true);
                dispose();
            }
        });
        
        panel.add(volver.botonVolver(this));

        ImageIcon pajarito = new ImageIcon("src/source/menu.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 700,461);
        etiqueta2.setIcon(new ImageIcon(pajarito.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
        
    }

    private void CargarLabel(JLabel label, int x,int y,String contenido){
        label.setText(contenido);
        label.setFont(new Font("calibri",1,30));
        label.setForeground(Color.white);
        label.setBounds(x,y,200,30);
        panel.add(label);
    }

    private final int ancho = 700;
    private final int alto = 500;
    public static String configuracion;
    public static String lenguaje;
    JPanel panel = new JPanel();
    JLabel opciones = new JLabel();
    JLabel idioma = new JLabel();
    Boton_Volver volver = new Boton_Volver();
    JButton guardar = new JButton();
}