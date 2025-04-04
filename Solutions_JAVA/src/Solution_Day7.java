package Solutions_JAVA.src;

class Solution_Day7 {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        if (n == 0)
            return 0;
        int maxProfit = 0;
        for(int i =1; i<n ; i++){
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
