/**Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))**/
package swapelements;

import java.util.*;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<>();

        l_list.add("Red");
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");

        Collections.swap(l_list, 0, 2);

        System.out.println("After swapping 1st and 3rd elements:");
        System.out.println(l_list);
    }
}
