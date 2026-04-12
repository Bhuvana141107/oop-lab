class Book {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static void main(String args[]) {
        Book b = new Book();
        b.setTitle("Java Programming");

        System.out.println("Book Title: " + b.getTitle());
    }
}