/**Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().**/
package nullempty;

import java.util.*;

public class NullOrEmptyCheck {
    static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String str = " Amrith  ";
        if (isNullOrEmpty(str)) {
            System.out.println("String is null or empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}
