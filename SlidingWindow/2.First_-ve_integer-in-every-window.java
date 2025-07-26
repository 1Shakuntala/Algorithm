import java.util.*;

public class FirstNegativeInWindow {

    public static List<Integer> firstNegativeInWindow(int[] arr, int k) {
        int i = 0, j = 0;
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        while (j < n) {
            // Step 1: Add negative number to queue
            if (arr[j] < 0) {
                q.add(arr[j]);
            }

            // Step 2: Expand the window
            if (j - i + 1 < k) {
                j++;
            }

            // Step 3: When window size hits k
            else if (j - i + 1 == k) {
                if (q.isEmpty()) {
                    result.add(0);  // No negative in current window
                } else {
                    result.add(q.peek());  // First negative number
                    if (arr[i] == q.peek()) {
                        q.poll();  // Remove from queue if it's exiting the window
                    }
                }
                i++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        List<Integer> result = firstNegativeInWindow(arr, k);

        System.out.println("First negative integer in every window of size " + k + ":");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
