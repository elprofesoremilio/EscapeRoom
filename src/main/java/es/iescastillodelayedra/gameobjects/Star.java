package es.iescastillodelayedra.gameobjects;

import java.awt.*;
import java.util.Random;

public class Star extends GameObject {
    public Point position;
    public short bright;
    public byte radius;
    private boolean apagando = true;

    public Star() {}
    public Star(int width, int height, byte radius) {
        Random random = new Random();

        position = new Point(random.nextInt(width),random.nextInt(height));
        this.radius = (byte) (random.nextInt(radius)+1);
        bright = (short)random.nextInt(256);
    }
    @Override
    public void update() {
        if (apagando) {
            if (bright > 0) bright--;
            if (bright==0) apagando = false;
        } else {
            if (bright < 255) bright++;
            if (bright==255) apagando = true;
        }
    }

    @Override
    public void paint(Graphics2D g2d) {
        g2d.setColor(new Color(bright, bright, bright));
        g2d.fillOval(position.x, position.y, radius, radius);
    }


}
