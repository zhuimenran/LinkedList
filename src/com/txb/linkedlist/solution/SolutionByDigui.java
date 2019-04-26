package com.txb.linkedlist.solution;
/**
 * 用递归解决将链表中所有的val给删除了
 * @author 13125
 *
 */
public class SolutionByDigui {

	public ListNode removeElements(ListNode head, int val) {
		if(head == null) {
			return head;
		}
		
		ListNode res = removeElements(head.next, val);
		
		
		if(head.val == val) {
			return res;
		}else {
			head.next = res;
			return head;
		}
	}
	public static void main(String[] args) {
		int []nums = {1,2,35,6,2};
		ListNode head =new ListNode(nums);
			
		System.out.println(head);
		
		ListNode res = (new SolutionDemo1()).removeElements(head, 2);
		System.out.println(res);

	}

}
