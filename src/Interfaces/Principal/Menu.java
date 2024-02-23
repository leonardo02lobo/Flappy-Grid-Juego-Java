package Interfaces.Principal;

import java.awt.*;
import javax.swing.*;

public class Menu extends JFrame{

    public JPanel panel;

    public Menu(){

        setSize(283,178);
        setTitle("Flappy Bird");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(100,100));

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    //private void iniciarMetodos(){

    //}
    private void colocarPaneles(){

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
}