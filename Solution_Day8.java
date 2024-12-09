class Solution_Day8 {
    public int maximumProfit(int prices[]) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            minPrice = Math.min(minPrice,price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}