package basicofjava;

import java.util.Scanner;

public class JavaMethods {

    //public : Access Modifier
    //void : return data type

    /**
     * This is Java Method which doesn't have any parameter
     * Below method doesn't have any paramter
     */
/*    public void addition(){
        System.out.println(30 + 50);
    }*/

    /**
     * This is Java Method with parameter
     */
    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        JavaMethods javaMethods = new JavaMethods();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number");
        int b = scanner.nextInt();
        System.out.println("Addition of two number's");
        javaMethods.addition(a, b);
    }
}
