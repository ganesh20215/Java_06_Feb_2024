package oops.abstraction.interfaceexamples.multipleinheritancewithinterface;

public class ImplementedDemoClass implements Fruit, Mango{
    @Override
    public void color() {
        System.out.println("color is yellow");
    }

    @Override
    public void taste() {
        System.out.println("Taste is sweet");
    }

    @Override
    public void size() {
        System.out.println("Size is medium");
    }

    @Override
    public void fruitMethod() {
        Fruit.super.fruitMethod();
        Mango.super.fruitMethod();
    }

    public static void main(String[] args) {
        ImplementedDemoClass implementedDemoClass = new ImplementedDemoClass();
        implementedDemoClass.color();
        implementedDemoClass.size();
        implementedDemoClass.taste();
        implementedDemoClass.fruitMethod();
    }
}
