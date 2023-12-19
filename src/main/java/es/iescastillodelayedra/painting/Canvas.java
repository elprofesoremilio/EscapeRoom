package es.iescastillodelayedra.painting;

import es.iescastillodelayedra.gameobjects.GameObject;
import es.iescastillodelayedra.gameobjects.Star;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel {
    GameObject mario;
    int rFondo =0, gFondo =200, bFondo =255;
    ArrayList<Star> stars = new ArrayList<>();
    public Canvas() {
        super();
        mario = new GameObject(
                new GameImage("imgs/mario.png",0.1),
                new Point(0,200),
                new Point(1,-1)
        );

    }

    public void init(int width, int height) {
        for (int i = 0; i < 50; i++) {
            stars.add(new Star(width,height,(byte)3));
        }
    }
    @Override
    public void paint(Graphics graphics) {

        Graphics2D g2d = (Graphics2D) graphics;


        g2d.setBackground(new Color(rFondo, gFondo, bFondo));

        g2d.clearRect(0,0, this.getWidth(), this.getHeight());

        for (Star star : stars) {
            g2d.setColor(new Color(star.bright, star.bright, star.bright));
            g2d.fillOval(star.position.x, star.position.y, star.radius, star.radius);
        }

        g2d.setColor(new Color(250,250,250));
        g2d.fillOval(250,30,40,40);


        g2d.drawImage(mario.image.getScaledImage(),mario.position.x,mario.position.y,null);
    }

    public void update() {
        if (gFondo >0) gFondo--;
        if (bFondo >20) bFondo--;

        mario.update();

        for (Star star : stars) {
            star.update();
        }
    }
}
