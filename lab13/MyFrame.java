import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class MyFrame implements MouseListener{
    private JFrame jf;
    private MyCount clock;
    private JPanel p;
    private Thread t;
    public MyFrame(){
        jf = new JFrame();
        clock = new MyCount();
        p = new JPanel();
        t = new Thread(clock);
        t.start();
        p.add(clock);
        jf.addMouseListener(this);
        jf.add(p);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("cccccccc");
        if (clock.getPause()){
            clock.repauseThread();
        }else{
            clock.pauseThread();
        }
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
