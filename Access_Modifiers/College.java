class College {

    int students = 500;   // default access

    void display() {
        System.out.println("Number of students: " + students);
    }

    public static void main(String[] args) {
        College c = new College();
        c.display();
    }
}