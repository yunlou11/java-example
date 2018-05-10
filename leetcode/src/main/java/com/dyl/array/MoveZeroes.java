package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/7.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums){
        int left = 0;
        int right = left + 1;
        while (left < nums.length && right < nums.length){
            if(nums[left]==0 && nums[right] != 0){
                nums[left] = nums[right];
                nums[right] = 0;
            }
            while (left< nums.length && nums[left] != 0){
                left++;
            }
            right = left + 1;
            while (right < nums.length && nums[right] == 0){
                right++;
            }
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,0,3,2,0,1};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
