package com.dyl.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dongyunlong on 2018/5/4.
 */
public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums){
        boolean res = false;
        if(nums.length > 1) {
            Set<Integer> cache = new HashSet<>((int) (nums.length * 1.5));
            for (int num : nums) {
                if (cache.contains(num)) {
                    res = true;
                    break;
                }
                cache.add(num);
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
