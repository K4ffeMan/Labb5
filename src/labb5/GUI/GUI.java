package labb5.GUI;

import labb5.buttons.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.function.IntBinaryOperator;


public class GUI extends JFrame implements ActionListener {

    Situation situation = new Situation(new JLabel());
    private static JTextField inputBox;
    private void display(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        UI(frame);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); //Centrerar miniräknaren (förhoppningsvis)
        //frame.pack();
        frame.setVisible(true);


    }

    private void UI(JFrame frame){
        JPanel jpanel = new JPanel();
        GUI gui = new GUI();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        jpanel.setLayout(layout);

        inputBox = new JTextField(10); // antalet columns
        inputBox.setEditable(false); // Gör text inputs non editable.


        //Knappen för addition (+)
        BinOpButton plusKnapp = new BinOpButton("+", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left+right;
            }
        });

        //Knappen för subtraktion(-)
        BinOpButton minusKnapp = new BinOpButton("-", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left-right;
            }
        });

        // Knappen för multiplikation (*)
        BinOpButton multiKnapp = new BinOpButton("*", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        });
        // (/) knappen för division
        BinOpButton divKnapp = new BinOpButton("/", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left/right;
            }
        });

        // C (clear) knappen
        CancelButton clearKnapp = new CancelButton(situation);

        //Lika med knapp (=)
        EqualsButton likaMedKnapp = new EqualsButton("=", situation);

        //Siffrorna 0-9 knapparna
        DigitButton knapp0 = new DigitButton("0", situation);
        DigitButton knapp1 = new DigitButton("1", situation);
        DigitButton knapp2 = new DigitButton("2", situation);
        DigitButton knapp3 = new DigitButton("3", situation);
        DigitButton kanpp4 = new DigitButton("4", situation);
        DigitButton knapp5 = new DigitButton("5", situation);
        DigitButton knapp6 = new DigitButton("6", situation);
        DigitButton knapp7 = new DigitButton("7", situation);
        DigitButton knapp8 = new DigitButton("8", situation);
        DigitButton knapp9 = new DigitButton("9", situation);

        plusKnapp.addActionListener(gui);
        minusKnapp.addActionListener(gui);
        divKnapp.addActionListener(gui);
        multiKnapp.addActionListener(gui);
        clearKnapp.addActionListener(gui);
        knapp0.addActionListener(gui);
        knapp1.addActionListener(gui);
        knapp2.addActionListener(gui);
        knapp3.addActionListener(gui);
        kanpp4.addActionListener(gui);
        knapp5.addActionListener(gui);
        knapp6.addActionListener(gui);
        knapp7.addActionListener(gui);
        knapp8.addActionListener(gui);
        knapp9.addActionListener(gui);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
