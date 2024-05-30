package collection.list;

import java.util.ArrayList;


public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();      //initial capacity 10

        arrayList.add("Anushaka");
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(true);
        arrayList.add('c');
        arrayList.add(100.5f);
        arrayList.add("Anushaka");
        arrayList.add(null);

/*        System.out.println(arrayList.size());

        System.out.println(arrayList.get(0));*/

/*        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for (int i = 0; i <= arrayList.size() - 1; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
