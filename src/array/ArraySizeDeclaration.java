package array;

public class ArraySizeDeclaration {

    public static void main(String[] args) {

        int[] x = {'a', 'b', 10};

        float[] y = {10.5f, 20, 'c'};

        long[] z = {100, 20, 'c'};

        double[] t = {200, 100.5f, 'd'};

        for (float a : y){
            System.out.println(a);
        }
    }
}
