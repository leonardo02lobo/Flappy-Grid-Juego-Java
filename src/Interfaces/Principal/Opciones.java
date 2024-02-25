package Interfaces.Principal;

import Archivos.Variables;
import Interfaces.Ventana;
import java.awt.*;
import java.awt.event.*;
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

        CargarLabel(opciones,250,20,configuracion);
        CargarLabel(idioma,60,60,lenguaje);
        
        JButton ingles = new JButton("Ingles");
        ingles.setBounds(60,100,100,20);
        panel.add(ingles);
        ingles.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana.url = "src/Archivos/Idi-ENG.txt";
            }
        });

        ImageIcon pajarito = new ImageIcon("src/source/menu.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 700,461);
        etiqueta2.setIcon(new ImageIcon(pajarito.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
        
        panel.add(volver.botonVolver());
        volver.botonVolver().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                MenuPrincipal principal = new MenuPrincipal();
                principal.setVisible(true);
                dispose();
            }
        });
        
        
    }

    private void CargarLabel(JLabel label, int x,int y,String contenido){
        label.setText(contenido);
        label.setFont(new Font("calibri",1,30));
        label.setForeground(Color.white);
        label.setBounds(x,y,200,30);
        panel.add(label);
    }

    public static String configuracion;
    public static String lenguaje;
    JPanel panel = new JPanel();
    JLabel opciones = new JLabel();
    JLabel idioma = new JLabel();
    Boton_Volver volver = new Boton_Volver();
    Variables variable = new Variables();
}