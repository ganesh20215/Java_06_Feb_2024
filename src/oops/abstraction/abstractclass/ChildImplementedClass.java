package oops.abstraction.abstractclass;

public class ChildImplementedClass extends AbstractDemoClass{

    ChildImplementedClass(int x) {
        super(x);
    }

    @Override
    public void abstractMethodExample() {
        System.out.println("Implemented abstract");
    }

    public static void main(String[] args) {
        ChildImplementedClass childImplementedClass = new ChildImplementedClass(100);
        childImplementedClass.abstractMethodExample();
        staticMethodExample();
        childImplementedClass.checkFinalMethod();
        childImplementedClass.concreteMethod();
    }
}
