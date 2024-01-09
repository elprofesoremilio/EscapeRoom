package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public abstract class GameObject {
    public GameImage image;
    public Point position;
    public Point velocity;

    public GameObject() {}
    public GameObject(GameImage image, Point position, Point velocity) {
        this.image = image;
        this.position = position;
        this.velocity = velocity;
    }

    public void update() {
        position.x += velocity.x;
        position.y += velocity.y;
    }

    public abstract void paint(Graphics2D g2d);

}
