import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {

        int radius = 0;

        Scanner sc = new Scanner(System.in);

        radius = sc.nextInt();

        System.out.println("Area of Circle is: " + (3.14 * radius * radius));
    }
}