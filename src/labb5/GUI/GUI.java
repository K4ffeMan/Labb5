package labb5.GUI;
import labb5.buttons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.IntBinaryOperator;


public class GUI extends JFrame {

    JPanel canvas;
    JPanel keypad;
    JLabel display;



    public GUI() {
        Situation situation = new Situation(new JLabel());

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Skapa Canvas (som målarduk i labb 3)
        canvas = new JPanel();
        canvas.setPreferredSize(new Dimension(400, 400));
        canvas.setLayout(new GridBagLayout());
        setContentPane(canvas);


        //Skapa displayen
        display = new JLabel();
        display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        display.setText("0"); // Texten i display ska vara 0 från start.
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font(Font.SERIF, Font.PLAIN, 40));


        //Lägg till Display
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1; constraints.weightx = 1;
        constraints.gridy = 0; constraints.gridx = 0;
        canvas.add(display, constraints);


        //Keypad
        keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 4));

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 9; constraints.weightx = 1;
        constraints.gridy = 1; constraints.gridx = 0;
        canvas.add(keypad, constraints);



        keypad.add(new DigitButton("0", situation));
        keypad.add(new DigitButton("1", situation));
        keypad.add(new DigitButton("2", situation));
        keypad.add(new DigitButton("3", situation));
        keypad.add(new DigitButton("4", situation));
        keypad.add(new DigitButton("5", situation));
        keypad.add(new DigitButton("6", situation));
        keypad.add(new DigitButton("7", situation));
        keypad.add(new DigitButton("8", situation));
        keypad.add(new DigitButton("9", situation));



        //Addtionsknapp
        keypad.add(new BinOpButton("+", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        }));


        //Subtraktionsknapp
        keypad.add(new BinOpButton("-", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left - right;
            }
        }));

        keypad.add(new BinOpButton("*", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        }));

        keypad.add(new BinOpButton("/", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left / right;
            }
        }));

        keypad.add(new CancelButton(situation));

        keypad.add(new EqualsButton("=", situation));


        pack();
        setVisible(true);


    }
}
