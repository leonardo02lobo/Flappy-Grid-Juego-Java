package Interfaces.Principal;

import java.awt.*;
import javax.swing.*;
import logic.*;

public class Record extends JFrame {

    public Record() {
        super.setSize(ancho, alto);
        super.setTitle(Principal.Titulo);
        super.setLocationRelativeTo(null);
        super.setResizable(false);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setLayout(null);
        this.getContentPane().add(panel);

        init();
    }

    private void init() {
        agregarPuntaje(records, 200);
        panel.add(volver.botonVolver(this));

        ImageIcon pajarito = new ImageIcon("src/source/menu.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(0, 0, 700, 461);
        etiqueta2.setIcon(new ImageIcon(pajarito.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }

    private void agregarPuntaje(JLabel[] label, int x) {
        for (int i = 0; i < recordTotal; i++) {
            label[i] = new JLabel();

            label[i].setText("records");
            label[i].setFont(new Font("calibri", 1, 30));
            label[i].setForeground(Color.white);
            label[i].setBounds(x, y, 200, 30);
            panel.add(label[i]);
            y += 50;
        }
    }
    private final int ancho = 700;
    private final int alto = 500;
    private final int recordTotal = 5;
    private int y = 220;
    JPanel panel = new JPanel();
    Boton_Volver volver = new Boton_Volver();
    JLabel[] records = new JLabel[recordTotal];
}
