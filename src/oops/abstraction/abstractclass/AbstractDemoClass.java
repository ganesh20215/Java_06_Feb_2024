package oops.abstraction.abstractclass;

public abstract class AbstractDemoClass {

    //Abstract classes allow 0 to 100% abstraction (partial to complete abstraction)
    //It can have abstract and non-abstract methods (method with the body).

    int a;

    AbstractDemoClass(int x){
        a = x;
        System.out.println(a);
    }

    public abstract void abstractMethodExample();       //abstract method

    public static void staticMethodExample(){
        System.out.println("Static Method Example");
    }

    public final void checkFinalMethod(){
        System.out.println("check Final Method");
    }

    public void concreteMethod(){           //Concrete/Normal method
        System.out.println("Concrete Method");
    }

    public static void main(String[] args) {
//        AbstractDemoClass abstractDemoClass = new AbstractDemoClass();
    }
}
