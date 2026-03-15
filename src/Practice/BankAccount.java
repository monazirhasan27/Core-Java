package Practice;

public class BankAccount {

    private double balance;

    BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("deposited: " + amount);
        } else {
            System.out.println("Invalid");
        }
    }

    void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Withdwarn " + amount);
        } else {
            System.out.println("Invalid");
        }

    }

    double getBalance() {
        return balance;
    }


    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        System.out.println("Total Balance " + account.getBalance());

        account.deposit(1000);

        System.out.println("Total Balance" + account.getBalance());

        account.withdraw(2000);
        System.out.println("Total Balance " + account.getBalance());

    }
}