package accessmodifier;

public class DefaultAccessModifier {

    int s = 500;

    void normalMethod(){
        System.out.println("Normal Method");
    }

    public static void main(String[] args) {
        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
        System.out.println(defaultAccessModifier.s);
        defaultAccessModifier.normalMethod();
    }
}
