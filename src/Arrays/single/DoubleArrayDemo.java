package Arrays.single;

public class DoubleArrayDemo {

    public static void main(String[] args) {

        double[] db = {2.1, 2.2, 2.3, 2.4, 2.5};

        System.out.println("Length of the double array: " + db.length);

        for (int i = 0; i < db.length; i++) {
            System.out.println(db[i]);
        }

        System.out.println("Below is the array printed with for each loop");

        for (double d :db)
            System.out.println(d);
    }
}
