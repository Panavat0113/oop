import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr1;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
    private JPanel ln1;
    public CalculatorTwoGUI(){
        fr1 = new JFrame("CalculatorTwoGUI");
        ln1 = new JPanel();
        fr1.setLayout(new BorderLayout());
        ln1.setLayout(new GridLayout(4,4));
        bn1 = new JButton("7");        bn2 = new JButton("8");
        bn3 = new JButton("9");        bn4 = new JButton("+");
        bn5 = new JButton("4");        bn6 = new JButton("5");
        bn7 = new JButton("6");        bn8 = new JButton("-");
        bn9 = new JButton("1");        bn10 = new JButton("2");
        bn11 = new JButton("3");       bn12 = new JButton("x");
        bn13 = new JButton("0");       bn14 = new JButton("c");
        bn15 = new JButton("=");       bn16 = new JButton("/");
        ln1.add(bn1);
        ln1.add(bn2);
        ln1.add(bn3);
        ln1.add(bn4);
        ln1.add(bn5);
        ln1.add(bn6);
        ln1.add(bn7);
        ln1.add(bn8);
        ln1.add(bn9);
        ln1.add(bn10);
        ln1.add(bn11);
        ln1.add(bn12);
        ln1.add(bn13);
        ln1.add(bn14);
        ln1.add(bn15);
        ln1.add(bn16);
        fr1.add(new JTextField(), BorderLayout.NORTH);
        fr1.add(ln1);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.pack();
        fr1.setVisible(true);
    }
     public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
