    package gfx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JPanel;

public class Stage extends JPanel implements KeyListener{

    private Entity dummy;
    private int speed = 10;

    public Stage() {
        addKeyListener(this);
        setFocusable(true);
        setBackground(Color.CYAN);
        setDoubleBuffered(true);

        dummy = new Entity();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(dummy.getImage(), dummy.getX(), dummy.getY(), this);
        g.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dummy.move(-speed,0);
        }

        if (key == KeyEvent.VK_RIGHT) {
            dummy.move(speed,0);
        }

        if (key == KeyEvent.VK_UP) {
            dummy.move(0, -speed);
        }

        if (key == KeyEvent.VK_DOWN) {
            dummy.move(0, speed);
        }
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
