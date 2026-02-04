package StaticNFinal;

public class Counter {

   static int count = 0;
   int x;
    Counter()
    {
      //  count++;
        System.out.println("count="+count);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter(); // 0
        Counter c2 = new Counter(); // 0
        Counter c3 = new Counter(); // 0
    }
}
