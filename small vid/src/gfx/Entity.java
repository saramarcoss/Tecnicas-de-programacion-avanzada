    package gfx;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Entity {

    private String dummy = "./res/actor.png";

    private int x;
    private int y;
    private Image image;

    public Entity() {
        ImageIcon img = new ImageIcon(dummy);
        image = img.getImage();
        x = 50;
        y = 50;
    }

    public void move(int dx,int dy) {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }
}

