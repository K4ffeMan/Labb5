//Viggo Härdelin & Samuel Melander
package labb5.buttons;

import labb5.GUI.*;
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
        switch (situation.getState()) {
            case Input1 -> reset(situation);
            case OpReady -> reset(situation);
            case Input2 -> reset(situation);
            case HasResult -> reset(situation);
        }
    }

    private void reset(Situation situation) {
        resetDisplay();
        situation.setState(Situation.State.Input1);
        resetOperator();
    }
}
