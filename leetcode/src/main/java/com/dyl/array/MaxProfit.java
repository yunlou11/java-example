package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/2.
 */
public class MaxProfit {

    public static int maxProfit(int[] prices){
        if(prices.length==0){
            return 0;
        }
        int[] profit = new int[prices.length];
        profit[0] = 0;
        for(int i=1;i<prices.length;i++){
            profit[i] = profit[i-1];
            if(prices[i] > prices[i-1]){
                profit[i] += (prices[i] - prices[i-1]);
            }
        }
        return profit[profit.length-1];
    }

    public static void main(String[] args){
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
