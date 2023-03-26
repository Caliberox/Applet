import java.awt.*;
import java.applet.*;

public class ShapesApplet extends Applet {
    // Draws an oval with a specified width and height
    private void drawOval(Graphics g, int width, int height) {
        g.drawOval(140, 140, width, height);
    }

    // Draws a rectangle with a specified width and height
    private void drawRect(Graphics g, int width, int height) {
        g.drawRect(160, 60, width, height);
    }

    // Draws a triangle using three lines
    private void drawTriangle(Graphics g) {
        g.drawLine(180, 150, 180, 370);
        g.drawLine(180, 150, 440, 370);
        g.drawLine(180, 370, 440, 370);
    }

    // Overrides the paint method to draw the shapes
    @Override
    public void paint(Graphics g) {
        drawOval(g, 30, 30);
        drawRect(g, 40, 40);
        drawTriangle(g);
    }
}

