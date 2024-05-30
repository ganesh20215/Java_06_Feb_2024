package thiskeyword;

public class ThisWithCurrentClassMethod {

    public void method1() {
        System.out.println("method 1");
        this.method2();

    }

    public void method2() {
        System.out.println("method 2");
    }

    public static void method3() {
        System.out.println("method 3");
    }

    public static void main(String[] args) {
        ThisWithCurrentClassMethod thisWithCurrentClassMethod = new ThisWithCurrentClassMethod();
        thisWithCurrentClassMethod.method1();
    }
}
