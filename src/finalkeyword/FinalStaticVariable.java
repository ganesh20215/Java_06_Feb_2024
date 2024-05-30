package finalkeyword;

public class FinalStaticVariable {

    final static int s;

    FinalStaticVariable(){

    }

    static {
        s = 500;
    }

    public static void main(String[] args) {
        System.out.println(s);
    }
}
