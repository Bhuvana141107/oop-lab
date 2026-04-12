class Product {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String args[]) {
        Product obj = new Product();
        obj.setPrice(1500);

        System.out.println("Price: " + obj.getPrice());
    }
}