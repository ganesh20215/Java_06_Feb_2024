package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add("vikram");
        hashSet.add("Sadashiv");
        hashSet.add(10.5f);
        hashSet.add("Sana");
        hashSet.add(null);
        hashSet.add("Sujata");
        hashSet.add("Sushil");
        hashSet.add("Shekhar");
        hashSet.add("vikram");
        hashSet.add(null);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
