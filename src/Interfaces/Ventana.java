package Interfaces;

import Archivos.Organizacion_De_Datos;
import Interfaces.Extra.Menu_Salir;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class Ventana extends Panel {

    public Ventana() {
        tiempo = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                organizar.Organizar(new File(url));
                init();
                Pajaro.y += Pajaro.movimiento;
                Obstaculo.x -= 20;
                pajaro.ColisionParajo();
                pajaro.PuntajePajaro();
            }
        });
        tiempo.restart();
        AccionesDelTeclado();
    }

    @Override
    public void init() {

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
                Teclas_Escape(e);
            }
        });
        setFocusable(true);
    }

    private void Teclas_Escape(KeyEvent e) {
        if (e.getKeyCode() == 27) {
            Menu_Salir v = new Menu_Salir();
            v.setVisible(true);
            tiempo.stop();
            band = true;
        }
    }
    
    public static void ReiniciarValores(){
        Pajaro.y = 200;
        Obstaculo.x = 1000;
        Puntaje.aux = 0;
    }

    public static String url = "src/Archivos/Idi-Esp.txt";
    Organizacion_De_Datos organizar = new Organizacion_De_Datos();
    public static boolean band = false;
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
