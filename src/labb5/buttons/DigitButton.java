//Samuel Melander & Viggo Härdelin
package labb5.buttons;

import labb5.GUI.Situation;

import javax.swing.*;

public class DigitButton extends CalculatorButton {
    public DigitButton(String textIn, Situation situationIn) {
        super(textIn, situationIn);
    }

    @Override
    public void transition() {
        Situation situation = getSituation();
        JLabel display = situation.getDisplay();
        String current = display.getText();
        switch (situation.getState()) {
            case Input1 -> {
                if (current.equals("0")) {
                    display.setText(getText());
                } else {
                    display.setText(current + getText());
                }
            }
            case OpReady -> {
                situation.setState(Situation.State.Input2);
                display.setText(getText());
            }
            case Input2 -> {
                if (current.equals("0")) {
                    display.setText(getText());
                } else {
                    display.setText(current + getText());
                }
            }
            case HasResult -> {
                display.setText(getText());
                situation.setState(Situation.State.Input1);
            }
        }
    }
}
