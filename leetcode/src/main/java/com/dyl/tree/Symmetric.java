package com.dyl.tree;

/**
 * Created by dongyunlong on 2018/5/21.
 */
public class Symmetric {

    public static String subTree(TreeNode root, boolean leftFirst){
        if(root==null){
            return "null";
        } else if(root.left==null && root.right==null){
            return ""+root.val;
        }
        String left = subTree(root.left, leftFirst);
        String right = subTree(root.right, leftFirst);
        if(leftFirst){
            return root.val + left + right;
        }else {
            return root.val + right + left;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        boolean res = false;
        if(root == null || root.left==null && root.right==null){
            return true;
        }
        String left = subTree(root.left, true);
        String right = subTree(root.right, false);
        System.out.println(left + "  "+ right);
        if(left.equals(right)){
            res = true;
        }
        return res;
    }

    public static void main(String[] args){
        TreeNode head = TreeUtil.buildTree(new Integer[]{2,3,3,4,5,5,4,null,null,8,9,9,8});
        System.out.println(isSymmetric(head));
    }
}
