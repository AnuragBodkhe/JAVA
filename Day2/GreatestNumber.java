package Day2;

public class GreatestNumber {
    public static void main(String[] args) {

        int input = 123456789;
        int greatest = 0;

        while (input != 0) {

            int digit = input % 10;

            if (digit > greatest) {
                greatest = digit;
            }

            input = input / 10;
        }

        System.out.println("Greatest digit is: " + greatest);
    }
}