package oops.polymorphism.methodoverridingdemo;

public class Son extends FatherMother{

    //1. Method Overriding means same method and same in signature/parameter
    //2. method Overriding always happen in parent and child class
    /*3. Whenever child class doesn't like implementation provided by parent class and child class want to define
         their own implementation that time method overriding is happening*/
    //4. We can't achieve method overriding by changing the number of parameter
    //5. We can't achieve method overriding by changing the datatype of the parameter
    //6. We can't achieve method overriding by changing the return type of the method
    //7. We can't override static method in Java
    //8. We can't override main method in Java

/*    @Override
    public void education(int a) {
        System.out.println("My son will be an Doctor.");
    }*/

/*    @Override
    public void education(float a) {
        System.out.println("My son will be an Doctor.");
    }*/

/*    @Override
    public int education() {
        System.out.println("My son will be an Doctor.");
    }*/

    @Override
    public void education() {
        System.out.println("My son will be an Doctor.");
    }

    public static void demo1(){
        System.out.println("demo 1");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.education();
    }
}
