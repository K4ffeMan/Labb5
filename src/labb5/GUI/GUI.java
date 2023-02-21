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
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        jpanel.setLayout(layout);

        inputBox = new JTextField(10); // antalet columns
        inputBox.setEditable(false); // Gör text inputs non editable.

        BinOpButton plusKnapp = new BinOpButton("+", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left+right;
            }
        });
        BinOpButton minusKnapp = new BinOpButton("-", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left-right;
            }
        });
        BinOpButton multiKnapp = new BinOpButton("*", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        });
        BinOpButton divKnapp = new BinOpButton("/", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left/right;
            }
        });

        CancelButton clearKnapp = new CancelButton(situation);


        JButton knapp0 = new JButton("0");
        JButton kanpp1 = new JButton("1");
        JButton kanpp2 = new JButton("2");
        JButton knapp3 = new JButton("3");
        JButton kanpp4 = new JButton("4");
        JButton kanpp5 = new JButton("5");
        JButton knapp6 = new JButton("6");
        JButton knapp7 = new JButton("7");
        JButton knapp8 = new JButton("8");
        JButton knapp9 = new JButton("9");



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
