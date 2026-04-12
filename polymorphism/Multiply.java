class Multiply {
    int mul(int a, int b) {
        return a * b;
    }

    int mul(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String args[]) {
        Multiply obj = new Multiply();
        System.out.println(obj.mul(2, 3));     
        System.out.println(obj.mul(2, 3, 4));  
    }
}