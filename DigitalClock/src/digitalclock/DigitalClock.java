/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalclock;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 500, 500);
            }
            
        };
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
