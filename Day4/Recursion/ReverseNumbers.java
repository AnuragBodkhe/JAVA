package Day4.Recursion;

public class ReverseNumbers {

    static int reverse = 0;

    static int reverseNumber(int n) {

        if (n == 0) {
            return reverse;
        }

        reverse = reverse * 10 + (n % 10);

        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(123));
    }
}