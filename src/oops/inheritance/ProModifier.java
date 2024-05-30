package oops.inheritance;

import accessmodifier.ProtectedAccessModifier;

public class ProModifier extends ProtectedAccessModifier{

    public static void main(String[] args) {

        ProModifier proModifier = new ProModifier();
        proModifier.method_1();
        System.out.println(proModifier.data_1);
    }
}
