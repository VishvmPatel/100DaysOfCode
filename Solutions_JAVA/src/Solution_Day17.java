class Solution_Day17 {
    static char nonRepeatingChar(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (frequency[c - 'a'] == 1) {
                return c;
            }
        }
        return '$';
    }
}
