package Lec10;

public class max_profit {

    public static int max(int prices[], int maxProfit,int profit)
    {
        for(int i=0;i<prices.length;i++)
        {
             for(int j=i+1;j<prices.length;j++)
             {
                if(prices[j]>prices[i])
                 {
                    profit=prices[j]-prices[i];

                      if(profit>maxProfit)
                      {
                        maxProfit=profit;
                      }
                 }
             }
        }
        return maxProfit;

    }
    public static void main(String[] args) 
    {
        int prices[]={7, 6, 4,  3, 1};

        System.out.println(max(prices, 0, 0));

    
  }
}
