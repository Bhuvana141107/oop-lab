class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Student extends Person {
    String department;
    double cgpa;

    Student(String name, int id, String dept, double cgpa) {
        super(name, id);
        this.department = dept;
        this.cgpa = cgpa;
    }
}

class ResearchScholar extends Student {
    String topic;
    String guide;

    ResearchScholar(String name, int id, String dept, double cgpa,
                    String topic, String guide) {
        super(name, id, dept, cgpa);
        this.topic = topic;
        this.guide = guide;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Topic: " + topic);
        System.out.println("Guide: " + guide);
    }
}

public class Institution {
    public static void main(String[] args) {

        ResearchScholar rs =
                new ResearchScholar("Anita", 101, "CSE", 8.9,
                        "AI Optimization", "Dr. Rao");

        rs.display();
    }
}
