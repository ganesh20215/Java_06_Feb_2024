package array;

public class TwoDimensionalArrayOptimizedWay {

    //Define 3 rows and 4 column Array

    public static void main(String[] args) {

        int[][] a = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        for (int i = 0; i < a.length; i++) {                //row
            for (int j = 0; j < a.length; j++) {            //column
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
