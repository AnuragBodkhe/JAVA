import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Enter your name:");

        Scanner input = new Scanner(System.in);

        String name = "";

        name = input.next();

        System.out.println("My name is " + name);

        System.out.println("Enter your age:");
        int age = 0;
        age = input.nextInt();
        
        System.out.println("My age is " + age);

    }
}
