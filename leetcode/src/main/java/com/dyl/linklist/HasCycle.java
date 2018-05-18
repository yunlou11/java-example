package com.dyl.linklist;

/**
 * Created by dongyunlong on 2018/5/17.
 */
public class HasCycle {

    /***
     * 判断链表是否有回环, 不使用额外空间
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        boolean res = false;
        if(head != null) {
            ListNode pre = head;
            ListNode p = pre.next;
            head.next = null;
            while (p != null) {
                if (p == head) {
                    res = true;
                    break;
                }
                ListNode tmp = p.next;
                p.next = pre;
                pre = p;
                p = tmp;
            }
        }
        return res;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l2;
        HasCycle re = new HasCycle();
        boolean res = re.hasCycle(l1);
        System.out.println(res);
    }
}
