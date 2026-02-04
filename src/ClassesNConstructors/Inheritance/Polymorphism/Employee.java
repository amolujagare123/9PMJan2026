package ClassesNConstructors.Inheritance.Polymorphism;

public class Employee {

    int salary = 50000;

    void empWork()
    {
        System.out.println("empWork");
    }

    void calculateSalary()
    {
        System.out.println("Employee calculateSalary");
    }

}

class Programmer extends Employee
{
    // @Override
    void calculateSalary() // overridden method
    {
        System.out.println("Programmer calculateSalary");
    }

    int bonus = 20000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }



    public static void main(String[] args) {

        Programmer p = new Programmer();

      //  Programmer p1 ; // object reference or reference variable

        p.programmerWork();
        System.out.println(p.bonus);

        System.out.println(p.salary);
        p.empWork();

        Employee e = new Programmer(); // up-casting

        e.calculateSalary(); // call the overridden method


    }
}
