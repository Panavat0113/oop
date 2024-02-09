import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr1;
    private JButton bn1,bn2,bn3,bn4;
    private JPanel ln1;
    public CalculatorOneGUI(){
        fr1 = new JFrame("CalculatorOneGUI");
        ln1 = new JPanel();
        fr1.setLayout(new GridLayout(4,0));
        ln1.setLayout(new FlowLayout());
        bn1 = new JButton("+");        bn2 = new JButton("-");
        bn3 = new JButton("*");
        bn4 = new JButton("-");
        ln1.add(bn1);        ln1.add(bn2);
        ln1.add(bn3);
        ln1.add(bn4);
        fr1.add(new JTextField());        fr1.add(new JTextField());
        fr1.add(ln1);
        fr1.add(new JTextField());
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.pack();
        fr1.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
