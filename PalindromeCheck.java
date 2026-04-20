package nullempty;

public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Madam, I'm Adam";

        if (isPalindrome(str)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}