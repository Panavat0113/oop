import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StudentView implements ActionListener, WindowListener{
    private JFrame jf;
    private JPanel jptop,main;
    private JTextField txid,txname,txmoney;
    private JButton de,wi;
    private Student std;
    public StudentView(){
        std = new Student();
        jf = new JFrame("");
        jptop = new JPanel(new GridLayout(4,2));
        main = new JPanel(new FlowLayout());
        txid = new JTextField();        txname = new JTextField();
        txmoney = new JTextField();
        de = new JButton("Deposit");
        wi = new JButton("Withdraw");
        
        jptop.add(new JLabel("ID:"));
        jptop.add(txid);
        jptop.add(new JLabel("Name:"));
        jptop.add(txname);
        jptop.add(new JLabel("Money:"));
        jptop.add(txmoney);
        txmoney.setEditable(false);
        de.addActionListener(this);
        wi.addActionListener(this);

        jptop.add(de);
        jptop.add(wi);
        
        jf.addWindowListener(this);
        jf.add(jptop);
        jf.setVisible(true);
        jf.setSize(250,150);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            std.setName(txname.getText());
            std.setID(Integer.parseInt(txid.getText()));
            if (e.getSource().equals(de)) {
                std.setMoney(std.getMoney()+100);
                txmoney.setText(std.getMoney()+"");
            }else if (e.getSource().equals(wi)){
                std.setMoney(std.getMoney()-100);
                txmoney.setText(std.getMoney()+"");
            }
        }catch(NumberFormatException a){   
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("datachat.dat");
        if (f.exists()){
            
            try (FileInputStream fn = new  FileInputStream("StudentM.dat");
                 ObjectInputStream in = new ObjectInputStream(fn);){
                std = (Student) in.readObject();
                txid.setText(std.getID()+"");
                txname.setText(std.getName());
                txmoney.setText(std.getMoney()+"");
            } catch (IOException i){
                i.printStackTrace();
            } catch (ClassNotFoundException c){
                c.printStackTrace();
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fn = new  FileOutputStream("StudentM.dat");
             ObjectOutputStream outt = new ObjectOutputStream(fn);){
            outt.writeObject(std);
        }catch (IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
