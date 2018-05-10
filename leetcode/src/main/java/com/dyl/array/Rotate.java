package com.dyl.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dongyunlong on 2018/5/10.
 */
public class Rotate {

    public static void rotate(int[][] matrix) {
        if(matrix.length<2){
            return;
        }
        int length = matrix.length;
        int i=0,j=0,c=0,pre = matrix[i][j];
        int si=i,sj=j;
        int level = 1;
        while (c < length * length){
            int ni = j;
            int nj = length - i - 1;
            System.out.println(String.format("%2d: (%s, %s) -> (%s, %s)",c,i,j,ni,nj));
            int tmp = matrix[ni][nj];
            matrix[ni][nj] = pre;
            pre = tmp;
            i = ni;
            j = nj;
            if(i==si && j==sj){
                j++;
                if(j == length - level) {
                    i = level;
                    j = level;
                    level++;
                }
                pre = matrix[i][j];
                si=i;
                sj=j;
            }
            c++;
        }
    }

    public static void main(String[] args){
        int[][] matrix = new int[][]{
                {1}
        };
        rotate(matrix);
        for (int[] ints : matrix) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(String.format("%3d", anInt));
            }
        }
    }
}
