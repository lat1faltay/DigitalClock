/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalclock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ELEYSEC
 */
public class DigitalClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Modern Clock");
        frame.setBounds(10,10,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pencere işaretçilerini kapatma için kullanılmaktadır
        frame.setUndecorated(true);
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics g2) {
                Graphics2D g = (Graphics2D)g2.create();
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 500, 500);
                g.setColor(Color.white);
                String time = LocalTime.now().getHour()+":"+LocalTime.now().getMinute();
                g.setFont(new Font("fira sans", 0,110));
                g.drawString(time, 250-g.getFontMetrics().stringWidth(time)/2, 150);
            }
            
        };
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
