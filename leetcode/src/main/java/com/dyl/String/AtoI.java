package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/11.
 */
public class AtoI {

    // 字符串转整数
    public int myAtoi(String str) {
        int res = 0;
        str = str.trim();
        if("".equals(str)){
            return res;
        }
        boolean pn = str.charAt(0) == '+' || str.charAt(0)=='-';
        boolean isN = str.charAt(0)<='9' && str.charAt(0)>='0';
        if(pn || isN){
            int start = 0;
            boolean positive = true;
            if(pn){
                if(str.charAt(0) == '-') positive = false;
                start = 1;
            }
            long tmpRes = 0;
            int i = start;
            while (i<str.length() && str.charAt(i)<='9' && str.charAt(i)>='0'){
                tmpRes = tmpRes * 10 + (str.charAt(i) - '0');
                if(tmpRes > Integer.MAX_VALUE){
                    break;
                }
                i++;
            }
            if(!positive) tmpRes = -tmpRes;
            if(tmpRes<Integer.MIN_VALUE){
                res = Integer.MIN_VALUE;
            }else if(tmpRes>Integer.MAX_VALUE){
                res = Integer.MAX_VALUE;
            }else {
                res = (int) tmpRes;
            }

        }
        return res;
    }

    public static void main(String[] args){
        AtoI atoI = new AtoI();
        System.out.println(Integer.MIN_VALUE + "   "+Integer.MAX_VALUE);
        System.out.println(atoI.myAtoi("-2147483648"));
    }
}
