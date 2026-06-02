package Day1.Conditional_Statements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.err.println("1.Parantha 2.Chai 3.Sandwitch 4.hwa khanni hai");

        Scanner obj = new Scanner(System.in);

        int option = obj.nextInt();

        switch (option) {
            case 1:
                System.out.println("Lo ji parantha");

            case 2:
                System.out.println("Lo ji chai ");
                break;
            case 3:
                System.out.println("Lo ji sandwitch");
                break;
            case 4:
                System.out.println("Hwa khanni hai toh side mai baith");
                break;
            default:
                System.out.println("Abe andha hai kyaaa!!!");
                break;
        }
    }
}