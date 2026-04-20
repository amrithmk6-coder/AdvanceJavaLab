package romeveNth;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveNthElement {
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

        // Take input for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n) to delete: ");
        int n = sc.nextInt();

        // Check valid range and remove element
        if (n > 0 && n <= colors.size()) {
            colors.remove(n - 1); // convert to 0-based index
            System.out.println("Updated ArrayList: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}