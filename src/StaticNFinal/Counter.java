package StaticNFinal;

public class Counter {

   static int count = 0;

    Counter()
    {
        count++;
        System.out.println("count="+count);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter(); // 1
        Counter c2 = new Counter(); // 1
        Counter c3 = new Counter(); // 1
    }
}
