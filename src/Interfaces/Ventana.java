package Interfaces;

import java.awt.event.*;
import javax.swing.*;

public class Ventana extends Panel {

    Pajaro pajaro = new Pajaro();
    Fondo fondo = new Fondo();
    public static Timer tiempo;

    public Ventana() {
        tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
                Pajaro.y += Pajaro.movimiento;
                pajaro.ColisionParajo();
            }
        });
        tiempo.start();
        AccionesDelTeclado();
    }

    @Override
    public void init() {
        add(pajaro.Pajaro());
        add(fondo.Fondo());
    }

    private void AccionesDelTeclado(){
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                pajaro.MovimientosPajaro(e);
            }
        });
        setFocusable(true);
    }
}
