package Day2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int flag = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                flag++;
                break;
            }
        }

        if (flag == 2) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }
}