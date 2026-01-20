package Arrays.TwoD;

public class TwoDCharArray2 {

    public static void main(String[] args) {

        char[][] arr = {{'A','B','C',},{'d','e','f'},{'g','h','i'},{'j','k','l'}};

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
