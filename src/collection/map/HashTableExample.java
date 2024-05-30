package collection.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "Lonavala");
        hashtable.put(2, "Khandala");
        hashtable.put(3, "Mahabhaleshwar");
        hashtable.put(4, "Kas Pathar");
        hashtable.put(5, "Matheran");
        hashtable.put(6, 100.5f);

        System.out.println(hashtable);
/*        for (Map.Entry entry : hashtable.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
    }
}
