package Day2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input = obj.nextInt();

        int original = input;
        int sum = 0;

        while (input != 0) {

            int digit = input % 10;
            sum = sum + (digit * digit * digit);
            input = input / 10;
        }

        if (sum == original) {
            System.out.println(original + " is Armstrong Number");
        } else {
            System.out.println(original + " is Not Armstrong Number");
        }
    }
}