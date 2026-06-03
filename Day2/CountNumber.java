package Day2;

public class CountNumber {
    public static void main(String[] args) {
        int input = 123456789;
        int count = 0;

        while (input != 0) {
            count++;
            input = input / 10;
        }
        System.out.println("Number of digits: " + count);

    }
}
