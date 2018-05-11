package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/11.
 */
public class Palindrome {

    public boolean isPalindrome(String s) {
        if(s==null || "".equals(s)){
            return true;
        }
        s = s.toLowerCase();
        char[] array = new char[s.length()];
        int i =0;
        for(char c : s.toCharArray()){
            if((c>='a' && c<='z') || (c>='0' && c<='9')) {
                array[i] = c;
                i++;
            }
        }
        int ps = 0,pe = i-1;
        while (ps < pe){
            if(array[ps] != array[pe]){
                return false;
            }else{
                ps++;
                pe--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome("race a car"));
    }
}
