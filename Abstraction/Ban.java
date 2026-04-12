abstract class Bank {
    abstract void interest();

    void display() {
        System.out.println("Bank Details");
    }
}

class HDFC extends Bank {
    void interest() {
        System.out.println("Interest rate is 8%");
    }
}
public class Ban{

    public static void main(String args[]) {
        Bank obj = new HDFC();
        obj.interest();
        obj.display();
    }
}