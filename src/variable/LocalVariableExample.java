package variable;

public class LocalVariableExample {
    int a = 100;

    public void testMethod(){
        int a = 10;         //Local Variable
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVariableExample localVariableExample = new LocalVariableExample();
        localVariableExample.testMethod();
    }
}
