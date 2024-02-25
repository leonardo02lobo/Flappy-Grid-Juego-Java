package logic;

import Interfaces.Principal.MenuPrincipal;

public class Principal {

    public static String Titulo = "Flappy Bird";
    
    public static void main(String[] args) {

        MenuPrincipal v = new MenuPrincipal();
        v.setVisible(true);
    }
}
