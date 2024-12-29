package Solutions_JAVA.src;

import java.util.Arrays;

class Solution_Day9 {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;
        Arrays.sort(arr);
        int diff = arr[n - 1] - arr[0];
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;
        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);
            if (minHeight < 0) continue;
            diff = Math.min(diff, maxHeight - minHeight);
        }
        return diff;
    }
}