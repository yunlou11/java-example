package com.dyl.linklist;

/**
 * Created by dongyunlong on 2018/5/15.
 */
public class RemoveNthFromEnd {

    // 删除链表的倒数第N个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpHead = new ListNode(-1);
        tmpHead.next = head;
        ListNode parent = tmpHead;
        ListNode delNode = parent.next;
        ListNode endNode = delNode;
        int gap = 1;
        while (endNode.next != null){
            if(gap == n){
                parent = parent.next;
                delNode = delNode.next;
            }else {
                gap++;
            }
            endNode = endNode.next;
        }
        parent.next = delNode.next;
        return tmpHead.next;
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
        RemoveNthFromEnd re = new RemoveNthFromEnd();
        ListNode res = re.removeNthFromEnd(l1, 2);

        for(ListNode l=res;l!=null;l=l.next){
            System.out.print(l.val +" ");
        }
    }
}
