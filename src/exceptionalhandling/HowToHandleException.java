package exceptionalhandling;

public class HowToHandleException {

    public static void main(String[] args) {

        System.out.println("Good Morning");
        try {
            System.out.println(10/0);
        }catch (ArithmeticException a){
            a.printStackTrace();
        }
        System.out.println("How Are you???");
    }
}
