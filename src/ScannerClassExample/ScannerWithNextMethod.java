package ScannerClassExample;

import java.util.Scanner;

public class ScannerWithNextMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first String");
        String name1 = scanner.next();
        System.out.println("Please enter the second String");
        String name2 = scanner.next();

        System.out.println(name1 +" " + name2);
    }
}
