package Day6;

public class InsertionSort {
    static void Isort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 9, 2, 6, 8, 3, 4 };

        Isort(arr);
        for (int item : arr){
            System.out.print(item + " ");
        }
    }
}
