package oops.encapsulation;

public class ReadOnlyClass {

    private int x = 100;        //Data Hiding
    private String name = "Edso Services";

    public int getX() {
        return x;
    }

    public String getName() {
        return name;
    }
}
