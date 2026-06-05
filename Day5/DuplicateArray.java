package Day5;

public class DuplicateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 4};

        int i;
        for (i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
            int j = i + 1;
            if (arr[i] == arr[j]) {
                System.out.println("duplicate element is::" + arr[i]);
            }
        }
    }
}
