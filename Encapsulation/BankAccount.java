class BankAccount {
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        BankAccount obj = new BankAccount();
        obj.setBalance(10000);

        System.out.println("Balance: " + obj.getBalance());
    }
}