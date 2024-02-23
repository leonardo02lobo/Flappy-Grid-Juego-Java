package Interfaces;

import java.awt.event.*;
import javax.swing.*;

public class Ventana extends Panel {

    Pajaro pajaro = new Pajaro();
    Fondo fondo = new Fondo();

    public Ventana() {
        Timer tiempo = new Timer(17, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
                Pajaro.y += Pajaro.movimiento;
            }
        });
        tiempo.start();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                pajaro.MovimientosPajaro(e);
            }
        });
        setFocusable(true);
    }

    @Override
    public void init() {
        add(pajaro.Pajaro());
        add(fondo.Fondo());
    }
}
