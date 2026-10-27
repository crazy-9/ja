import java.awt.*;
import java.awt.event.*;

public class AllTheBest extends Frame {

    AllTheBest() {
        setTitle("AllTheBest");
        setSize(400, 300);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Color[] colors = {
            Color.RED,
            Color.BLUE,
            Color.GREEN,
            Color.ORANGE,
            Color.MAGENTA
        };

        g.setFont(new Font("Arial", Font.BOLD, 24));

        for (int i = 0; i < colors.length; i++) {
            g.setColor(colors[i]);
            g.drawString("AllTheBest", 130, 80 + i * 40);
        }
    }

    public static void main(String[] args) {
        new AllTheBest();
    }
}
