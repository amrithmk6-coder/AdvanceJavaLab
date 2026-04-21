/**
Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
the concerned color whenever the specific tab is selected in the Pan.
    **/
package swing2;

import javax.swing.*;
import java.awt.*;

public class ColorTabs1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Tabs");

        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.GREEN);

        tab.addTab("RED", p1);
        tab.addTab("BLUE", p2);
        tab.addTab("GREEN", p3);

        f.add(tab);
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
