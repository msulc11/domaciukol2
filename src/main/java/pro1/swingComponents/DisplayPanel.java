package pro1.swingComponents;

import pro1.drawingModel.Arrow;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DisplayPanel extends JPanel {

    private final List<Arrow> arrows = new ArrayList<>();

    public DisplayPanel() {
        this.setBackground(Color.WHITE);
    }

    public void addArrow(Arrow arrow) {
        arrows.add(arrow);
        this.repaint();
    }

    public void clearArrows() {
        arrows.clear();
        this.repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Arrow arrow : arrows) {
            arrow.draw((Graphics2D) g);
        }
    }
}