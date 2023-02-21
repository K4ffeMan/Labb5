package labb5.buttons;

import labb5.Situation;

import java.util.function.IntBinaryOperator;

public class BinOpButton extends CalculatorButton{

    private IntBinaryOperator operator;

    public BinOpButton(String textIn, Situation situationIn, IntBinaryOperator operator) {
        super(textIn, situationIn);


    }
    
    public int applyAsInt(int a, int b) {
        return operator.applyAsInt(a, b);
    }

    @Override
    public void transition() {

    }
}
