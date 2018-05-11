package com.dyl.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/11.
 *
 */
public class Anagram {

    /***
     * 第一种方法, 直接count每个字符出现的次数是否相同
     * 第二种, 使用hash map
     * @param s 字符串
     * @param c 需要统计出现次数的字符
     * @return 字符在字符串中出现的次数
     */
    public int countChar(String s, char c){
        int count = 0;
        for(char sc : s.toCharArray()){
            if (sc == c){
                count++;
            }
        }
        return count;
    }

    public boolean isAnagram01(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for (char c='a';c<'z';c++){
            int sc = countChar(s, c);
            int tc = countChar(t, c);
            if(sc != tc){
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram02(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        while (i<s.length()){
            if (a[i] != b[i]){
                return false;
            }
            i++;
        }
        return true;
    }



    public boolean isAnagram(String s, String t) {
        return isAnagram02(s, t);
    }

    public static void main(String[] args){
        Anagram anagram = new Anagram();
        String s = "a";
        String t = "b";
        System.out.println(anagram.isAnagram(s, t));
    }

}
