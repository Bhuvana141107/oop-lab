interface Calculator {
    void add(int a, int b);
}

class Demo implements Calculator {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String args[]) {
        Calculator obj = new Demo();
        obj.add(5, 10);
    }
}