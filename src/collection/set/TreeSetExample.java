package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        treeSet.add("Anushka");
        treeSet.add("Ashwini");
        treeSet.add("Virendra");
        treeSet.add("Pooja");
        treeSet.add("Shivam");
//        treeSet.add(null);
        treeSet.add("Mohammad");

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
