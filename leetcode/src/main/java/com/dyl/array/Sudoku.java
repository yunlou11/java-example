package com.dyl.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/9.
 *
 */
public class Sudoku {

    public static boolean isValidSudoku(char[][] board) {
        Map<Character, List<Integer>> cache = new HashMap<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char num = board[i][j];
                if (num != '.'){
                    if(!cache.containsKey(num)){
                        cache.put(num, new ArrayList<>());
                    }
                    cache.get(num).add(i*10+j);
                }
            }
        }
        for(Map.Entry<Character, List<Integer>> entry : cache.entrySet()){
            List<Integer> list = entry.getValue();
            for (int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    int pi = list.get(i) /10;
                    int pj = list.get(i) % 10;
                    int ci = list.get(j) / 10;
                    int cj = list.get(j) % 10;
                    if((Math.abs(ci-pi) <=2 && Math.abs(cj-pj) <=2 && cj/3 == pj/3 && ci/3 == pi/3)
                            || ci==pi || cj==pj){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] board = new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
