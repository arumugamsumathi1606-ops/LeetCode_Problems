public class LC122_BestTimeToBuySellStockII {
    public static void main(String[] args)
    {
        int[] prices = {7,1,5,3,6,4};
       // int minPrice = prices[0]; // 7
        //buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.//fixed
        //buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.//fixed
        //buy on day 5 (price = 6) and sell on day 6 (price = 4), profit = 4-6 = -2.// not possible
//Total = 4 + 3 = 7.//fixed
        int maxProfit = 0;

        for (int i=1; i<prices.length; i++)
        {
            if ( prices[i] > prices[i-1])
            {
maxProfit = maxProfit + (prices[i] - prices[i-1]);
            }
           
}
System.out.println("Maximum profit is: " + maxProfit);
    }
}
