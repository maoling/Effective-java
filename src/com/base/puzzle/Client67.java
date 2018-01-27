package com.base.puzzle;

import java.util.List;
import java.util.RandomAccess;

public class Client67 {

	public static int average(List<Integer> list) {
		int sum = 0;
		if (list instanceof RandomAccess) {
			//ArrayList
			for (int i=0,size = list.size();i<size;i++) {
				sum += list.get(i);
			}
		} else {
			//LinkedList  ÓÐÐò´æ´¢£»foreach·½Ê½
			for (int i : list) {
				sum += i;
			}
		}
		return sum / list.size();		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
