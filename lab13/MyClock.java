import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            setFont(new Font("Arial", Font.PLAIN, 90));
            String secp = sec+"";
            String minp = min+"";
            String hourp = hour+"";
            if (sec < 10){
                secp = "0"+sec;
            }
            if (min < 10){
                minp = "0"+min;
            }
            if (hour < 10){
                hourp = "0"+hour;
            }
            setText(hourp+":"+minp+":"+secp);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
