package Day6;

class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int n = arr1.length;
        int m = arr2.length;

        int resultantArr[] = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i]<arr2[j]){
                resultantArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                resultantArr[k] = arr2[j];
                j++;
                k++;
            }

        }
        while (i < n) resultantArr[k++] = arr1[i++];
        while (j < m) resultantArr[k++] = arr2[j++];

        for (i = 0; i < n + m; i++) {
            System.out.print(resultantArr[i] + " ");
        }

     }

}