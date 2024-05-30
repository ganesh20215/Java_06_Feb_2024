package exceptionalhandling;

public class UnCheckedException {

    public static void main(String[] args) {

        //UnChecked Exception
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
    }
}
