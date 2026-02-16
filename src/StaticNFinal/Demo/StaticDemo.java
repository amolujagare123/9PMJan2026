package StaticNFinal.Demo;


import StaticNFinal.Student2;

import static StaticNFinal.Student2.staticMethod1;
import static StaticNFinal.Student2.staticMethod2;
import static StaticNFinal.Student2.college;

public class StaticDemo {
    public static void main(String[] args) {

        Student2 s = new Student2();
        s.college = "college name";

        s.staticMethod1();
        s.staticMethod2(); // static method can be called using object

        Student2.staticMethod1(); // static method can be called using Class name
        Student2.staticMethod2();
        Student2.college = "college name";
        staticMethod1();
        staticMethod2();
        college = "college name";
    }



}
