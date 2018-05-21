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

    public static TreeNode buildTree(Integer[] tree){
        int i = 0;
        Map<Integer, TreeNode> cache = new HashMap<>();
        TreeNode head=null;
        while ((2*i+2) < tree.length){
            TreeNode node;
            if(!cache.containsKey(i)) {
                node = new TreeNode(tree[i]);
                cache.put(i, node);
            }else{
                node = cache.get(i);
            }
            if(i==0){
                head = node;
            }
            int left = 2*i+1;
            int right = 2*i+2;
            if(tree[left] !=null){
                node.left = new TreeNode(tree[left]);
                cache.put(left, node.left);
            }
            if(tree[right]!=null){
                node.right = new TreeNode(tree[right]);
                cache.put(right, node.right);
            }
            i++;
        }
        return head;
    }

    private static void printTree(TreeNode head){
        if(head==null){
            return;
        }
        String left = head.left==null?"null":""+head.left.val;
        String right = head.right==null?"null":""+head.right.val;
        System.out.println(head.val+" l-> "+left);
        System.out.println(head.val+" r-> "+right);
        printTree(head.left);
        printTree(head.right);
    }

    public static void main(String[] args){
        TreeNode head = buildTree(new Integer[]{2,1,3});
        System.out.println(isValidBST(head));
        printTree(head);
    }
}
