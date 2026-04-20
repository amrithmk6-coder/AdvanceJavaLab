package reverseiteration;
import java.util.*;

public class ReverseIteration {
    public static void main(String[] args) {
        LinkedList<String> objlist = new LinkedList<>();

        objlist.add("Red");
        objlist.add("Blue");
        objlist.add("Green");
        objlist.add("Yellow");

        System.out.println("Reverse order:");
        Iterator<String> itr = objlist.descendingIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}