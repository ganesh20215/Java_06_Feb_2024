package accessmodifier;

public class Outsider {

    public static void main(String[] args) {

        //   private access modifier
        /*PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier();
        System.out.println(privateAccessModifier.x);
        privateAccessModifier.checkMethod();*/

        //Default Access Modifier
/*        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        System.out.println(defaultAccessModifier.s);
        defaultAccessModifier.normalMethod();*/

        //public Access Modifier
/*        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        System.out.println(publicAccessModifier.y);
        publicAccessModifier.testMethodCheck();*/

        //Protected Access Modifier
        ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
        protectedAccessModifier.method_1();
        System.out.println(protectedAccessModifier.data_1);
    }
}
