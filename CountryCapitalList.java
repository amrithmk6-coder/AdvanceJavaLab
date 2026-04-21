/**
Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list.package swing2;
**/
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalList {
    public static void main(String[] args) {
        JFrame f = new JFrame("Country Capitals");

        String countries[] = {"USA","India","Vietnam","Canada","Denmark",
                              "France","Great Britain","Japan","Africa",
                              "Greenland","Singapore"};

        HashMap<String, String> map = new HashMap<>();
        map.put("USA", "Washington DC");
        map.put("India", "New Delhi");
        map.put("Vietnam", "Hanoi");
        map.put("Canada", "Ottawa");
        map.put("Denmark", "Copenhagen");
        map.put("France", "Paris");
        map.put("Great Britain", "London");
        map.put("Japan", "Tokyo");
        map.put("Africa", "No single capital");
        map.put("Greenland", "Nuuk");
        map.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);
        list.setBounds(50, 50, 200, 200);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String country = list.getSelectedValue();
                System.out.println("Capital: " + map.get(country));
            }
        });

        f.add(list);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
