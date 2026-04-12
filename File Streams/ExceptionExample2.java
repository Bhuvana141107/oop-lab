class ExceptionExample2 {
    public static void main(String args[]) {
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        }

        System.out.println("Program continues");
    }
}