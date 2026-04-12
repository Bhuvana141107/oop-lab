interface Vehicle {
    void run();
}

class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }

    public static void main(String args[]) {
        Vehicle obj = new Bike();
        obj.run();
    }
}