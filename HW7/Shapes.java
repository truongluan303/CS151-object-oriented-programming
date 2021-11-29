import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Shapes {



    public static class CirclePanel extends JPanel {
        private int x;
        private int y;
        private int width;
        private int height;
        private Color color;

        public CirclePanel(int x, int y, int width, int height, Color color) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, height);
            g2d.setColor(color);
            g2d.fill(circle);
        }
    }




    public static class PolygonPanel extends JPanel {
        private int numberOfPoints;
        private Color color;

        public PolygonPanel(int numberOfPoints, Color color) {
            this.numberOfPoints = numberOfPoints;
            this.color = color;
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Polygon p = new Polygon();
            for (int i = 0; i < numberOfPoints; i++) {
                p.addPoint((int) (100 + 100 * Math.cos(i * 2 * Math.PI / numberOfPoints)),
                           (int) (100 + 100 * Math.sin(i * 2 * Math.PI / numberOfPoints)));
            }
            g.setColor(color);
            g.fillPolygon(p);
            g.drawPolygon(p);
        }
    }
}
