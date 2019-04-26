package com.txb.linkedlist.test;

import com.txb.linkedlist.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		//²âÊÔ
		LinkedList<Integer> list = new LinkedList<Integer>();

		for(int i = 0; i < 5; i++) {
			list.addFirst(i);
			System.out.println(list);
		}
		
		list.add(2, 666);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
	}

}
