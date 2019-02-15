import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Square {
    private int x, y;

    public Square (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        Rectangle2D.Double square = new Rectangle2D.Double(245, 90, 50, 50);

        g2d.setColor(Color.GRAY);
        g2d.fill(square);
    }
}
