package Solutions_JAVA.src;

class Solution_Day12 {
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;
        int maxKadane = kadane(arr, n);
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        int[] invertedArr = new int[n];
        for (int i = 0; i < n; i++) {
            invertedArr[i] = -arr[i];
        }
        int minKadane = kadane(invertedArr, n);
        if (totalSum + minKadane == 0) {
            return maxKadane;
        }
        int maxCircular = totalSum + minKadane;
        return Math.max(maxKadane, maxCircular);
    }
    private int kadane(int[] arr, int n) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for (int i = 1; i < n; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}