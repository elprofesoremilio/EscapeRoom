package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public class Moon extends GameObject {
    private Color color;
    private int radio;
    public Moon(GameImage image, Point position, Color color, int radio) {
        super(image, position, new Point(0,0));
        this.color = color;
        this.radio = radio;
    }

    @Override
    public void paint(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(position.x,position.y,radio,radio);
    }
}
