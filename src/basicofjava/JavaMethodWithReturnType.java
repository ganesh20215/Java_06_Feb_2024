package basicofjava;

public class JavaMethodWithReturnType {


    public int multiplication(int a, int b, int c){
        int multi = a * b * c;
        return multi;
    }

    public static void main(String[] args) {

        JavaMethodWithReturnType javaMethodWithReturnType = new JavaMethodWithReturnType();
        int multi = javaMethodWithReturnType.multiplication(2, 3, 4);
        System.out.println(multi);
    }
}
