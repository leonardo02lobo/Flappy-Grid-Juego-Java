package Interfaces.Principal;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Boton_Volver {
    
    public JButton botonVolver(){
        volver.setBounds(0,0,50,50);
        ImageIcon clickaqui = new ImageIcon("src/source/boton-Volver.png");
        volver.setIcon(new ImageIcon(clickaqui.getImage().getScaledInstance(volver.getWidth(), volver.getHeight(), Image.SCALE_SMOOTH)));
        return volver;
    }
    private JButton volver = new JButton();
}
