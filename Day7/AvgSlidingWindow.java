package Day7;

public class AvgSlidingWindow {
    public static void main(String[] args) {

        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / k;

        // Sliding window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];

            double currentAvg = (double) sum / k;

            if (avg < currentAvg) {
                avg = currentAvg;
            }
        }

        System.out.println("Maximum average of the subarray is: " + avg);
    }
}