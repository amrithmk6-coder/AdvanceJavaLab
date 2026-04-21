/**
Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()
**/
package capital;

public class CapitalizeWords {
    static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String str = "java is easy to learn";
        System.out.println(capitalizeWords(str));
    }
}
