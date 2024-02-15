import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr1;
    private JButton bn1,bn2,bn3;
    private JPanel ln1,ln2,ln3;
    private Account money;
    private JLabel balance,amount;
    private JTextField maxmoney,keep;
    public TellerGUI(){
        fr1 = new JFrame("Teller GUI");
        money = new Account(6000,"tt");
        ln1 = new JPanel();
        ln2 = new JPanel();
        ln3 = new JPanel();

        bn1 = new JButton("Deposit");
        bn2 = new JButton("Withdraw");
        bn3 = new JButton("Exit");
        
        balance = new JLabel(" Balance");
        
        amount = new JLabel(" Amount");
        
        maxmoney = new JTextField(money.getBalance()+"");
        maxmoney.setEditable(false);
        keep = new JTextField();   
        ln1.setLayout(new GridLayout(1,2));
        ln1.add(balance);
        ln1.add(maxmoney);
        
        ln2.setLayout(new GridLayout(1,2));
        ln2.add(amount);
        ln2.add(keep);
        
        ln3.setLayout(new FlowLayout());
        ln3.add(bn1);
        ln3.add(bn2);
        ln3.add(bn3);
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
                
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bn1)){
           money.withdraw(Integer.parseInt(keep.getText()));
        } else if (e.getSource().equals(bn2)){
           money.deposit(Integer.parseInt(keep.getText()));  
        }
        maxmoney.setText(money.getBalance()+"");
        keep.setText("");
    }
}
