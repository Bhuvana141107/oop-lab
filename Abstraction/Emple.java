abstract class Employee {
    abstract void salary();

    void work() {
        System.out.println("Employee is working");
    }
}

class Developer extends Employee {
    void salary() {
        System.out.println("Developer salary is 50000");
    }
}
  public class Emple{
    public static void main(String args[]) {
        Employee obj = new Developer();
        obj.salary();
        obj.work();
    }
}