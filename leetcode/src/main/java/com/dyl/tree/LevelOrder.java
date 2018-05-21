package com.dyl.tree;

import java.util.*;

/**
 * Created by dongyunlong on 2018/5/21.
 */
public class LevelOrder {

    /***
     * 二叉树的层次遍历
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null){
            return resList;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue.add(root);
        resList.add(new ArrayList<Integer>());
        int i = 0;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            resList.get(i).add(node.val);
            if(node.left!=null) queue1.add(node.left);
            if(node.right!=null) queue1.add(node.right);
            if(queue.isEmpty() && !queue1.isEmpty()){
                Queue<TreeNode> tmp = queue;
                queue = queue1;
                queue1 = tmp;
                i++;
                resList.add(new ArrayList<Integer>());
            }
        }
        return resList;
    }

    public static void main(String[] args){
        TreeNode head = TreeUtil.buildTree(new Integer[]{3,9,20,null,null,15,7});
        List<List<Integer>> resList = levelOrder(head);
        for(List<Integer> list : resList){
            for(int n : list){
                System.out.print(" "+n);
            }
            System.out.println();
        }
    }
}
