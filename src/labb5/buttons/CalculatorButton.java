//Samuel Melander & Viggo Härdelin.
package labb5.buttons;

import labb5.GUI.Situation;
import labb5.verktyg.Konstanter;

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
        setFont(new Font("COMIC SANS", Font.PLAIN, 50));
        addActionListener(this);
    }

    public void setColor(Color color) {
        setBorder(BorderFactory.createLineBorder(color, Konstanter.BUTTON_BORDER_WIDTH));
    }

    public String toString() {
        return text;
    }

    public Situation getSituation() {
        return situation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        transition();
        System.out.println("Efter knapptryck är state: " + getSituation().getState());
    }

    public void resetOperator() {
        if (situation.getBinaryOperator() != null) {
            situation.getBinaryOperator().setColor(Konstanter.BUTTON_BORDER_COLOR);
        }
    }

    public void resetDisplay() {
        situation.getDisplay().setText("0");
    }
}
