package com.txb.linkedlist.util;

public class LinkedList <E>{
	//节点类
	private class Node{
		public E e;
		public Node next;
		
		//构造函数
		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		
		//构造函数
		public Node(E e) {
			this.e = e;
			this.next = null;
		}
		
		public Node(){
			this.e = null;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return e.toString();
		}
	}
	
	//存储虚拟头节点
	private Node dummyHead;//虚拟头节点
	//节点数量
	private int size;
	
	//构造函数，设置虚拟头节点
	public LinkedList(){
		dummyHead = new Node(null, null);
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	//向链表头部添加节点
	public void addFirst(E e) {
//		Node node = new Node(e);
//		node.next = head;//添加的节点的next指向头指针。
//		head = node;
		
		add(0,e);
	}
	
	//向链表的中间添加节点
	public void add(int index, E e) {
		
		if(index<0 || index>size) {
			throw new IllegalArgumentException("index 不正确");
		}
		
	
		Node prev = dummyHead;
			
		for(int i = 0 ; i < index; i ++) {
			prev = prev.next;
		}
			
//			Node node = new Node(e);
//			node.next = prev.next;
//			prev.next = node;
			
			prev.next = new Node(e, prev.next);
			size++;
	}
	
	//向链表末尾添加节点
	public void addLast(E e) {
		add(size,e);
	}
	
	//
	public E get(int index) {
		if(index<0 || index>=size) {
			throw new IllegalArgumentException("index 不正确");
		}
		
		Node cur = dummyHead.next;
		
		for(int i = 0; i < index; i ++) {
			cur = cur.next;
		}
		
		return cur.e;
	}
	
	//
	public E getLast() {
		return get(size-1);
	}
	
	//
	public E getFirst() {
		return get(0);
	}
	
	//set
	public void set(int index, E e) {
		
		if(index<0 || index>=size) {
			throw new IllegalArgumentException("index 不正确");
		}
		
		Node cur = dummyHead.next;
		for(int i = 0; i < index; i ++) {
			cur = cur.next;
		}
		cur.e = e;
	}
	
	//查找
	public boolean contains(E e) {
		Node cur = dummyHead.next;
		//修改bug cur.equals(e)
		while(cur != null) {
			if(cur.e.equals(e)) {
				return true;
			}
			cur  = cur.next;
		}
		
		return false;
	}
	
	//toString
	public String toString() {
		Node cur = dummyHead.next;
		StringBuilder builder = new StringBuilder();
		
		while(cur != null) {
			builder.append(cur+"->");
			cur = cur.next;
		}
		
		builder.append("NULL");
		return builder.toString();
	}
	
	//删除
	public E remove(int index) {
		
		if(index<0 || index>=size) {
			throw new IllegalArgumentException("index 不正确");
		}
		
		Node prev = dummyHead;
		for(int i = 0 ; i < index ; i ++) {
			prev = prev.next;//指向被删除节点的前一个节点
		}
		
		Node ret = prev.next;
		prev.next = ret.next;//前一节点指向后一节点
		
		size--;
		return ret.e;
	}
	
	//
	public E removeFirst() {
		return remove(0);
	}
	
	//
	public E removeLast() {
		return remove(size-1);
	}
	
	public void removeElement(E e) {
        Node pre = dummyHead;
        while (pre.next != null) {
            if (pre.next.e.equals(e)) {
                break;//找到了要删除元素的前一个元素，
            }
            pre = pre.next;
        }

        //执行删除操作。
        if (pre.next != null) {
            Node deleNode = pre.next;
            pre.next = deleNode.next;
            deleNode.next = null;
        }
    }
}
