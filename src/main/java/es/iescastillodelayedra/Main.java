package es.iescastillodelayedra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primer Juego");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        frame.getContentPane().add(canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}