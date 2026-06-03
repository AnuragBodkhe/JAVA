package Day2;

public class DiamondPattern {

    public static void main(String[] args) {
        int line = 5;

        // Upper part
        for (int row = 1; row <= line; row++) {

            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (1 * row - 1); star++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for (int row = line - 1; row >= 1; row--) {

            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (1 * row - 1); star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}