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

        if (situation.getState() == Situation.State.OpReady) {
            situation.setState(Situation.State.Input2);
            display.setText(getText());
            return;
        }

        String current = display.getText();


        if (current.equals("0") || situation.getState() == Situation.State.HasResult) {
            display.setText(getText());
            return;
        }

        display.setText(current + getText());
    }
}
