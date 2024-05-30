package exceptionalhandling.rules;

public class Rule_12 {

    public static void main(String[] args) {

        //Finally is going execute if you handle the exception

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } finally {
            System.out.println("This is a finally block");
        }
    }
}
