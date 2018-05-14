package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/14.
 */
public class CountAndSay {

    public String countAndSay(int n) {

        String res = "1";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<n;i++){
            int j = 0;
            int c = 1;
            int count = 1;
            while (c<res.length()){
                if(res.charAt(c) == res.charAt(j)){
                    count++;
                }else{
                    sb.append(count).append(res.charAt(j));
                    j=c;
                    count = 1;
                }
                c++;
            }
            if(count>0){
                sb.append(count).append(res.charAt(j));
            }
            res = sb.toString();
            sb.delete(0, sb.length());
        }
        return res;
    }

    public static void main(String[] args){
        CountAndSay cs = new CountAndSay();
        System.out.println(cs.countAndSay(5));
    }
}
