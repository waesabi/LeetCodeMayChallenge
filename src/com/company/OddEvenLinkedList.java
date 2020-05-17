package com.company;

/*
    Problem link - https://leetcode.com/problems/odd-even-linked-list/
    Accepted
 */
public class OddEvenLinkedList {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode listNode = new ListNode(arr[i]);
            temp.next = listNode;
            temp = listNode;
        }

        ListNode res = oddEvenList(head);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
        System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) { return null; }
        ListNode x = head;
        ListNode first = head;
        ListNode fast = head;

        ListNode second = null;
        ListNode temp = null;
        while (fast != null && fast.next != null) {
            ListNode slow = fast.next;
            if (temp == null) {
                temp = slow;
                second = temp;
            }
            else {
                temp.next = slow;
                temp = slow;
            }
            fast = fast.next.next;
            first.next = fast;
            first = fast;
        }
        if (temp != null) {
            temp.next = null;
        }
        while (x.next != null) {
            x = x.next;
        }
        x.next = second;

        return head;
    }
}
