package Day2;

import java.util.Scanner;

public class BankWhileLoop {
    public static void main(String[] args) {

        int balance = 2000;
        Scanner obj = new Scanner(System.in);
        int option = 0;

        while (option != 5) {

            System.out.println("\n1.Withdrawl 2.Deposit 3.CurrentBalance 4.FD 5.Exit");
            option = obj.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the amt to withdraw");
                    int amt = obj.nextInt();

                    if (balance >= amt) {
                        balance -= amt;
                        System.out.println(amt + " is debited from your account");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.println("Enter the amt to deposit");
                    int amtToDeposit = obj.nextInt();

                    balance += amtToDeposit;
                    System.out.println("Amount Deposited Successfully");
                    break;

                case 3:
                    System.out.println("Current Balance = " + balance);
                    break;

                case 4:
                    System.out.println("Enter the time to deposit your money");
                    int time = obj.nextInt();

                    System.out.println("Your amt after " + time +
                            " years will be " +
                            (balance + (balance * 7 * time) / 100));
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Abe andha hai kyaaa!!!");
                    break;
            }
        }
    }
}