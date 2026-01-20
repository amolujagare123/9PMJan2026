package Arrays.TwoD;

public class TwoDDoubleArray2 {

    public static void main(String[] args) {

            double[][] arr={ {3.2,3.8,5.5},
                    {2.2,5.1,4.2},
                    {4.2,1.2,5.5},
                    {4.2,1.5,3.2}}

                    ;



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
