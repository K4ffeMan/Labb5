package labb5.buttons;

import labb5.GUI.Situation;

public abstract class CalculatorButton {
    public abstract void transition();

    private String text;
    private Situation situation;
    public CalculatorButton(String textIn, Situation situationIn) {
        text = textIn;
        situation = situationIn;
    }
}
