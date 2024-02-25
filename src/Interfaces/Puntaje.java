package Interfaces;

import java.awt.*;
import javax.swing.*;

public class Puntaje {
    
    public JLabel Puntaje(){
        puntaje.setText(Puntaje+" "+aux);
        puntaje.setFont(new Font("calibri",1,30));
        puntaje.setForeground(Color.white);
        puntaje.setBounds(400,10,200,30);
        return puntaje;
    }
    JLabel puntaje = new JLabel();
    public static String Puntaje;
    public static int aux = 0;
}
