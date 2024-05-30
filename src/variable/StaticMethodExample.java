package variable;

public class StaticMethodExample {

    int a = 10;
    static int b = 20;


    public static void staticMet(){
        System.out.println("Static Method");
        //System.out.println(a);
        System.out.println(b);
    }

    public void nonStaticMethod(){
        System.out.println("Non Static Method");
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        StaticMethodExample staticMethodExample = new StaticMethodExample();
        staticMethodExample.nonStaticMethod();
        staticMet();
    }
}
