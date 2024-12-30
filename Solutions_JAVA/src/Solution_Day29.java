package Solutions_JAVA.src;

class Solution_Day29 {
    public int findMin(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            if (arr[lo] < arr[hi])
                return arr[lo];
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[hi])
                lo = mid + 1;
            else
                hi = mid;
        }
        return arr[lo];
    }
}