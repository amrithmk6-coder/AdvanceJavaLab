package isertatend;

import java.util.*;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> l_listobj = new LinkedList<>();

        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        l_listobj.offerLast("Pink");

        System.out.println("After inserting at end:");
        System.out.println(l_listobj);
    }
}