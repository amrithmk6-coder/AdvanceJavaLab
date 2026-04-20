import java.util.ArrayList;

public class ColorSearch {
    public static void main(String[] args) {

        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display the colors
        System.out.println("List of Colors: " + colors);

        // Search for "Red"
        if (colors.contains("Red")) {
            System.out.println("Red color is available in the list.");
        } else {
            System.out.println("Red color is not available in the list.");
        }
    }
}