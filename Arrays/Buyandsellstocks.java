public class Buyandsellstocks {
    public static int  Stockmarket(int prices[]){
        int buyprices = Integer.MAX_VALUE;
        //int sellingprice = 0;
        int maxprofit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyprices < prices[i]){
                int profit = prices[i]-buyprices;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buyprices = prices[i];
            }
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int prices [] ={7,1,5,3,6,4};
        System.out.println(Stockmarket(prices));
    }
}
