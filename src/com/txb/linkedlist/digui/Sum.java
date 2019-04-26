package com.txb.linkedlist.digui;
/**
 * 递归求数组和
 * @author 13125
 *@time 2019.4.26
 */
public class Sum {
	public static int sum(int []arr) {
		return sum(arr,0);
	}
	
	//计算[l,n)的和
	public static int sum(int []arr, int l) {
		if(l == arr.length) {
			return 0;
		}
		
		return arr[l] + sum(arr,l+1);
	}
	
	public static void main(String[] args) {
		int []arr = {1,4,7,9,0,9};
		int sum_arr = sum(arr);
		System.out.println(sum_arr);
	}

}
