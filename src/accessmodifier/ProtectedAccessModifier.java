package accessmodifier;

public class ProtectedAccessModifier {

    protected  int data_1 = 300;

    protected void method_1(){
        System.out.println("Method 1");
    }

    public static void main(String[] args) {
        ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
        protectedAccessModifier.method_1();
        System.out.println(protectedAccessModifier.data_1);
    }
}
