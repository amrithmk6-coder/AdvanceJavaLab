package capital;

public class TruncateString {
    static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    public static void main(String[] args) {
        String str = "Java programming language";
        System.out.println(truncate(str, 10));
    }
}