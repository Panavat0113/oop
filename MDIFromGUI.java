import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane frmain;
    private JInternalFrame fr1,fr2,fr3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, msi1, msi2;
    public MDIFromGUI() {
        frmain = new JDesktopPane();
        fr = new JFrame();
        fr1 = new JInternalFrame("Application 01",true,true,true,true);
        fr2 = new JInternalFrame("Application 02",true,true,true,true);
        fr3 = new JInternalFrame("Application 03",true,true,true,true);
        
        fr1.pack();
        fr1.setVisible(true);
        
        fr2.pack();
        fr2.setVisible(true);
        
        fr3.pack();
        fr3.setVisible(true);

        fr2.setLocation(fr1.getX() + fr1.getWidth() + 10, fr1.getY());
        
        fr3.setLocation(fr2.getX() + fr2.getWidth() + 10, fr2.getY());

        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        ms1 = new JMenu("New");
        mi1 = new JMenuItem("Open");
        mi2 = new JMenuItem("Save");
        mi3 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(ms1);
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        
        frmain.add(fr1);
        frmain.add(fr2);
        frmain.add(fr3);
        
        fr.add(frmain, BorderLayout.CENTER);
        fr.setSize(300, 300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setJMenuBar(mb);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {MDIFromGUI frame = new MDIFromGUI();});
        new MDIFromGUI();
    }
}
