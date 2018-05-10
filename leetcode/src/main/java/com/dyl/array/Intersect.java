package com.dyl.array;

import java.util.*;

/**
 * Created by dongyunlong on 2018/5/7.
 *
 */
public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        Map<Integer, Integer> cache = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums1){
            if(cache.containsKey(num)){
                cache.put(num, cache.get(num)+1);
            }else{
                cache.put(num, 1);
            }
        }
        for(int num : nums2){
            if(cache.containsKey(num) && cache.get(num) > 0){
                list.add(num);
                cache.put(num, cache.get(num)-1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        int[] res = intersect(nums1, nums2);
        for(int r : res){
            System.out.println(r);
        }
    }
}
