package Arrays.TwoD;

public class TwoDIntArray2 {

    public static void main(String[] args) {
        int[][] arr = {
                {11,21,31},
                {31,61,51},
                {91,71,41},
                {19,28,37},
        };


        System.out.println("row="+arr.length);
        System.out.println("col="+arr[0].length);


        for(int i=0 ; i<4;i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
