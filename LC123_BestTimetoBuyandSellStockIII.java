public class LC123_BestTimetoBuyandSellStockIII {
     public static void main(String[] args)
    {
        int[] prices = {3,3,5,0,0,3,1,4};
        int maxProfit = 0;
// Output: 6
// Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
// Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
//Total 3 + 3 = 6
    
for (int i=1 ; i< prices.length; i++)
{
if (prices[i] > prices[i-1])

   
        maxProfit = maxProfit + (prices[i] - prices[i-1]);
    
}

System.out.println("Maximum profit is: " + maxProfit);
    }
}
