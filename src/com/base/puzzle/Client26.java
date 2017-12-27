package com.base.puzzle;

import java.util.ArrayList;
import java.util.List;

public class Client26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(null);
        int count = 0;
        //包装对象与拆箱对象可以自由转换，但是要剔除null
        for (int i : list) {
        	count += i;
        }
        System.out.println(count);
	}

}
