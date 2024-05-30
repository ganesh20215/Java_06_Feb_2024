package exceptionalhandling.rules;

public class Rule_10 {

    public static void main(String[] args) {

        //you can use the finally block with a try and catch block

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } finally {
            System.out.println("This is a finally block");
        }
    }
}
