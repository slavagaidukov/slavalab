import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Circle {
    private int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Ellipse2D.Double circle = new Ellipse2D.Double(10, 10, 50, 50);

        g2d.setColor(Color.GRAY);
        g2d.fill(circle);
    }
}