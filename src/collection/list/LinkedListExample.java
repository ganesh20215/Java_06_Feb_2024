package collection.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("Rahul");
        linkedList.add(null);
        linkedList.add("Vishal");
        linkedList.add("Chetan");
        linkedList.add("Sana");
        linkedList.add("Sujata");
        linkedList.add("Chetan");
        linkedList.add(100);
        linkedList.add(null);

        //linkedList.addLast("Shivam");

        linkedList.removeLast();

        System.out.println(linkedList);
    }
}
