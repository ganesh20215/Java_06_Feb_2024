package ScannerClassExample;

import java.util.Scanner;

public class ScannerWithString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first String");
        String name1 = scanner.nextLine();
        System.out.println("Please enter the second String");
        String name2 = scanner.nextLine();

        System.out.println(name1 +" " + name2);
    }
}
