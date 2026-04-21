/**
Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).
    **/
package swing;
import javax.swing.*;
import java.awt.event.*;

public class ImageButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Button");

        JLabel l = new JLabel();
        l.setBounds(100, 50, 300, 30);

        ImageIcon clock = new ImageIcon("clock.png");
        ImageIcon hourglass = new ImageIcon("hourglass.png");

        JButton b1 = new JButton("Digital Clock", clock);
        JButton b2 = new JButton("Hour Glass", hourglass);

        b1.setBounds(50, 100, 200, 50);
        b2.setBounds(50, 170, 200, 50);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Hour Glass is pressed");
            }
        });

        f.add(l);
        f.add(b1);
        f.add(b2);

        f.setSize(350, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
