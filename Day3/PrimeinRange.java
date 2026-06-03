package Day2;

public class PrimeinRange {

    public static void main(String[] args) {

        System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {

            int flag = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    flag++;
                }
            }

            if (flag == 2) {
                System.out.print(num + " ");
            }
        }
    }
}