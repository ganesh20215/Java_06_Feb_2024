package oops.encapsulation;

public class EncapsulationExample {

    public static void main(String[] args) {

/*        ReadOnlyClass readOnlyClass = new ReadOnlyClass();
        System.out.println(readOnlyClass.getX());
        System.out.println(readOnlyClass.getName());*/

        WriteOnlyClass writeOnlyClass = new WriteOnlyClass();
        writeOnlyClass.setCompany("TCS");
        writeOnlyClass.setA(300);
        System.out.println(writeOnlyClass.getA());
        System.out.println(writeOnlyClass.getCompany());
    }
}
