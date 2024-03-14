import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Poring implements Runnable,MouseListener{
    private JFrame jf;
    private JPanel p;
    private JLabel b1, b2;
    private ImageIcon icon;
    private static int num = 1;
    public Poring(){
        jf = new JFrame();
        p = new JPanel(new FlowLayout());
        icon = new ImageIcon("C:\\Users\\Panavat\\Documents\\NetBeansProjects\\lab13\\src\\pong.png");
        b1 = new JLabel();
        b2 = new JLabel(num+"");
        num += 1;
        b1.setIcon(icon);
        p.add(b1);
        p.add(b2);
        p.addMouseListener(this);
        Random random = new Random();
        int x = random.nextInt(1000);
        int y = random.nextInt(1000);
        jf.setLocation(x, y);
        jf.add(p);
        jf.setVisible(true);
        jf.setSize(150,130);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    @Override
    public void run() {
        while (true){
            Random random = new Random();
            int x = jf.getX() + random.nextInt(10) - 5;
            int y = jf.getY() + random.nextInt(10) - 5;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
            jf.setLocation(x, y);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         jf.dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
