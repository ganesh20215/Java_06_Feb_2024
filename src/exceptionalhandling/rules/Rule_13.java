package exceptionalhandling.rules;

public class Rule_13 {

    public static void main(String[] args) {

        //If you don't get any exception still your finally block is executing

        try {
            System.out.println(10/10);
        }finally {
            System.out.println("This is finally block");
        }
    }
}
