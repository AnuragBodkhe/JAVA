package Day2;

public class ReverseLeftPyramid {

    public static void main(String[] args) {

        for (int rows = 5; rows >= 1; rows--) {
            for (int col = 1; col <= rows; col++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}