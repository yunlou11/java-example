package com.dyl.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dongyunlong on 2018/5/21.
 */
public class TreeUtil {

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

    public static void printTree(TreeNode head){
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
}
