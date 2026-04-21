/**
Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed”
depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling
mechanism with addActionListener( ).
    **/
package swing;

import javax.swing.*;
import java.awt.event.*;

public class CountryButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("Country Button");

        JLabel l = new JLabel();
        l.setBounds(100, 50, 300, 30);

        JButton b1 = new JButton("India");
        JButton b2 = new JButton("Srilanka");

        b1.setBounds(50, 100, 100, 30);
        b2.setBounds(200, 100, 100, 30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("India is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Srilanka is pressed");
            }
        });

        f.add(l);
        f.add(b1);
        f.add(b2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
