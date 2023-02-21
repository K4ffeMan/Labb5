package labb5.buttons;

import labb5.GUI.Situation;
import labb5.verktyg.Konstanter;

import java.awt.*;
import java.awt.event.ActionEvent;

public class CancelButton extends CalculatorButton {
    public CancelButton(Situation situationIn) {
        super("C", situationIn);
    }

    @Override
    public void transition() {
        Situation situation = getSituation();

        situation.getDisplay().setText("0");
        situation.resetState();
        situation.getBinaryOperator().setColor(Konstanter.BUTTON_BORDER_COLOR);
    }
}
