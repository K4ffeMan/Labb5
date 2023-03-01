//Samuel Melander & Viggo Härdelin
package labb5.buttons;

import labb5.GUI.Situation;
import labb5.verktyg.Konstanter;

public class EqualsButton extends CalculatorButton {
    public EqualsButton(Situation situationIn) {
        super("=", situationIn);
    }

    @Override
    public void transition() {
        Situation situation = getSituation();
        switch (situation.getState()) {
            case Input1 -> {}
            case OpReady -> {}
            case Input2 -> {
                int result = situation.getBinaryOperator().applyAsInt(
                        situation.getLeftOperand(),
                        Integer.parseInt(situation.getDisplay().getText()));
                situation.getBinaryOperator().setColor(Konstanter.BUTTON_BORDER_COLOR);
                situation.getDisplay().setText(result + "");
                situation.setState(Situation.State.HasResult);
            }
            case HasResult -> {}
        }
    }
}
