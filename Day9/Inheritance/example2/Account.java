package Day9.Inheritance.example2;

public class Account {

    int accountNumber;
    String holderName;
    double balance;

    Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = Math.max(balance, 0);
    }

    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    void display() {
        System.out.println(accountNumber + " " +
                holderName + " " + balance);
    }
}

class SavingAccount extends Account {

    double interestRate;

    SavingAccount(int accountNumber, String holderName,
                  double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = Math.max(interestRate, 0);
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Interest Rate = " + interestRate);
        System.out.println("Interest = " + calculateInterest());
    }
}

class CurrentAccount extends Account {

    double overdraftLimit;

    CurrentAccount(int accountNumber, String holderName,
                   double balance, double overdraftLimit) {

        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    boolean canWithdraw(double amount) {
        return amount <= balance + overdraftLimit;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Overdraft Limit = " + overdraftLimit);
    }
}