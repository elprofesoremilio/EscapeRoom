package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public class Player extends GameObject {
    public Player(GameImage image, Point position, Point velocity) {
        super(image, position, velocity);
    }

    @Override
    public void update() {
        super.update();
        if (position.y > 200) position.y=200;
    }

    @Override
    public void paint(Graphics2D g2d) {
        g2d.drawImage(image.getScaledImage(),position.x,position.y,null);
    }
}
