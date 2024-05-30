package accessmodifier;

public class PublicAccessModifier {

    public int y = 600;

    public void testMethodCheck(){
        System.out.println("test method check");
    }

    public static void main(String[] args) {
        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        System.out.println(publicAccessModifier.y);
        publicAccessModifier.testMethodCheck();

    }
}
