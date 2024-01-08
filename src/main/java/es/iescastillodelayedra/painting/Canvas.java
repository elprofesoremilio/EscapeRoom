package es.iescastillodelayedra.painting;

import es.iescastillodelayedra.gameobjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Canvas extends JPanel {
    Player player;
    Moon moon;
    ArrayList<GameObject> objects = new ArrayList<>();
    public Canvas() {
        super();
        player = new Player(
                new GameImage("imgs/mario.png",0.1),
                new Point(0,200),
                new Point(0,0)
        );
        moon = new Moon(null,new Point(250,30),Color.white,40);
        MyKeyListener listener = new MyKeyListener();
        this.addKeyListener(listener);
        setFocusable(true);
    }

    public class MyKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_D) {
                player.velocity.x = 1;
            } else if (e.getKeyCode() == KeyEvent.VK_A) {
                player.velocity.x = -1;
            } else if (e.getKeyCode() == KeyEvent.VK_W) {
                player.velocity.y = -1;
            } else if (e.getKeyCode() == KeyEvent.VK_S) {
                player.velocity.y = 1;
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_A) {
                player.velocity.x = 0;
            } else if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                player.velocity.y = 1;
            }
        }
    }

    public void init(int width, int height) {
        objects.add(new Background(0,200,255, this));
        for (int i = 0; i < 50; i++) {
            objects.add(new Star(width,height,(byte)3));
        }
        objects.add(moon);
        objects.add(player);
    }

    @Override
    public void paint(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;

        for (GameObject object : objects) {
            object.paint(g2d);
        }
    }

    public void update() {
        for (GameObject object : objects) {
            object.update();
        }
    }
}
