package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;

public class ListRemove {

	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");list.add("2");
		for(String a : list) {
		    if ("2".equals(a)) {
		    	list.remove(a);
		    }
		}
		System.out.println(list.toString());
	}
}
