class Area {
    void area(int side) {
        System.out.println("Square Area: " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Rectangle Area: " + (length * breadth));
    }

    public static void main(String args[]) {
        Area obj = new Area();
        obj.area(5);
        obj.area(4, 6);
    }
}