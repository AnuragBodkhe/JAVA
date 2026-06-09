package Day8.OOPS.Constructors.example2;

import Day8.OOPS.Constructors.example2.SBI;

public class App {

    public static void main(String[] args) {

        SBI customer1 = new SBI();

        customer1.name = "Anurag";
        customer1.accNo = "SBIN09768COR";
        customer1.balance = 10000;

        customer1.showDetails();

        customer1.deposit(5000);

        customer1.withdraw(2000);

        customer1.currentBalance();

        customer1.checkAccount();

        System.out.println();

        SBI customer2 = new SBI(
                "Rahul",
                "SBIN06864BUIS",
                20000);

        customer2.showDetails();

        customer2.deposit(3000);

        customer2.currentBalance();

        System.out.println();

        SBI.bankMaiChori();
    }
}