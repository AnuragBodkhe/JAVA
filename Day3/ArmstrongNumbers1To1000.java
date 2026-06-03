package Day3;

public class ArmstrongNumbers1To1000 {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers from 1 to 100:");

        for (int num = 1; num <= 1000; num++) {

            int temp = num;
            int count = 0;
            int sum = 0;

            // Count digits
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }

            temp = num;

            // Calculate Armstrong sum
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, count);
                temp = temp / 10;
            }

            // Check Armstrong
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}