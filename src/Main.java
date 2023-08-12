import java.sql.Time;

public class Main {

//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed
//    because you must buy before you sell.


    // Time complexity: O(n)
    // Space complexity: O(1)
    public static int maxProfit(int[] prices) {


        // If the array is empty or its length <= 1, return 0...
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int profit = 0;
        int minBuy = prices[0];

        for (int i = 1; i < prices.length; i++) {

            // Get the minimum price to buy...
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }

            // Get maximum profit...
            if (prices[i] - minBuy > profit) {
                profit = prices[i] - minBuy;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }
}