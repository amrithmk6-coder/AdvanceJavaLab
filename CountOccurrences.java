package nullempty;
public class CountOccurrences {
    static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String mainStr = "Java is fun, Java is powerful";
        String subStr = "Java";

        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }
}