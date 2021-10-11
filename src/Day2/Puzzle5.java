package Day2;

public class Puzzle5 {

    public static int maxProfit(int[] stockPrices){
        // Create a variable of profit made currently whilst traversing array
        int currentProfit = 0;
        // Also create a variable to store the smallest value seen in array
        int minStockValue = Integer.MAX_VALUE;
        // Iterate over all prices in the array
        for ( int i = 0; i < stockPrices.length; i++){
            // If the current price is smaller than the minimum seen to date,
            // want to reset minStock value to the price we are on currently
            if(stockPrices[i] < minStockValue){
                minStockValue = stockPrices[i];
            }
            // If we are not seeing a smaller value than the current smallest stored price,
            // then want to calculate the profit that would be made on this current element
            else {
                // Update the current profit variable, and using the Math.max method,
                // which takes the larger of two entered values.
                currentProfit = Math.max(currentProfit, stockPrices[i] - minStockValue);
            }
        }
        // return maximum possible profit to be made in array
        return currentProfit;
    }
}
