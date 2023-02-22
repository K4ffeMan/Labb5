// Viggo Härdelin & Samuel Melander
package labb5.GUI;

import labb5.buttons.BinOpButton;

import javax.swing.*;

public class Situation {
    State state = State.Input1;
    JLabel display;
    BinOpButton binaryOperator;
    int leftOperand;

    Situation(JLabel display){
        this.display = display;
    }

    public enum State{
        Input1, OpReady, Input2, HasResult
    }

    public JLabel getDisplay() {
        return display;
    }

    public int getLeftOperand() {
        return leftOperand;
    }

    public void setLeftOperand(int a) {
        this.leftOperand = a;
    }

    public BinOpButton getBinaryOperator() {
        return binaryOperator;
    }

    public void setBinaryOperator(BinOpButton btn) {
        binaryOperator = btn;
    }

    public State getState() {
        return state;
    }

    public void setState(State stateIn) {
        state = stateIn;
    }
    public void setStateOpReady() {
        state = State.OpReady;
    }

    public void setStateInput2() {
        state = State.Input2;
    }

    public void setStateHasResult() {
        state = State.HasResult;
    }
}
