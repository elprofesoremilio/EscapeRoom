package es.iescastillodelayedra.userinterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPanel extends JPanel {

    private String selectedOption;

    public MenuPanel() {
        selectedOption = null;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();

                // Verificar la posición del ratón y determinar la opción seleccionada
                if (mouseX > 50 && mouseX < 200 && mouseY > 50 && mouseY < 100) {
                    selectedOption = "Cargar";
                } else if (mouseX > 50 && mouseX < 200 && mouseY > 120 && mouseY < 170) {
                    selectedOption = "Guardar";
                } else if (mouseX > 50 && mouseX < 200 && mouseY > 190 && mouseY < 240) {
                    selectedOption = "Salir";
                }

                // Volver a dibujar el panel después de la selección
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Dibujar el menú y resaltar la opción seleccionada
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.fillRect(50, 50, 150, 50);
        g2d.fillRect(50, 120, 150, 50);
        g2d.fillRect(50, 190, 150, 50);

        g2d.setColor(Color.BLACK);
        g2d.drawRect(50, 50, 150, 50);
        g2d.drawRect(50, 120, 150, 50);
        g2d.drawRect(50, 190, 150, 50);

        g2d.drawString("Cargar", 100, 80);
        g2d.drawString("Guardar", 100, 150);
        g2d.drawString("Salir", 100, 220);

        if (selectedOption != null) {
            g2d.setColor(Color.RED);
            if (selectedOption.equals("Cargar")) {
                g2d.drawRect(50, 50, 150, 50);
            } else if (selectedOption.equals("Guardar")) {
                g2d.drawRect(50, 120, 150, 50);
            } else if (selectedOption.equals("Salir")) {
                g2d.drawRect(50, 190, 150, 50);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Menu Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setContentPane(new MenuPanel());
            frame.setVisible(true);
        });
    }
}
