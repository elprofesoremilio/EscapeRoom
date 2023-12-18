package es.iescastillodelayedra;

import es.iescastillodelayedra.painting.Canvas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Canvas canvas = new Canvas();
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Primer Juego");
            frame.setSize(400,300);
            frame.setLocationRelativeTo(null);


            frame.getContentPane().add(canvas);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });

        /*
        GameLoop:
        1.- paint
        2.- update
         */
        canvas.init(350, 150);

        while (true) {
            canvas.repaint();
            canvas.update();
            Thread.sleep(5);

        }

    }
}