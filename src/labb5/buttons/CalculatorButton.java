package labb5.buttons;

import labb5.GUI.Situation;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CalculatorButton extends JButton implements ActionListener {
    private static final int SIDA = 100;
    public abstract void transition();



    private String text;
    private Situation situation;
    public CalculatorButton(String textIn, Situation situationIn) {
        text = textIn;
        situation = situationIn;
        setPreferredSize(new Dimension(SIDA, SIDA));
        setText(text);

    }

    public void setColor(Color color) {
        setBorder(BorderFactory.createLineBorder(color));
    }

    public String toString() {
        return text;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
