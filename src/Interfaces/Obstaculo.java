package Interfaces;

import java.awt.Image;
import javax.swing.*;

public class Obstaculo {

    public JLabel tubo1(String cadena,int ancho,int alto) {
        Image img = new ImageIcon(getClass().getResource(cadena)).getImage();
        tubo1.setIcon(new ImageIcon(img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        tubo1.setBounds(x, 0, ancho, alto);
        return tubo1;
    }
    
    public JLabel tubo2(String cadena,int ancho,int alto) {
        Image img = new ImageIcon(getClass().getResource(cadena)).getImage();
        tubo2.setIcon(new ImageIcon(img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        tubo2.setBounds(x, 480, ancho, alto);
        return tubo2;
    }

    JLabel tubo1 = new JLabel();
    JLabel tubo2 = new JLabel();
    public static int x = 1000;

}
