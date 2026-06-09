package Day8.OOPS.Constructors.example2;

public class SBI {

    String name;
    String accNo;
    double balance;

    // Default Constructor
    SBI() {
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    SBI(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void currentBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void checkAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Type: Saving");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }

    static void bankMaiChori() {
        System.out.println("Bank Mai Chori!");
    }
}