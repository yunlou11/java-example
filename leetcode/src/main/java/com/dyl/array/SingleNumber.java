package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/4.
 *
 */
public class SingleNumber {

    public static int singleNumber(int[] nums){
        int xor = nums[0];
        for(int i=1;i<nums.length;i++){
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args){
        int[] nums = new int[]{4,4,1,1,3};
        System.out.println(singleNumber(nums));
    }
}
