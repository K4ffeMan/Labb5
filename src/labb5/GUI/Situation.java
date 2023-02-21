package labb5.GUI;

import javax.swing.*;

public class Situation {
    State state = State.Input1;
    JLabel display;
    BinOpButton binaryOperator;
    int leftOperand;

    Situation(JLabel display){
        this.display = display;
    }

    private enum State{
        Input1, OpReady, Input2, HasResult
    }
}
