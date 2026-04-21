/**
Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
whenever the countries are selected on the list.
    **/
package swing2;

import javax.swing.*;
import javax.swing.event.*;

public class CountryList {
    public static void main(String[] args) {
        JFrame f = new JFrame("Country List");

        String countries[] = {"USA","India","Vietnam","Canada","Denmark",
                              "France","Great Britain","Japan","Africa",
                              "Greenland","Singapore"};

        JList<String> list = new JList<>(countries);
        list.setBounds(50, 50, 200, 200);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                System.out.println("Selected: " + list.getSelectedValue());
            }
        });

        f.add(list);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
