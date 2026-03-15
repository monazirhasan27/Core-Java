package CoreJavaPractice;

public class BankAccount1 {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount1(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public double deposit(double amount){

        if(amount < 0){
            System.out.println("Invalid Deposit Amount");
        }
        else{
            balance += amount;
        }

        return balance;
    }

    public double withdraw(double amount){

        if(amount <= 0){
            System.out.println("Invalid Withdraw Amount");
        }

        else if(amount > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
        }

        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {

       BankAccount1 bankAccount1 = new BankAccount1("12345", "Bob");

        bankAccount1.deposit(-500);
        bankAccount1.deposit(1000);
        bankAccount1.withdraw(500);

        System.out.println(bankAccount1.getBalance());

    }
}
