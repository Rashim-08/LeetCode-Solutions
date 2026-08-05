class Solution {
    public int maxProfit(int[] p) {
        int min=p[0];
        int cost;
        int profit=0;
        for(int i:p){
            min=Math.min(min,i);
            cost=i-min;
            profit=Math.max(profit,cost);
        }
        return profit;
    }
}
