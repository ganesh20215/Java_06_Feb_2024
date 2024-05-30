package array;

public class TwoDimensionalArray {

    public static void main(String[] args) {

/*        int[][] a;      //This is most recommandable
        int [][] b;
        int c[][];
        int d [][];
        int e [] [];*/
//        int f[] g[];      //Invalid Array


        int[][] a = new int[3][3];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;


/*        for(int[] arr : a){
            System.out.println(arr);
        }*/

        for (int i = 0; i < a.length; i++) {                //row
            for (int j = 0; j < a.length; j++) {            //column
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
