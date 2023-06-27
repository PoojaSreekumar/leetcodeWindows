package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MaximumStockProfit {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		// TODO Auto-generated method stub
		System.out.println(new MaximumStockProfit().maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<prices.length;i++){
            map.put(i,prices[i]);
            
        }
        int max=0;
        for(int i=0;i<prices.length;i++) {
        	
        }
       // System.out.println(map);
        
		return 0;
    }

}


class Solution {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}

 class Solution1 {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
