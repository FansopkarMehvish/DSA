import java.util.Arrays;
import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // lowest price seen so far
        int maxProfit = 0;                // best profit seen so far
        for (int price : prices) {

            // If today's price is lower, update min
            if (price < minPrice) {
                minPrice = price;
            }
            // Else, calculate profit if selling today
            else {
                int profit = price - minPrice;

                // Update maxProfit if today's profit is better
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] prices = new int[size];
        for(int i = 0; i < size; i++){
            prices[i] = sc.nextInt();
        }
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
