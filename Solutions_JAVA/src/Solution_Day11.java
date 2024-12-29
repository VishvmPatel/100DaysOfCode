package Solutions_JAVA.src;

class Solution_Day11 {
    int maxProduct(int[] arr) {
        int n = arr.length;
        int maxProduct = arr[0];
        int currentMax = arr[0];
        int currentMin = arr[0];
        for (int i = 1; i < n; i++) {
            int tempMax = currentMax;
            currentMax = Math.max(arr[i], Math.max(currentMax * arr[i], currentMin * arr[i]));
            currentMin = Math.min(arr[i], Math.min(tempMax * arr[i], currentMin * arr[i]));
            maxProduct = Math.max(maxProduct, currentMax);
        }
        return maxProduct;
    }
}
