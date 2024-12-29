package Solutions_JAVA.src;

class Solution_Day28 {
    int countFreq(int[] arr, int target) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                res++;
        }
        return res;
    }
}