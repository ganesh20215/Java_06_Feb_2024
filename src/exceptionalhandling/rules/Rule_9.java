package exceptionalhandling.rules;

public class Rule_9 {

    public static void main(String[] args) {

        //we can define try block without catch block, but we must need to use finally block
        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("This is a finally block");
        }
    }
}
