public class Car {

    public String brand = "Toyota";

    public void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}