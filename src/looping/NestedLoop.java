package looping;

public class NestedLoop {

    public static void main(String[] args) {

        //Nested for loop
        for (int i = 0; i <= 2; i++) {          // Outer loop (Row)     //3 times
            for (int j = 0; j <= 2; j++) {    // Inner Loop  (column)   //9 times
                System.out.println(i + " " + j);
            }
        }
    }
}
