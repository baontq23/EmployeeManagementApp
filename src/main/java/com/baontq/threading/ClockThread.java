package com.baontq.threading;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author MSI
 */
public class ClockThread extends Thread {

    private JLabel lbl;

    public ClockThread(JLabel lbl) {
        this.lbl = lbl;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH : mm");
        while (true) {
            Date now = new Date();
            String st = sdf.format(now);

            lbl.setText(st);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
