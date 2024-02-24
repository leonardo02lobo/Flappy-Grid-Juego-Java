package Interfaces.Principal;

import java.awt.*;
import javax.swing.*;

public class Opciones extends JFrame{

    
    public Opciones(){
        super.setSize(700, 500);
        super.setTitle("Flappy Bird");
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }
    
    private void init(){

        panel.setLayout(null);
        this.getContentPane().add(panel);

        CargarLabel(opciones,250,20,"Configuracion");
        CargarLabel(idioma,60,60,"Idioma");

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

    JPanel panel = new JPanel();
    JLabel opciones = new JLabel();
    JLabel idioma = new JLabel();
}