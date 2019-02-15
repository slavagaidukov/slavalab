import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Line {
    private int x1, y1,x2,y2;

    public Line(int x, int y) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x;
        this.y2 = y;
    }
    public void draw(Graphics g) {
        int xPoints[]={10,100};
        int yPoints[]={20,20};

        Graphics2D g2d = (Graphics2D)g;
        GeneralPath line=new GeneralPath();

        line.moveTo(xPoints[0]+50,yPoints[0]+100);
        for (int i=1;i<xPoints.length;i++){
            line.lineTo(xPoints[i]+50,yPoints[i]+100);
        }
        line.closePath();

        g2d.setColor(Color.GRAY);
        g2d.draw(line);
    }
}

