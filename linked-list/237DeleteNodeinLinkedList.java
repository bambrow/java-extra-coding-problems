/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 本题不放置在linked-list文件夹中。这种方式其实是有很大问题的。
// 首先无法删除最后一个节点。
// 本质并不是删除了node，而是把node下一个节点改变，然后删除了下一个节点，在实际应用中可能会出现很大问题。

public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}