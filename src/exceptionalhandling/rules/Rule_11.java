package exceptionalhandling.rules;

public class Rule_11 {

    public static void main(String[] args) {

        //Finally block still executing if you don't handle the exception

        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("This is a finally block");
        }
    }
}
