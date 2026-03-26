package pro1.drawingModel;

import java.awt.*;
import java.awt.geom.AffineTransform;


public class Arrow implements Drawable {
    private final int x;
    private final int y;
    private final double degrees;
    private final Color color;

    public Arrow(int x, int y, double degrees, Color color) {
        this.x = x;
        this.y = y;
        this.degrees = degrees;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        AffineTransform old = g.getTransform();
        g.translate(x, y);
        g.rotate(Math.toRadians(degrees));
        g.setColor(color);
        g.setStroke(new BasicStroke(2));
        int len = 80;
        g.drawLine(0, 0, 0, len);
        int h = 20;
        g.drawLine(0, 0, -h, h);
        g.drawLine(0, 0,  h, h);
        g.setTransform(old);
    }
}
