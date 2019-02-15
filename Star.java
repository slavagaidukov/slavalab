import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Star {
    int x, y, width, height;

    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        int xPoints[]={29,35,20,38,23};
        int yPoints[]={20,38,26,26,38};

        Graphics2D g2d = (Graphics2D)g;
        GeneralPath star=new GeneralPath();

        star.moveTo(xPoints[0]+160,yPoints[0]+5);
        for (int i=1;i<xPoints.length;i++){
            star.lineTo(xPoints[i]+160,yPoints[i]+5);
        }
        star.closePath();

        g2d.setColor(Color.GRAY);
        g2d.fill(star);
    }
}