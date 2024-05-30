package stringdemo;

public class StringNewKeyword {

    public static void main(String[] args) {

        //String Object always store in a heap memory

        String company1 = new String("Edso Services");
        String company2 = new String("Edso Services");

        System.out.println(company1 == company2);
        System.out.println(company1.equals(company2));
    }
}
