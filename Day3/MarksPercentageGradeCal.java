package Day1.Conditional_Statements;

import java.util.Scanner;

public class MarksPercentageGradeCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        int outOf = 500;

        // Input marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculate percentage
        double percentage = (total * 100.0) / outOf;

        // Grade calculation
        String grade;

        if (percentage >= 90) {
            grade = "A- naam roshan krega tu bete!!";
        } else if (percentage >= 80) {
            grade = "B- sharma ji ke bacche ki grades dekh terese jyada aaye hai!!";
        } else if (percentage >= 70) {
            grade = "C- c***ya hai tu";
        } else if (percentage >= 60) {
            grade = "D- Dumb kahi ka!!";
        } else {
            grade = "F- fail hai tu ghar ja!!!";
        }

        // Display result
        System.out.println("\n----- RESULT -----");

        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Out Of: " + outOf);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}