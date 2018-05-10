package com.dyl.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/8.
 *
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            cache.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if(cache.containsKey(num) && cache.get(num) != i){
                return new int[]{i, cache.get(num)};
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,5,5,11};
        int[] res = twoSum(nums, 10);
        for (int re : res) {
            System.out.print(re);
        }
    }
}
