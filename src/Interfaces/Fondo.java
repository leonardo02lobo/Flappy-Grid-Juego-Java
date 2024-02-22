package Interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Fondo {
    
    public JLabel Fondo(){
        Image fondo = new ImageIcon(getClass().getResource("../source/fondo.png")).getImage();
        Fondo.setIcon(new ImageIcon(fondo.getScaledInstance(Panel.ancho, Panel.alto, Image.SCALE_SMOOTH)));
        Fondo.setBounds(0,0,Panel.ancho,Panel.alto);
        return Fondo;
    }
    JLabel Fondo = new JLabel();
}
