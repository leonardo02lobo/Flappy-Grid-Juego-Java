package Interfaces;

import java.awt.event.*;
import javax.swing.*;

public class Ventana extends Panel{

    public Ventana() {
        tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
                Pajaro.y += Pajaro.movimiento;
                Obstaculo.x -= 20;
                pajaro.ColisionParajo();
                pajaro.PuntajePajaro();
            }
        });
        tiempo.start();
        AccionesDelTeclado();
    }

    @Override
    public void init() {
        int aux = (int) (Math.random() * 4);
        add(puntaje.Puntaje());
        add(obstaculo.tubo1(imagenesAbajo[0], AnchoAbajo[0], AltoAbajo[0]));
        add(obstaculo.tubo2(imagenesArriba[0], AnchoArriba[0], AltoArriba[0]));
        add(pajaro.Pajaro());
        add(fondo.Fondo());
    }

    private void AccionesDelTeclado() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                pajaro.MovimientosPajaro(e);
            }
        });
        setFocusable(true);
    }

    Pajaro pajaro = new Pajaro();
    Fondo fondo = new Fondo();
    Obstaculo obstaculo = new Obstaculo();
    Puntaje puntaje = new Puntaje();
    public static Timer tiempo;
    String imagenesArriba[] = {
        "../source/obstaculo_1.png",
        "../source/obstaculo_3.png",
        "../source/obstaculo_5.png",
        "../source/obstaculo_7.png",};
    String imagenesAbajo[] = {
        "../source/obstaculo_2.png",
        "../source/obstaculo_4.png",
        "../source/obstaculo_6.png",
        "../source/obstaculo_8.png",};
    int AnchoArriba[] = {
        100,
        100,
        80,
        100,};
    int AltoArriba[] = {
        200,
        100,
        420,
        20,};
    int AnchoAbajo[] = {
        100,
        100,
        100,
        100,};
    int AltoAbajo[] = {
        340,
        460,
        140,
        520,};
}
