import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorSample implements ActionListener{
    private JFrame fr1;
    private JTextField tx1;
    private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
    private JPanel ln1;
    private Double sum = 0.0;
    private String num = "",operator="",che="";
    public CalculatorSample(){
        fr1 = new JFrame("CalculatorTwoGUI");
        ln1 = new JPanel();
        tx1 = new JTextField();
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
        
        bn4.addActionListener(this);
        bn8.addActionListener(this);
        bn12.addActionListener(this);
        bn16.addActionListener(this);
        
        bn1.addActionListener(this);//7
        bn2.addActionListener(this);//8
        bn3.addActionListener(this);//9
        bn5.addActionListener(this);//4
        bn6.addActionListener(this);//5
        bn7.addActionListener(this);//6
        bn9.addActionListener(this);//1
        bn10.addActionListener(this);//2
        bn11.addActionListener(this);//3
        bn13.addActionListener(this);//0
        
        bn14.addActionListener(this);//c
        bn15.addActionListener(this);//=


                
        
        fr1.add(tx1, BorderLayout.NORTH);
        fr1.add(ln1);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr1.setSize(300,300);
        fr1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bn1)){
            tx1.setText(num+"7");
            num += "7";
        } else if (e.getSource().equals(bn2)){
            tx1.setText(num+"8");
            num += "8";
        } else if (e.getSource().equals(bn3)){
            tx1.setText(num+"9");
            num += "9";
        } else if (e.getSource().equals(bn5)){
            tx1.setText(num+"4");
            num += "4";
        } else if (e.getSource().equals(bn6)){
            tx1.setText(num+"5");
            num += "5";
        } else if (e.getSource().equals(bn7)){
            tx1.setText(num+"6");
            num += "6";
        } else if (e.getSource().equals(bn9)){
            tx1.setText(num+"1");
            num += "1";
        } else if (e.getSource().equals(bn10)){
            tx1.setText(num+"2");
            num += "2";
        } else if (e.getSource().equals(bn11)){
            tx1.setText(num+"3");
            num += "3";
        } else if (e.getSource().equals(bn13)){
            tx1.setText(num+"0");
            num += "0";
        } else if (e.getSource().equals(bn14)){
            sum = 0.0;
            operator="";
            tx1.setText("");
        } else if (e.getSource().equals(bn4)){
            if (che.equals("1")){
                this.result();
            }else{
                sum = Double.valueOf(num);
            }
            operator = "+";
            tx1.setText("");
            num = "";
            che = "1";
        } else if (e.getSource().equals(bn8)){
            if (che.equals("1")){
                this.result();
            }else{
                sum = Double.valueOf(num);
            }
            operator = "-";
            tx1.setText("");
            num = "";
            che = "1";
        } else if (e.getSource().equals(bn12)){
            System.out.println("fff");
            if (che.equals("1")){
                this.result();
            }else{
                sum = Double.valueOf(num);
            }
            operator = "*";
            tx1.setText("");
            num = "";
            che = "1";
        } else if (e.getSource().equals(bn16)){
            if (che.equals("1")){
                this.result();
            }else{
                sum = Double.valueOf(num);
            }
            operator = "/";
            tx1.setText("");
            num = "";
            che = "1";
        } else if (e.getSource().equals(bn15)){
            this.result();
            tx1.setText(sum+"");
            num = "";
            operator = "";
            sum = 0.0;
            che = "";
        }
    }
    public void result(){
        if (operator.equals("+")){
            sum += Double.parseDouble(num);
        } else if (operator.equals("-")){
            sum -= Double.parseDouble(num);
        } else if (operator.equals("*")){
            sum *= Double.parseDouble(num);
        } else if (operator.equals("/")){
            sum /= Double.parseDouble(num);
        }
    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
}
