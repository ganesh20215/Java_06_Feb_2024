package token.operator;

public class UnaryOperator {

    public static void main(String[] args) {

        //Postfix operator
        //1. Postfix Incremental Operator
        //2. Postfix Decremental Operator

        int a = 20;
//        int b = a++;        //Postfix Incremental Operator
        int b = a--;        //Postfix Decremental Operator
        int c = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
