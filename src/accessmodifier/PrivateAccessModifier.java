package accessmodifier;

public class PrivateAccessModifier {

    private int x = 400;

    private void checkMethod(){
        System.out.println("Check Method");
    }

    public static void main(String[] args) {
        PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier();
        System.out.println(privateAccessModifier.x);
        privateAccessModifier.checkMethod();
    }
}
