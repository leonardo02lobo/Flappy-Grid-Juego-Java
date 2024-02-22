package logic;

import Interfaces.Panel;
import Interfaces.Ventana;
import javax.swing.*;

public class Principal {
    
    public static void main(String[] args) {
        JFrame miVentana = new JFrame();
        Panel miPanel = new Ventana();
        miVentana.add(miPanel);
        miVentana.setSize(Panel.ancho,Panel.alto);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLocationRelativeTo(null);
        miVentana.setResizable(false);
        miVentana.setVisible(true);
    }
}
