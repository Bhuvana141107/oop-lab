public class Student{
static int rollcounter=101;
int roll;
String name;
String course;
Student(){
roll=0;
name="Unassigned";
course="General";
}
Student(String name,String course){
roll=rollcounter++;
this.name=name;
this.course=course;
}
Student(Student s){
roll=s.rollcounter++;
this.name=s.name;
this.course=s.course;
}
void display() {
        System.out.println("Roll: " + roll +
                " Name: " + name +
                " Course: " + course);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student("Anita", "Java");
        Student enroll=new Student("Suma","python");

        Student s3 = new Student(enroll);

        s1.display();
        s2.display();
        s3.display();
    }
}



