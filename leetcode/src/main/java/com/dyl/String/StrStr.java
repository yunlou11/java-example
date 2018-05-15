package com.dyl.String;

/**
 * Created by dongyunlong on 2018/5/11.
 */
public class StrStr {

    // 子串出现第一个位置
    public int strStr(String haystack, String needle) {
        int index = -1;
        if( needle == null  || "".equals(needle)){
            index = 0;
        }else{
            int l1 = haystack.length();
            int l2 = needle.length();
            for (int ps=0;ps <= l1 - l2;ps++){
                if(haystack.charAt(ps) == needle.charAt(0)){
                    boolean match = true;
                    for(int i=1;i<l2;i++){
                        if(haystack.charAt(ps+i) != needle.charAt(i)){
                            match = false;
                            break;
                        }
                    }
                    if(match){
                        index = ps;
                        break;
                    }
                }
            }

        }
        return index;
    }
    public static void main(String[] args){
        StrStr strStr = new StrStr();
        System.out.println(strStr.strStr(                "mississippi"
                , "issi"));
    }
}
