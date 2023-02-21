import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;



class GUI extends JFrame implements ActionListener {
    private static JTextField inputBox;
    private static void display(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI(frame);

        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null); //Centrerar miniräknaren (förhoppningsvis)
        frame.pack();
        frame.setVisible(true);


    }
    private static void createUI(JFrame frame){
        JPanel panel = new JPanel();
        GUI calculator = new GUI();


        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setLayout(layout);

        inputBox = new JTextField(10);
        inputBox.setEditable(false);

        



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
