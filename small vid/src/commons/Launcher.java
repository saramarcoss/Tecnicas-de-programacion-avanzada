    package commons;

import gfx.Stage;
import javax.swing.JFrame;

public class Launcher {

    private JFrame window;

    public Launcher() {
        window = new JFrame("Small game");
        window.add(new Stage());

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 800);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Launcher();
    }
}
