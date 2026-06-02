package Day1.Conditional_Statements;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        int balanace = 1000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");

        int amt = sc.nextInt();

        if (balanace >= amt) {
            System.out.println(amt + " Amt debited - avl balance is " + (balanace - amt));
        } else {
            System.out.println("Chal bee Gareeb!!!!");
        }
    }
}
