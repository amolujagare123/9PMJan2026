package Arrays.TwoD;

public class TwoDIntArray1 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        arr[0][0] = 11;
        arr[0][1] = 21;
        arr[0][2] = 31;

        arr[1][0] = 12;
        arr[1][1] = 23;
        arr[1][2] = 34;

        arr[2][0] = 42;
        arr[2][1] = 53;
        arr[2][2] = 64;

        arr[3][0] = 46;
        arr[3][1] = 57;
        arr[3][2] = 68;

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
