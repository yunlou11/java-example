package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/2.
 */
public class RemoveDuplicatesArray {

    public static int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int pivot = nums[nums.length-1] + 1;
        int s = 0;
        int c = s + 1;
        int length = nums.length;
        while(s < nums.length && c < nums.length){
            if(nums[s] == nums[c]){
                nums[c] = pivot;
                length --;
            }else{
                s = c;
            }
            c++;
        }
        s=0;
        c=s;
        while(s<nums.length && c<nums.length ){
            if(nums[s] == pivot && nums[c] != pivot){
                if(s < c) {
                    nums[s] = nums[c];
                    nums[c] = pivot;
                }else{
                    c = s;
                }
            }
            if(nums[s] != pivot){
                s++;
            }
            if(nums[c] == pivot){
                c++;
            }

        }
        return length;
    }

    public static void main(String[] args){
        int[] a = new int[]{1, 2, 2};
        System.out.println(removeDuplicates(a));
        for (int i : a) {
            System.out.println(i);
        }
    }
}
