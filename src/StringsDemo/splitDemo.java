package StringsDemo;

public class splitDemo {

    public static void main(String[] args) {

        String str ="My job is to test";
      //  String[] stArr = str.split(" ");

        String[] stArr = str.split("o");

        for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);
    }
}
