package pro1.swingComponents;

import javax.swing.*;
import java.awt.*;

public class OptionsPanel extends JPanel {

    private final MainFrame parent;

    public OptionsPanel(MainFrame parent) {
        this.parent = parent;
        this.setPreferredSize(new Dimension(200, 0));
        JLabel dirLabel = new JLabel("Smer sipky");
        this.add(dirLabel);
        JSlider dirSlider = new JSlider(0, 359, 0);
        dirSlider.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        dirSlider.setMajorTickSpacing(90);
        dirSlider.setPaintTicks(true);
        dirSlider.setPaintLabels(true);
        this.add(dirSlider);

        JLabel currentDirection = new JLabel("0°");
        this.add(currentDirection);

        dirSlider.addChangeListener(e -> {
            int sliderValue = dirSlider.getValue();
            parent.setDirection(sliderValue);
            currentDirection.setText(sliderValue + "°");
        });

        JCheckBox colorCheck = new JCheckBox("Cervene sipky");
        colorCheck.addActionListener(e -> parent.setColorRed(colorCheck.isSelected()));
        this.add(colorCheck);

        JButton resetBtn = new JButton("Reset");
        resetBtn.addActionListener(e -> parent.reset());
        this.add(resetBtn);

        this.add(Box.createVerticalGlue());
    }
}