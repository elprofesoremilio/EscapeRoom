package es.iescastillodelayedra;

import es.iescastillodelayedra.painting.Canvas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Primer Juego");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);

        Canvas canvas = new Canvas();
        frame.getContentPane().add(canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /*
        GameLoop:
        1.- paint
        2.- update
         */

        while (true) {
            canvas.repaint();
            canvas.update();
            Thread.sleep(10);
        }

    }
}