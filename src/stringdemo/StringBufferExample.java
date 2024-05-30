package stringdemo;

public class StringBufferExample {

    public static void main(String[] args) {

        String name = "Shekhar";
        StringBuffer sb = new StringBuffer(name);

//        System.out.println(sb.append(" Nazikar"));

//        System.out.println(sb.insert(2, "Nazikar"));

//        System.out.println(sb.replace(2, 4, "Nazikar"));

//        System.out.println(sb.delete(2, 5));

        System.out.println(sb.reverse());
    }
}
