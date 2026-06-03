package Day3;

import java.util.Scanner;

public class DoWhileGuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secretNumber = 7;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }

        } while (guess != secretNumber);

        System.out.println("Correct Guess!");
    }
}