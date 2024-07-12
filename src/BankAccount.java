public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        balance += money;
        System.out.println(money + " deposited.");
    }

    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= money;
            System.out.println(money + " withdrawed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000.0);
        System.out.println("Current balance: " + acc.getBalance());
        System.out.println("-------------------------------------------");
        acc.deposit(1500.0);
        System.out.println("Updated balance: " + acc.getBalance());
        System.out.println("-------------------------------------------");

        acc.withdraw(500.0);
        System.out.println("Updated balance: " + acc.getBalance());
    }
}
