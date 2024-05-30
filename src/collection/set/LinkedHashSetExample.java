package collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add("vikram");
        linkedHashSet.add("Sadashiv");
        linkedHashSet.add(10.5f);
        linkedHashSet.add("Sana");
        linkedHashSet.add(null);
        linkedHashSet.add("Sujata");
        linkedHashSet.add("Sushil");
        linkedHashSet.add("Shekhar");
        linkedHashSet.add("vikram");
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }
}
