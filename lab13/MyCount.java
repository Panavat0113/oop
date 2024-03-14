import java.awt.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class MyCount extends JLabel implements Runnable {
    private int sec = 0;
    private int min = 0;
    private int hour = 0;
    private boolean pause = false;
    public boolean getPause(){
        return pause;
    }
    public synchronized void checkpause(){
        while (pause){
            try{
                System.out.println("fffff");
                this.wait();
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public void pauseThread(){
        pause = true;
    }
    public synchronized void repauseThread(){
        pause = false;
        this.notify();
    }
    @Override
    public void run() {
        while (true) {
            checkpause();
            sec += 1;
            if (sec > 60){
                sec = 0;
                min += 1;
            }
            if (min > 60){
                min = 0;
                hour += 1;
            }
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
