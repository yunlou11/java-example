package com.dyl.array;

/**
 * Created by dongyunlong on 2018/5/3.
 */
public class RotateArray {

    public static void rotate(int[] nums, int k){
        if(nums.length == 0){
            return;
        }
        int len = nums.length;
        int preNum = nums[0]; //上次已经调整的数据内容
        int prePos = 0;  // 上次已经调整的数组位置
        int curPos = 0;  // 当前需要调整的数组位置
        int c = 0;
        while (c < len){
//            print(nums);
            int nextPos = (curPos + k) % len;
//            System.out.println(" preNum:"+ preNum+"  curPos:"+curPos +" nextPos:"+nextPos);
            int next = nums[nextPos];
            nums[nextPos] = preNum;
            preNum = next;
            curPos = nextPos;
            // 当数组长度偶数时,有可能重复调整已经调整的位置,形成一个循环,所以需要记录每次循环的起点,
            // 当返回到起点时,将该起点的下一个位置设置为新起点,从新起点重复调整过程
            if(curPos == prePos && c > 0){
                curPos++;
                prePos=curPos;
                preNum = nums[curPos];
            }
            c++;
        }
    }

    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(" " + num);
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
        rotate(nums, 45);
        print(nums);
    }
}
