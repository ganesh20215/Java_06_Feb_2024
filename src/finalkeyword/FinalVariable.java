package finalkeyword;

public class FinalVariable {

    final int a;
    FinalVariable() {
        this.a = 200;
    }

    public static void main(String[] args) {
        FinalVariable finalVariable = new FinalVariable();
        System.out.println(finalVariable.a);
    }
}
