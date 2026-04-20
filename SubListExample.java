package sublist;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original ArrayList: " + colors);

        // Extract 1st and 2nd elements (index 0 to 2)
        List<String> subColors = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted elements (1st and 2nd): " + subColors);
    }
}