
import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Programming': " + text.indexOf("Programming"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        System.out.println("\nSubstring (0 to 4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));

        String modified = text.replace("Java", "Python");
        System.out.println("\nAfter replace: " + modified);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        String strWithSpaces = "   Hello Java   ";
        System.out.println("\nBefore trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        String concat = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + concat);

        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("\nSplitting sentence:");
        for (String word : words) {
            System.out.println(word);
        }

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("\nStringBuilder Result: " + sb);

        String name = "Amrith";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("\nFormatted String: " + formatted);

        String email = "example@gmail.com";

        if (email.contains("@") && 
            email.startsWith("example") && 
            email.endsWith(".com")) {

            System.out.println("\nValid Email: " + email);
        } else {
            System.out.println("\nInvalid Email: " + email);
        }
    }
}