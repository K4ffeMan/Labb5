//Viggo Härdelin & Samuel Melander
package labb5.buttons;

import labb5.GUI.Situation;
import labb5.verktyg.Konstanter;

import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton{

    private final IntBinaryOperator operator;

    public BinOpButton(String textIn, Situation situationIn, IntBinaryOperator operatorIn) {
        super(textIn, situationIn);
        operator = operatorIn;

    }

    public int applyAsInt(int a, int b) {
        return operator.applyAsInt(a, b);


    }

    @Override
    public void transition() {
        Situation situation = getSituation();

        resetOperator();
        setColor(Konstanter.BUTTON_ACTIVE_COLOR);

        situation.setBinaryOperator(this);
        if (situation.getState() != Situation.State.Input2) {
            situation.setState(Situation.State.OpReady);
            String current = situation.getDisplay().getText();
            int left = Integer.parseInt(current);
            situation.setLeftOperand(left);
        }
    }
}
