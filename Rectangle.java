import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle {
    private int x, y;

    public Rectangle (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D.Double rect = new Rectangle2D.Double(80, 10, 75, 50);

        g2d.setColor(Color.GRAY);
        g2d.fill(rect);
    }
}
