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
import java.time.LocalDate;
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
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        JFrame frame = new JFrame("Modern Clock");
        frame.setBounds(250,250,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // pencere işaretçilerini kapatma için kullanılmaktadır
        //frame.setUndecorated(true);
        //frame.setSize(100, 100);
        frame.setResizable(false);
        JPanel panel = new JPanel(){
            @Override
            public void paint(Graphics g2) {
                Graphics2D g = (Graphics2D)g2.create();
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 500, 500);
                g.setColor(Color.white);
                String time = String.format("%02d", LocalTime.now().getHour())+":"+String.format("%02d", LocalTime.now().getMinute())+":"+String.format("%02d", LocalTime.now().getSecond());
                g.setFont(new Font("fira sans", 0,110));
                g.drawString(time, 250-g.getFontMetrics().stringWidth(time)/2, 150);
                String m = LocalDate.now().getMonth().toString();
                String date = m.charAt(0)+m.substring(1, m.length()).toLowerCase()+ " " + String.format("%02d", LocalDate.now().getDayOfMonth())+ " " +LocalDate.now().getYear();
                g.setFont(new Font("fira sans", 0,40));
                g.drawString(date, 250-g.getFontMetrics().stringWidth(date)/2, 200);
                
            }
            
        };
        frame.add(panel);
        frame.setVisible(true);
        while(true){
            frame.repaint();
            Thread.sleep(1000);
        }
    }
    
}
