package com.dyl.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/11.
 *
 */
public class Anagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> cache = new HashMap<>(26 * 2);
        boolean res = true;
        for(char c : s.toCharArray()){
            if(cache.containsKey(c)){
                cache.put(c, cache.get(c)+1);
            }else{
                cache.put(c, 1);
            }
        }
        for(char c : t.toCharArray()){
            if(cache.containsKey(c)){
                cache.put(c, cache.get(c)-1);
            }else{
                res = false;
            }
        }
        if(res){
            for(Map.Entry<Character, Integer> entry: cache.entrySet()){
                if(entry.getValue() != 0){
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        String s = "";
        String t = "";
        System.out.println(isAnagram(s, t));
    }

}
