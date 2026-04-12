class Person {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String args[]) {
        Person p = new Person();
        p.setAge(25);

        System.out.println("Age: " + p.getAge());
    }
}