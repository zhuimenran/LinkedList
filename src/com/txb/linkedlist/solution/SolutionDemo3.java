package com.txb.linkedlist.solution;

/**
 * 使用虚拟头节点
 * @author 13125
 *
 */
public class SolutionDemo3 {
	
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummyHead = new ListNode(-1);
		dummyHead.next = head;
	
		//不需要去考虑删除头节点的问题
		ListNode prev = dummyHead;
		while(prev.next != null) {
			if(prev.next.val == val) {
				prev.next = prev.next.next;
			}else {
				prev = prev.next;
			}
		}
		
		return dummyHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
