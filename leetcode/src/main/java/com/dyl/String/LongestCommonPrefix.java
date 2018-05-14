package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/14.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder("");
        int length = 0;
        if(strs.length>0) {
            length = strs[0].length();
            for (int i = 1; i < strs.length; i++) {
                if (length > strs[i].length()) {
                    length = strs[i].length();
                }
            }
        }
        if(length > 0) {
            boolean share;
            for (int i = 0; i < length; i++) {
                share = true;
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].charAt(i) != c) {
                        share = false;
                        break;
                    }
                }
                if (share) {
                    res .append(c);
                } else {
                    break;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        LongestCommonPrefix lp = new LongestCommonPrefix();
        System.out.println(lp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
