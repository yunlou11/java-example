package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/10.
 */
public class ReverseString {

    public static String reverseString(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] ss = s.toCharArray();
        while (start<end){
            char tmp = ss[start];
            ss[start] = ss[end];
            ss[end] = tmp;
            start++;
            end --;
        }
        return new String(ss);
    }

    public static void main(String[] args){
        System.out.println(reverseString("hello1"));
    }
}
