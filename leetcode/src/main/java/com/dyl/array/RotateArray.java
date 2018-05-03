package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/3.
 */
public class RotateArray {

    public static void rotate(int[] nums, int k){
        int len = nums.length;
        int preNum = nums[0];
        int curPos = 0;
        int c = 0;
        while (c < len){
            int nextPos = (curPos + k) % len;
            int next = nums[nextPos];
            nums[nextPos] = preNum;
            preNum = next;
            curPos = nextPos;
            c++;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(" " + num);
        }
    }
}
