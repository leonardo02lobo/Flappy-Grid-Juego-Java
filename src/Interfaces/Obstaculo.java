package Interfaces;

import java.awt.Image;
import javax.swing.*;

public class Obstaculo {

    public JLabel tubo() {
        Image img = new ImageIcon(getClass().getResource("../source/obstaculo_2.png")).getImage();
        tubo1.setIcon(new ImageIcon(img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        tubo1.setBounds(x, 0, ancho, alto);
        return tubo1;
    }

    JLabel tubo1 = new JLabel();
    private final int ancho = 95;
    private final int alto = 213;
    public static int x = 400;
    Pajaro pajaro = new Pajaro();
    Image imagenes[] = {
        new ImageIcon(getClass().getResource("../source/obstaculo_1.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_2.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_3.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_4.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_5.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_6.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_7.png")).getImage(),
        new ImageIcon(getClass().getResource("../source/obstaculo_8.png")).getImage(),
    };
}
