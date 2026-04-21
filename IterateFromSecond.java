/**Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))**/
import java.util.*;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> listobj = new LinkedList<>();

        listobj.add("Red");
        listobj.add("Blue");
        listobj.add("Green");
        listobj.add("Yellow");

        // Start from index 1 (2nd position)
        ListIterator<String> iteratorobj = listobj.listIterator(1);

        System.out.println("Elements from 2nd position:");
        while (iteratorobj.hasNext()) {
            System.out.println(iteratorobj.next());
        }
    }
}
