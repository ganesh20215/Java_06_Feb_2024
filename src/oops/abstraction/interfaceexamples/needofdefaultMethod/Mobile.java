package oops.abstraction.interfaceexamples.needofdefaultMethod;

public interface Mobile {

    void feature();

    void color();
    void look();
    void camera();

    static void staticMethod(){
        System.out.println("Static Method");
    }
    default void refreshRate(){
        System.out.println("Refresh Rate 120 GHZ");
    }

    private void privateMethod(){
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
//        Mobile mobile = new Mobile();
        staticMethod();
    }
}
