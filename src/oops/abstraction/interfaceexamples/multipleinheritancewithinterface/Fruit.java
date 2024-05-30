package oops.abstraction.interfaceexamples.multipleinheritancewithinterface;

public interface Fruit {

    void color();
    void taste();
    void size();
    default void fruitMethod(){
        System.out.println("Fruit Interface Default Method");
    }
}
