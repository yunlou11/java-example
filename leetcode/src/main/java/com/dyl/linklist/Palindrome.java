package com.dyl.linklist;

/**
 * Created by dongyunlong on 2018/5/15.
 */
public class Palindrome {
    // 回文链表   折半倒序比较

    public static boolean isPalindrome(ListNode head) {
        boolean res = true;
        int len = 0;
        for(ListNode p=head; p!=null; p=p.next){
            len ++;
        }
        if(head == null || len<2){
            return true;
        }
        ListNode h1 = head;
        ListNode h2 = h1.next;
        head.next = null;
        int half = len/2;
        for(int i=0;i<half-1;i++){
            ListNode tmp = h2.next;
            h2.next = h1;
            h1 = h2;
            h2 = tmp;
        }
        if(2 * half < len){
            h2 = h2.next;
        }
        while (h1!=null && h2 != null){
            if(h1.val != h2.val){
                res = false;
                break;
            }
            System.out.println(String.format("h1: %s == h2: %s", h1.val, h2.val));
            h1 = h1.next;
            h2 = h2.next;
        }
        return res;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(-1);
        ListNode l4 = new ListNode(-1);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        System.out.println(isPalindrome(l1));
    }
}
