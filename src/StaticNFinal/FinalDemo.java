package StaticNFinal;

public final class FinalDemo {

    /*final*/ int speed = 200;

    /*final*/ void change()
    {
        speed = 300;
    }

    public static void main(String[] args) {

        FinalDemo ob = new FinalDemo();

        ob.change();

        System.out.println(ob.speed);
    }
}

class ChildFinal /*extends FinalDemo*/
{
    void change()
    {
        System.out.println("Child - change method");
    }
}
