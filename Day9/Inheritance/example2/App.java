package Day9.Inheritance.example2;

public class App {

    public static void main(String[] args) {

        Account arr[] = {

                new SavingAccount(101, "Anurag", 10000, 5),

                new CurrentAccount(102, "Rahul", 15000, 5000),

                new SavingAccount(103, "Pankaj", 8000, 4),

                new CurrentAccount(104, "Rohit", 20000, 10000)
        };

        double totalBalance = 0;

        double max = arr[0].balance;
        double min = arr[0].balance;

        int savingCount = 0;
        int currentCount = 0;

        for (Account a : arr) {

            a.display();

            if (a instanceof SavingAccount) {

                SavingAccount s = (SavingAccount) a;

                System.out.println("Interest Rate = "
                        + s.interestRate);

                System.out.println("Interest = "
                        + s.calculateInterest());

                savingCount++;
            }

            if (a instanceof CurrentAccount) {

                CurrentAccount c = (CurrentAccount) a;

                System.out.println("Overdraft Limit = "
                        + c.overdraftLimit);

                System.out.println("Can Withdraw 18000 = "
                        + c.canWithdraw(18000));

                currentCount++;
            }

            System.out.println();

            totalBalance += a.balance;

            if (a.balance > max)
                max = a.balance;

            if (a.balance < min)
                min = a.balance;
        }

        System.out.println("Total Balance = " + totalBalance);
        System.out.println("Maximum Balance = " + max);
        System.out.println("Minimum Balance = " + min);
        System.out.println("Total Saving Accounts = " + savingCount);
        System.out.println("Total Current Accounts = " + currentCount);
    }
}