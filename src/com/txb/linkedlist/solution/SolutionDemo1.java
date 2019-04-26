package com.txb.linkedlist.solution;
/**
 * leetCode:203
 * Remove all elements from a linked list of integers that have value val.

*Example:

*Input:  1->2->6->3->4->5->6, val = 6
*Output: 1->2->3->4->5
 * @author 13125
 *
 */
public class SolutionDemo1 {

	public ListNode removeElements(ListNode head, int val) {
		while(head != null&&head.val== val) {
			ListNode delNode = head;
			head = delNode.next;
			delNode = null;
		}
		
		if(head == null) {
			return null;
		}
		
		ListNode prev = head;
		while(prev.next != null) {
			if(prev.next.val == val) {
				ListNode delNode = prev.next;
				prev.next = delNode.next;
				delNode = null;
			}else {
				prev = prev.next;
			}
		}
		
		return head;
	}
	public static void main(String[] args) {
		
			
	}

}