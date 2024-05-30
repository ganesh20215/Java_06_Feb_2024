package constructor;

public class ParameterizedConstructor {

    int a, b, c;

    ParameterizedConstructor(int x, int y, int z){     //Parameterized constructor
        a = x;
        b = y;
        c = z;
        System.out.println(a);
        System.out.println(c);
//        System.out.println(b);
    }

    public static void main(String[] args) {

        ParameterizedConstructor parameterizedConstructor = new ParameterizedConstructor(100, 200, 700);
        ParameterizedConstructor parameterizedConstructor1 = new ParameterizedConstructor(300, 400, 800);
    }
}
