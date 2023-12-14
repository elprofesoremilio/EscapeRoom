package es.iescastillodelayedra;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Canvas extends JPanel {
    Image image;
    public Canvas() {
        super();
        try {
            image = ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource("gatopitufo.jpg")
                    ));
            image = image.getScaledInstance((int)(image.getWidth(null)*0.2),
                    (int)(image.getHeight(null)*0.2),
                    Image.SCALE_DEFAULT);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen");
            System.exit(0);
        }

    }
    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(Color.black);

        g2d.clearRect(0,0, this.getWidth(), this.getHeight());

        g2d.drawImage(image,0,0,null);

        g2d.setColor(Color.green);

        g2d.fillOval(100,50, 30, 30);
        g2d.setColor(Color.blue);
        g2d.drawOval(100,50, 30,30);

        g2d.fillRect(0, 0, 30, 30);
        g2d.setColor(Color.green);
        g2d.drawRect(100, 100, 30, 30);


    }
}
