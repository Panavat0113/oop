import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr1;
    private JButton bn1,bn2,bn3;
    private JPanel ln1,ln2,ln3;
    private JLabel balance,amount;
    private JTextField maxmoney;
    public TellerGUI(){
        fr1 = new JFrame("Teller GUI");
        
        ln1 = new JPanel();
        ln2 = new JPanel();
        ln3 = new JPanel();

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        balance = new JLabel(" Balance");
        
        amount = new JLabel(" Amount");
        
        maxmoney = new JTextField("6000");
        maxmoney.setEditable(false);
        
        ln1.setLayout(new GridLayout(1,2));
        ln1.add(balance);
        ln1.add(maxmoney);
        
        ln2.setLayout(new GridLayout(1,2));
        ln2.add(amount);
        ln2.add(new JTextField());
        
        ln3.setLayout(new FlowLayout());
        ln3.add(bn1);
        ln3.add(bn2);
        ln3.add(bn3);
        
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setLayout(new GridLayout(4,0));
        fr1.add(ln1);
        fr1.add(ln2);        fr1.add(ln3);
        fr1.pack();
        fr1.setVisible(true);
    }
    public static void main(String[] args) {
 new TellerGUI();
 }
}
