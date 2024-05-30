package exceptionalhandling.rules;

public class Rule_14 {

    public static void main(String[] args) {

        //The finally block will not be executed if the program exits (either by calling System.exit()
        // or by causing a fatal error that causes the process to abort).

        try {
            System.exit(0);
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        } finally {
            System.out.println("This is finally block");
        }
    }
}
