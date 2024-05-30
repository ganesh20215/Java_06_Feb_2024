package oops.inheritance;

public class Men extends Human{         //Single Inheritance

    public static void main(String[] args) {
        Men men = new Men();
        men.walk();
        men.read();
        men.talk();
    }
}
