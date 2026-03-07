class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class TeamLead extends Employee {
    int teamSize;
    double bonus;

    TeamLead(String name, int id, double salary,
             int teamSize, double bonus) {
        super(name, id, salary);
        this.teamSize = teamSize;
        this.bonus = bonus;
    }
}

class ProjectManager extends TeamLead {
    String project;
    double budget;

    ProjectManager(String name, int id, double salary,
                   int teamSize, double bonus,
                   String project, double budget) {
        super(name, id, salary, teamSize, bonus);
        this.project = project;
        this.budget = budget;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + bonus);
        System.out.println("Project: " + project);
        System.out.println("Budget: " + budget);
    }
}

public class Main {
    public static void main(String[] args) {

        ProjectManager pm =
                new ProjectManager("Rahul", 201, 90000,
                        8, 15000,
                        "Bank App", 500000);

        pm.display();
    }
}
