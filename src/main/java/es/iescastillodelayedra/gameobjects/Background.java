package es.iescastillodelayedra.gameobjects;

import es.iescastillodelayedra.painting.Canvas;

import java.awt.*;

public class Background extends GameObject {
    private int r,g,b;
    Canvas canvas;


    public Background(int r, int g, int b, Canvas canvas) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.canvas = canvas;
    }
    @Override
    public void update() {
        if (g >0) g--;
        if (b >20) b--;        
    }
    @Override
    public void paint(Graphics2D g2d) {
        g2d.setBackground(new Color(r, g, b));
        g2d.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
    }
}
