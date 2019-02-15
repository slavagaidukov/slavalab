import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DynamicShapes extends JPanel {
    private List<Object> shapes = new ArrayList<>();
    public DynamicShapes(String shape) {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 400));

        switch (shape) {
            case "Circle": {
                addCircle();
            }
            break;
            case "Star": {
                addStar();
            }
            break;
            case "Rectangle": {
                addRectangle();
            }
            break;
            case "Oval": {
                addOval();
            }
            case "Line": {
                addLine();
            }
            case "Square": {
                addSquare();
            }
            break;
            case "All figures": {
                addCircle();
                addStar();
                addRectangle();
                addOval();
                addLine();
                addSquare();
                break;
            }
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            } else if (s instanceof Star) {
                ((Star) s).draw(g);
            } else if (s instanceof Rectangle) {
                ((Rectangle) s).draw(g);
            } else if (s instanceof Oval) {
                ((Oval) s).draw(g);
            } else if (s instanceof Line) {
                ((Line) s).draw(g);
            } else if (s instanceof Square) {
                ((Square) s).draw(g);
            }
        }
    }
    public void addCircle() {
        shapes.add(new Circle(getX(),getY()));
        repaint();
    }

    public void addStar() {
        shapes.add(new Star(getX(),getY()));
        repaint();
    }
    public void addRectangle() {
        shapes.add(new Rectangle(getX(), getY()));
        repaint();
    }
    public void addOval() {
            shapes.add(new Oval(getX(),getY()));
            repaint();
    }
    public void addLine() {
        shapes.add(new Line(getX(),getY()));
        repaint();
    }
    public void addSquare() {
        shapes.add(new Square(getX(),getY()));
        repaint();
    }

    public static void main(String[] args) {
        String shapes[]={"Star", "Circle","Rectangle","Oval","Line","Square", "All figures"};
        String shape=(String)JOptionPane.showInputDialog(null, "Pick the shape you want", "Random Shapes...", JOptionPane.PLAIN_MESSAGE, null, shapes,shapes[0]);

        JFrame frame = new JFrame();
        frame.add(new DynamicShapes(shape));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

