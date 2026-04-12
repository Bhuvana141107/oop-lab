class Employee {
    void salary() {
        System.out.println("Employee Salary");
    }
}

class Manager extends Employee {
    void salary() {
        System.out.println("Manager Salary");
    }
}
public class Emp{
    public static void main(String args[]) {
        Employee obj = new Manager();
        obj.salary();
    }
}