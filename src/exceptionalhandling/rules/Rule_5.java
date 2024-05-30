package exceptionalhandling.rules;

public class Rule_5 {

    public static void main(String[] args) {

        //If we are having multiple statement in the try block ex 3 statement
        // but we got the error on the 2 statement so, try block will be terminate
        // and our 3rd statement won't be executed.

        try {
            System.out.println("Hello Everyone");
            System.out.println("Good Morning");
            System.out.println(10/0);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("How Are you?");
    }
}
