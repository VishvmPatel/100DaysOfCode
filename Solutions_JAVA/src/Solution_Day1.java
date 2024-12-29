package Solutions_JAVA.src;

class Solution_Day1 {
    public int getSecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num < max1) {
                max2 = num;
            }
        }
        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }
}