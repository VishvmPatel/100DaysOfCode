package Solutions_JAVA.src;

class Solution_Day19 {
    public static int minChar(String s) {
        int n = s.length();
        String combined = s + "#" + new StringBuilder(s).reverse().toString();
        int[] lps = computeLPSArray(combined);
        return n - lps[combined.length() - 1];
    }
    private static int[] computeLPSArray(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}