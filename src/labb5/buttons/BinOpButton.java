package labb5.buttons;

import labb5.GUI.Situation;

import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton{

    private IntBinaryOperator operator;

    public BinOpButton(String textIn, Situation situationIn, IntBinaryOperator operator) {
        super(textIn, situationIn);


    }

    public int applyAsInt(int a, int b) {
        return operator.applyAsInt(a, b);

        new BinOpButton("*", getSituation(), new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        });
    }

    @Override
    public void transition() {
        Situation situation = getSituation();

        situation.setBinaryOperator(this);
        situation.setStateOpReady();


    }
}
