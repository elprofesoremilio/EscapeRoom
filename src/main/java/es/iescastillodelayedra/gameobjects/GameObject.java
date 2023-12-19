package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.GameImage;

import java.awt.*;

public class GameObject {
    public GameImage image;
    public Point position;
    public Point velocity;

    public GameObject(GameImage image, Point position, Point velocity) {
        this.image = image;
        this.position = position;
        this.velocity = velocity;
    }

    public void update() {
        position.x += velocity.x;
        position.y += velocity.y;
    }


}
