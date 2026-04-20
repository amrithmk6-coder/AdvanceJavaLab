package colorayyallist;
import java.util.ArrayList;

public class ColorArrayList {
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

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue" (if exists)
        colors.remove("Blue");

        // Display updated list
        System.out.println("Updated ArrayList: " + colors);
    }
}