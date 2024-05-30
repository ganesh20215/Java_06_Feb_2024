package oops.abstraction.interfaceexamples.multipleinheritancewithinterface;

public interface Mango {

    void color();
    void taste();
    void size();
    default void fruitMethod(){
        System.out.println("Mango Interface Default Method");
    }
}
