class Students {

    private int age = 20;

    public void display() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.display();
    }
}