package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/10.
 */
public class ReverseInteger {

    public static int reverse(int x) {
        int abs = 1;
        if(x<0){
            x = -x;
            abs = -1;
        }
        long res = 0;
        while (x>0){
            res = res * 10 + x % 10;
            x /=10;
        }
        res *= abs;
        if (res< Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            res = 0;
        }
        return (int)res;
    }

    public static void main(String[] args){
        int a = 1000;
        System.out.println(reverse(a));
        int abs = 123400;
        while(abs != 0  && abs % 10 == 0) {
            abs /= 10;
        }
        System.out.println(abs);
    }
}
