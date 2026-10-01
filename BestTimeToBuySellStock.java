public class BestTimeToBuySellStock {
    public static void main(String[] args)
    {
        int[] prices = {7,1,5,3,6,4};
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++)
        {
            if (prices[i] < minPrice)
            {
                minPrice = prices[i];//1
            }
            
                int profit = prices[i] - minPrice; //6-1 = 5
                if(profit > maxProfit)
                {
                    maxProfit = profit;
                }
            
        }
        System.out.println("The maximum profit is: " + maxProfit);
    }
    
}
