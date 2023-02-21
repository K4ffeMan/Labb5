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

    private enum State{
        Input1, OpReady, Input2, HasResult
    }

    public JLabel getDisplay() {
        return display;
    }

    public void setLeftOperand(int a) {
        this.leftOperand = a;
    }

    public BinOpButton getBinaryOperator() {
        return binaryOperator;
    }

    public State getState() {
        return state;
    }

    public void resetState() {
        state = State.Input1;
    }

    public void moveState() {
        // flytta state ett steg till höger
    }
}
