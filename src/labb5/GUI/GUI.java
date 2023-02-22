// Viggo Härdelin & Samuel Melander
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
        super("Calculator");

//        JFrame frame = new JFrame("Calculator");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); eftersom GUI extendar jframe tror jag inte vi behöver skapa en ny.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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

        // skapa situation med displayen
        Situation situation = new Situation(display);

        //Lägg till Display
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        //Specifies how to distribute extra horizontal and vertical space.
        constraints.weighty = 1; constraints.weightx = 1;

        //Specifies the cell containing the leading edge of the component's display area, where the first cell in a row has gridx=0.
        //Specifies the cell at the top of the component's display area, where the topmost cell has gridy=0.
        constraints.gridy = 0; constraints.gridx = 0;
        canvas.add(display, constraints);


        //Keypad
        keypad = new JPanel();
        keypad.setLayout(new GridLayout(4, 4));

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 9; constraints.weightx = 1;
        constraints.gridy = 1; constraints.gridx = 0;
        canvas.add(keypad, constraints);


        //-----Lägg till knappar.

        keypad.add(new DigitButton("7", situation));
        keypad.add(new DigitButton("8", situation));
        keypad.add(new DigitButton("9", situation));
        keypad.add(new BinOpButton("/", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left / right;
            }
        }));
        keypad.add(new DigitButton("4", situation));
        keypad.add(new DigitButton("5", situation));
        keypad.add(new DigitButton("6", situation));
        keypad.add(new BinOpButton("*", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        }));
        keypad.add(new DigitButton("1", situation));
        keypad.add(new DigitButton("2", situation));
        keypad.add(new DigitButton("3", situation));
        keypad.add(new BinOpButton("-", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left - right;
            }
        }));
        keypad.add(new DigitButton("0", situation));
        keypad.add(new EqualsButton(situation));
        keypad.add(new CancelButton(situation));
        keypad.add(new BinOpButton("+", situation, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        }));
        pack();
        setVisible(true);
    }
}
