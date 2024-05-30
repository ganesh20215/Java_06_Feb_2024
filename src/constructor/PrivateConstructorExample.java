package constructor;

public class PrivateConstructorExample {


    private PrivateConstructorExample(){
        System.out.println("This is a private constructor");
    }

    public static void main(String[] args) {

        PrivateConstructorExample privateConstructorExample = new PrivateConstructorExample();
    }
}
