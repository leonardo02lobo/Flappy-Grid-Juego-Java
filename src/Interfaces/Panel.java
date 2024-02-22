package Interfaces;

import javax.swing.*;

public abstract class Panel extends JPanel{

    public static final int ancho = 1200;
    public static final int alto = 700;

    public Panel(){
        super.setSize(ancho,alto);
        super.setLayout(null);
    }

    public abstract void init();
}