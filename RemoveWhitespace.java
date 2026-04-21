/**
Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()
    **/
package nullempty;
public class RemoveWhitespace {
    static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "Java is easy to learn";
        System.out.println("Without spaces: " + removeWhitespace(str));
    }
}
