package Interfaces.Principal;

import java.awt.*;
import javax.swing.*;

public class Record extends JFrame{

    public Record(){
        super.setSize(700, 500);
        super.setTitle("Flappy Bird");
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        init();
    }

    private void init(){

        panel.setLayout(null);
        this.getContentPane().add(panel);

        for(int i = 0; i < recordTotal; i++){
            records[i] = new JLabel();

            records[i].setText("records");
            records[i].setFont(new Font("calibri",1,30));
            records[i].setForeground(Color.white);
            records[i].setBounds(40,y,200,30);
            panel.add(records[i]);
            y+=50;
        }
        
        ImageIcon pajarito = new ImageIcon("src/source/menu.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 700,461);
        etiqueta2.setIcon(new ImageIcon(pajarito.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }

    private final int recordTotal = 5;
    private  int y = 100;
    JPanel panel = new JPanel();
    JLabel[] records = new JLabel[recordTotal];
}