package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        //Integer -> Key && String -> Value
        HashMap<Integer, String>  hashMap = new HashMap<>();
        hashMap.put(1, "Lonavala");
        hashMap.put(2, "Khandala");
        hashMap.put(3, "Mahabhaleshwar");
        hashMap.put(4, "Kas Pathar");
        hashMap.put(5, "Matheran");
        hashMap.put(6, "Lonavala");
        hashMap.put(1, "Alibag");
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, "Kalsubai");
        hashMap.put(null, null);

/*        Iterator iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for (Map.Entry entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
