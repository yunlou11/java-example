package com.dyl.tree;

/**
 * Created by dongyunlong on 2018/5/18.
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        return Math.max(lDepth + 1, rDepth + 1);
    }

    public static void main(String[] args){
        TreeNode n3 = new TreeNode(3);
        TreeNode n9 = new TreeNode(9);
        TreeNode n20 = new TreeNode(20);
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        n3.left = n9;
        n3.right = n20;
        n20.left = n15;
        n20.right = n7;

        MaxDepth md = new MaxDepth();
        System.out.println(md.maxDepth(n3));
    }
}
