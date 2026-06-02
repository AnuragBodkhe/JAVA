package Day2;

public class PascalsTrianglePattern {

    public static void main(String[] args) {
        int line = 4;

        for (int row = 1; row <= line; row++) {

            // Print spaces
            for (int space = 1; space <= line - row; space++) {
                System.out.print(" ");
            }

            // Print stars with spaces
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}