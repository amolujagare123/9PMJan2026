package loops;

import java.util.Scanner;

public class SwitchDemoWithDoWhile {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        int c = 0 ;
        String operation = "";
        String choice = "";

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter a = ");
            a = sc.nextInt();

            System.out.println("Enter b = ");
            b = sc.nextInt();

            System.out.println("Enter operation = ");
            operation = sc.next();


            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.println("Do you want to continue (y/n) ? : ");
                choice = sc.next();

        }while(choice.equalsIgnoreCase("y"));

    }
}
