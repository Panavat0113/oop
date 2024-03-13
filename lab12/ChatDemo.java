import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame jf;
    private JTextArea texta;
    private JPanel p;
    private JTextField textf;
    private JButton sub, re;
    private String ntext;
    
    public ChatDemo(){
        jf = new JFrame("ChatDemo");
        p = new JPanel(new FlowLayout());
        texta = new JTextArea(20, 45);
        textf = new JTextField(45);
        sub = new JButton("Submit");
        re = new JButton("Reset");
        texta.setEditable(false);
        p.add(texta);
        p.add(textf);
        p.add(sub);
        p.add(re);
        jf.add(p);
        
        jf.addWindowListener(this);
        sub.addActionListener(this);
        re.addActionListener(this);
        
        jf.setVisible(true);
        jf.setSize(520,450);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(sub)) {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ntext = texta.getText()+ date.format(LocalDateTime.now()) + " : " +  textf.getText()+"\n";
            texta.setText(ntext);
            textf.setText("");
        } else if (e.getSource().equals(re)) {
            texta.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("datachat.dat");
        if (f.exists()){
            try (FileInputStream fn = new  FileInputStream("datachat.dat");
                 ObjectInputStream in = new ObjectInputStream(fn);){
                texta.setText((String)in.readObject());
            } catch (IOException i){
                i.printStackTrace();
            } catch (ClassNotFoundException c){
                c.printStackTrace();
            }
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fn = new  FileOutputStream("datachat.dat");
             ObjectOutputStream outt = new ObjectOutputStream(fn);){
            outt.writeObject(texta.getText());
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