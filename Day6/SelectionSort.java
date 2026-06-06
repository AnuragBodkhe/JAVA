package Day6;

public class SelectionSort {

    static void Ssort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 9, 2, 6, 8 };

        Ssort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
