package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public class Goomba extends GameObject{

    public Goomba(GameImage image, Point position, Point velocity) {
        super(image, position, velocity);
    }
    @Override
    public void paint(Graphics2D g2d) {
        g2d.drawImage(image.getScaledImage(),position.x,position.y,null);
    }
}
