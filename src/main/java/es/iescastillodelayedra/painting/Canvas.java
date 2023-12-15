package es.iescastillodelayedra.painting;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Canvas extends JPanel {
    GameImage image;
    int x=0,y;
    public Canvas() {
        super();
        image = new GameImage("imgs/mario.png",0.1);

    }
    @Override
    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        y=this.getHeight()-image.getScaledImage().getHeight(null);

        g2d.setBackground(Color.black);
        g2d.clearRect(0,0, this.getWidth(), this.getHeight());

        g2d.drawImage(image.getScaledImage(),x,y,null);
    }

    public void update() {
        x++;
    }
}
