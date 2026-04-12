class Bank {
    int getRate() {
        return 5;
    }
}

class SBI extends Bank {
    int getRate() {
        return 7;
    }
}

public class BankTest {
    public static void main(String args[]) {
        Bank obj = new SBI();
        System.out.println(obj.getRate());
    }
}