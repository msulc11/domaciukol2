package pro1.swingComponents;

import pro1.drawingModel.Arrow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

    private final DisplayPanel displayPanel;
    private double direction = 0;
    private boolean colorRed = false;

    public void setDirection(double degrees) {
        this.direction = degrees;
    }

    public void setColorRed(boolean red) {
        this.colorRed = red;
        this.displayPanel.repaint();
    }

    public void reset() {
        displayPanel.clearArrows();
    }

    public MainFrame() {
        this.setTitle("Sipky");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        this.displayPanel = new DisplayPanel();
        this.add(this.displayPanel, BorderLayout.CENTER);

        OptionsPanel options = new OptionsPanel(this);
        this.add(options, BorderLayout.WEST);

        this.displayPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Color c = colorRed ? Color.RED : Color.GRAY;
                displayPanel.addArrow(new Arrow(e.getX(), e.getY(), direction, c));
            }
        });

        this.setVisible(true);
    }
}