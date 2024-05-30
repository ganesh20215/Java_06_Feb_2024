package exceptionalhandling.rules;

public class Rule_6 {

    public static void main(String[] args) {

        //whenever we don't know which exception we will get the we have use parent class exception.
        // i.e. Exception class we have to use

        String s = null;

        try {
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
