package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends Panel {
    
    Pajaro pajaro = new Pajaro();
    Fondo fondo = new Fondo();

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
        add(pajaro.Pajaro());
        add(fondo.Fondo());
    }
}
