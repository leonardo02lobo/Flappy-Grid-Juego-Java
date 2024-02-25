package Interfaces.Principal;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Boton_Volver {
    
    public JButton botonVolver(JFrame ventana){
        volver.setBounds(0,0,50,50);
        ImageIcon clickaqui = new ImageIcon("src/source/boton-Volver.png");
        volver.setIcon(new ImageIcon(clickaqui.getImage().getScaledInstance(volver.getWidth(), volver.getHeight(), Image.SCALE_SMOOTH)));
        volver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                MenuPrincipal principal = new MenuPrincipal();
                principal.setVisible(true);
                ventana.dispose();
            }
        });
        return volver;
    }
    private final JButton volver = new JButton();
}