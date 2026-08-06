public class array5 {
    public static int buyAndSellStocks(int prices[]){
        int buystock=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buystock<prices[i]){
                int profit=prices[i]-buystock;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buystock=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int[] stock={7,1,5,3,6,4};
        System.out.println(buyAndSellStocks(stock));
    }
}
