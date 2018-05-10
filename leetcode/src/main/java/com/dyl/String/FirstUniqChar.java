package com.dyl.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/10.
 */
public class FirstUniqChar {

    public static int firstUniqChar(String s){
        int res = -1;
        Map<Character, Integer> cache = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(cache.containsKey(c)){
                cache.put(c, null);
            }else{
                cache.put(c, i);
            }
        }
        for(Map.Entry<Character, Integer> entry: cache.entrySet()){
            if(entry.getValue() != null && (res<0 || entry.getValue() < res)){
                res = entry.getValue();
            }
        }

        return res;
    }

    public static void main(String[] args){
        System.out.println(firstUniqChar(""));
    }
}
