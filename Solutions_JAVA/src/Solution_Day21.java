class Solution_Day21 {
    public void sort012(int[] arr) {
        int n = arr.length;
        int a = 0;
        int b = n - 1;
        int mid = 0, temp = 0;
        while (mid <= b) {
            if (arr[mid] == 0) {
                swap(arr, mid, a);
                a++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, b);
                b--;
            }
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}