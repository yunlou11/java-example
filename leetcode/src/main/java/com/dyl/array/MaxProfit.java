package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/2.
 */
public class MaxProfit {

    public static int maxProfit(int[] prices){
        if(prices.length==0){
            return 0;
        }
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args){
        int[] prices = new int[]{1,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
