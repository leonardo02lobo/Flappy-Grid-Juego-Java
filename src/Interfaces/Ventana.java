package Interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends Panel {
    int aux = 0;

    public Ventana() {
        Timer tiempo = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
            }
        });
        tiempo.start();
    }

    @Override
    public void init() {
        Pajaro();
        Fondo();
    }
    
    private void Fondo(){
        Image fondo = new ImageIcon(getClass().getResource("../source/fondo.png")).getImage();
        Fondo.setIcon(new ImageIcon(fondo.getScaledInstance(Panel.ancho, Panel.alto, Image.SCALE_SMOOTH)));
        Fondo.setBounds(0,0,Panel.ancho,Panel.alto);
        add(Fondo);
        
        
    }

    private void Pajaro(){
        
        Image[] imagenes = {
            new ImageIcon(getClass().getResource("../source/pajaro_con_fondo-removebg-preview.png")).getImage(),
            new ImageIcon(getClass().getResource("../source/pngwing.com.png")).getImage()};
        aux++;
        if (aux % 2 == 0) {
            pajaro.setIcon(new ImageIcon(imagenes[0].getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        } else {
            pajaro.setIcon(new ImageIcon(imagenes[1].getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        }
        pajaro.setBounds(40, 20, 100, 100);
        add(pajaro);
    }
    JLabel pajaro = new JLabel();
    JLabel Fondo = new JLabel();
}
