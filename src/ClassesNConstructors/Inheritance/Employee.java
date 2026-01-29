package ClassesNConstructors.Inheritance;

public class Employee {

    int salary = 50000;

    void empWork()
    {
        System.out.println("empWork");
    }

}

class Programmer extends Employee
{
    int bonus = 20000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.programmerWork();
        System.out.println(p.bonus);

        System.out.println(p.salary);
        p.empWork();
    }
}
