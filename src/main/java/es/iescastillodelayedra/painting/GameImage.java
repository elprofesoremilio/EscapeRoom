package es.iescastillodelayedra.painting;

import javax.imageio.ImageIO;
import java.awt.*;
import java.util.Objects;

public class GameImage {
    private Image image;
    private Image scaledImage=null;
    public GameImage (String source, double scale) {
        try {
            image = ImageIO.read(Objects.requireNonNull(
                    getClass().getClassLoader().getResource(source)
            ));
            scaledImage = image.getScaledInstance((int)(image.getWidth(null)*scale),
                    (int)(image.getHeight(null)*scale),
                    Image.SCALE_DEFAULT);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen");
            System.exit(0);
        }

    }

    public Image scale(double scale) {
        scaledImage = image.getScaledInstance((int)(image.getWidth(null)*scale),
                (int)(image.getHeight(null)*scale),
                Image.SCALE_DEFAULT);
        return this.image;
    }

    public Image getImage() {
        return image;
    }

    public Image getScaledImage() {
        return (scaledImage==null)?image:scaledImage;
    }
}
