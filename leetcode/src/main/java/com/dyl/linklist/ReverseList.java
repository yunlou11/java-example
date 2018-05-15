package com.dyl.linklist;

/**
 * Created by dongyunlong on 2018/5/15.
 */
public class ReverseList {

    // 反转链表 迭代实现
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode res = head;
        ListNode curNode= head.next;
        res.next = null;
        while (curNode!=null){
            ListNode tmp = curNode;
            curNode = curNode.next;
            tmp.next = res;
            res = tmp;
        }
        return res;
    }
    // 递归实现
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode res = reverseList2(head.next);
        ListNode node;
        node=res;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;
        head.next = null;
        return res;
    }

    public static void main(String[] args){
        ReverseList rl = new ReverseList();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode res = rl.reverseList2(l1);

        for(ListNode l=res;l!=null;l=l.next){
            System.out.print(l.val +" ");
        }
    }
}
