package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public class Pajaro extends GameObject {

    public Pajaro(GameImage image, Point position) {
        super(image, position, new Point(45, 12));
        velocity.x = 1;
        velocity.y = 0;
    }

    @Override
    public void paint(Graphics2D g2d) {
        g2d.drawImage(image.getScaledImage(), position.x, position.y, null);
    }
}
