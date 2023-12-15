package es.iescastillodelayedra.painting;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    GameImage image;
    int velocityX = 1;
    int x=0,y;
    int r=0, g=200,b=255;
    public Canvas() {
        super();
        image = new GameImage("imgs/mario.png",0.1);

    }
    @Override
    public void paint(Graphics graphics) {

        Graphics2D g2d = (Graphics2D) graphics;

        y=this.getHeight()-image.getScaledImage().getHeight(null);

        g2d.setBackground(new Color(r,g,b));
        g2d.setColor(new Color(250,250,250));

        g2d.clearRect(0,0, this.getWidth(), this.getHeight());

        g2d.fillOval(250,30,40,40);
        g2d.fillOval(20,40,3,3);
        g2d.fillOval(200,60,3,3);
        g2d.fillOval(70,10,3,3);
        g2d.fillOval(120,50,3,3);
        g2d.fillOval(320,15,3,3);

        g2d.drawImage(image.getScaledImage(),x,y,null);
    }

    public void update() {
        if (g>0) {
            g--;
        }
        if (b>20) {b--;}

        if (x+velocityX>=this.getWidth()-image.getScaledImage().getWidth(null)) {
            velocityX=-1;
        } else if (x-velocityX<0) {
            velocityX=1;
        }
        x+=velocityX;
    }
}
