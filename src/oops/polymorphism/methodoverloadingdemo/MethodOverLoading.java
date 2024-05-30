package oops.polymorphism.methodoverloadingdemo;

public class MethodOverLoading {

    //1. method overloading means same method name with different parameter
    //2. method overloading always happen within a single class
    //3. We can achieve method overloading by changing the number of parameter
    //4. We can achieve method overloading by changing the datatype of parameter
    //5. we can't achieve method overloading by changing the return type of method
    //6. We can overload static method
    //7. we can overload java main method


    public void addition(int a, int b) {
        System.out.println(a + b);
    }

    public void addition(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void addition(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public void addition(int a, float b) {
        System.out.println(a + b);
    }

/*
    public int addition(int a, float b) {
        System.out.println(a + b);
    }
*/

    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    public static void multiplication(int x, int y, int z) {
        System.out.println(x * y * z);
    }

    public static void main(String[] args) {
        MethodOverLoading methodOverLoading = new MethodOverLoading();
        methodOverLoading.addition(10, 20);
        methodOverLoading.addition(30, 40, 50);
        methodOverLoading.addition(60, 70.5f);
        multiplication(100, 200);
        multiplication(300, 400, 500);
    }

    public static void main(String[] args, int b) {

    }
}
