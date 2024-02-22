package Interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pajaro {
    
    private int aux = 0;
    
    public JLabel Pajaro(){
        
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
        return pajaro;
    }
    JLabel pajaro = new JLabel();
    
}
