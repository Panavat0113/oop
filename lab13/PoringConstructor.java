
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener{
    private JFrame jf;
    private JPanel p;
    private JButton b1;
    public PoringConstructor(){
        jf = new JFrame();
        p = new JPanel();
        b1 = new JButton("Add");
        b1.addActionListener(this);
        p.add(b1);
        jf.add(p);
        jf.setVisible(true);
        jf.setLocation(500, 500);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public static void main(String[] args) {
    try {
        // Set Look and Feel
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
        e.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
        PoringConstructor frame = new PoringConstructor() ;
    });
}
    @Override
    public void actionPerformed(ActionEvent e) {
         Poring test = new Poring();
         Thread t1 = new Thread(test);
         t1.start();
    }
}
