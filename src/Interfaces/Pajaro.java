package Interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pajaro {

    public JLabel Pajaro() {
        aux++;
        if (aux % 2 == 0) {
            pajaro.setIcon(new ImageIcon(imagenes[0].getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        } else {
            pajaro.setIcon(new ImageIcon(imagenes[1].getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        }
        pajaro.setBounds(x, y, ancho, alto);
        return pajaro;
    }

    public void MovimientosPajaro(KeyEvent e) {
        if (e.getKeyCode() == 32) {
            y -= movimiento;
        }
    }
    public void ColisionParajo(){
//        if((y >= 580 || y <= 0) || (Obstaculo.x == x+60)){
//            pajaro.setIcon(new ImageIcon(imagenes[2].getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
//            Ventana.tiempo.stop();
//        }
    }
    
    public void PuntajePajaro(){
        if(x == Obstaculo.x){
            Puntaje.aux += 100;
        }
    }

    private int aux = 0;
    public static final int x = 80;
    public static int y = 200;
    public static final int movimiento = 20;
    private final int ancho = 100;
    private final int alto = 100;
    JLabel pajaro = new JLabel();
    Image[] imagenes = {
            new ImageIcon(getClass().getResource("../source/pajaro_con_fondo-removebg-preview.png")).getImage(),
            new ImageIcon(getClass().getResource("../source/pngwing.com.png")).getImage(),
            new ImageIcon(getClass().getResource("../source/pajaro_muerto_con_fondo-removebg-preview.png")).getImage()};
}
