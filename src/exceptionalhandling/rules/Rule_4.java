package exceptionalhandling.rules;

public class Rule_4 {

    public static void main(String[] args) {

        //you can use single try block but you can use multiple catch block

        try {
            System.out.println(10 / 0);
        } catch (StringIndexOutOfBoundsException s) {
            s.printStackTrace();
        } catch (NullPointerException n) {
            n.printStackTrace();
        } catch (ArithmeticException a) {
            a.printStackTrace();
        }
    }
}
