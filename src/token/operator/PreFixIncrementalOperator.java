package token.operator;

public class PreFixIncrementalOperator {

    public static void main(String[] args) {

        //Prefix operator
        //1. Prefix Incremental Operator
        //2. Prefix Decremental Operator

        int a = 20;
//        int b = ++a;        //Prefix Incremental Operator
        int b = --a;        //Prefix Decremental Operator
        int c = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
