import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Oval {
    private int x, y;

    public Oval(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D.Double oval = new Ellipse2D.Double(220, 10, 100, 50);

        g2d.setColor(Color.GRAY);
        g2d.fill(oval);
    }
}
