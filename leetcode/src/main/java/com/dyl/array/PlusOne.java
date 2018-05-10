package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/7.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits){
        int extra = 1;
        int[] res;
        for(int i = digits.length -1; i >=0; i--){
            int sum = digits[i] + extra;
            if(sum >= 10){
                digits[i] = sum % 10;
            }else{
                digits[i] = sum;
                extra = 0;
                break;
            }
        }
        if(extra > 0){
            res = new int[digits.length + 1];
            res[0] = 1;
            for(int i=0; i<digits.length; i++){
                res[i + 1] = digits[i];
            }
        }else{
            res = digits;
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{9,9,9};
        int[] res = plusOne(nums);
        for (int re : res) {
            System.out.print(re);
        }
    }
}
