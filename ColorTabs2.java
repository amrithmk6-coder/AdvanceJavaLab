package swing2;

import javax.swing.*;
import java.awt.*;

public class ColorTabs2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Tabs CMY");

        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.setBackground(Color.CYAN);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.MAGENTA);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.YELLOW);

        tab.addTab("CYAN", p1);
        tab.addTab("MAGENTA", p2);
        tab.addTab("YELLOW", p3);

        f.add(tab);
        f.setSize(400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}