package Lec10;

public class stocks {

    public static void main(String[] args) {

        int buy_price=Integer.MAX_VALUE;

        int maxProfit=0;

        int profit=0;
        
        int sell_price[]={7,1,5,6,3,4};

        for(int i=0;i<sell_price.length;i++)
        {
            if(buy_price<sell_price[i])
            {
                profit=sell_price[i]-buy_price;

                maxProfit=Math.max(profit,maxProfit);
            }

            else
            {
                buy_price=sell_price[i];
            }
        }

        System.out.println("The maximum profit is "+ maxProfit);


    }
    
}
