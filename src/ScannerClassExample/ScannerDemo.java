package ScannerClassExample;


import java.util.Scanner;

public class ScannerDemo {

    public static void addition(int a, int b){
        System.out.println("Addition of two variable " + (a + b));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int no1 = scanner.nextInt();
        System.out.println("Please enter the second number");
        int no2 = scanner.nextInt();

        addition(no1, no2);

    }
}
