package com.dyl.tree;

import com.dyl.linklist.ListNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/18.
 */
public class ValidBST {

    public static boolean isValidLeft(TreeNode root, int value){
        if(root == null){
            return true;
        }
        boolean res = root.val < value;
        boolean l = isValidLeft(root.left, value);
        boolean r = isValidLeft(root.right, value);
        return res && l &&r ;
    }

    public static boolean isValidRight(TreeNode root, int value){
        if(root == null){
            return true;
        }
        boolean res = root.val > value;
        boolean l = isValidRight(root.left, value);
        boolean r = isValidRight(root.right, value);
        return res && l && r;
    }

    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean lValid = isValidBST(root.left);
        boolean rValid = isValidBST(root.right);
        return isValidLeft(root.left, root.val) && isValidRight(root.right, root.val) && lValid && rValid;
    }



    public static void main(String[] args){
        TreeNode head = TreeUtil.buildTree(new Integer[]{2,1,3});
        System.out.println(isValidBST(head));
        TreeUtil.printTree(head);
    }
}
